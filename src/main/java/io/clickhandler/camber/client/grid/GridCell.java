package io.clickhandler.camber.client.grid;

import io.clickhandler.materialUiGwt.client.Checkbox;
import io.clickhandler.materialUiGwt.client.icons.DragHandleSvgIcon;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import java.util.List;

import static io.clickhandler.reactGwt.client.dom.DOM.div;


public abstract class GridCell<D, P extends GridCell.Props<D>, S extends GridCell.State> extends Component<P, S> {

    @Inject
    Checkbox checkbox;
    @Inject
    DragHandleSvgIcon dragHandleSvgIcon;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<P, S> $this, P props, S state) {
        return div($ -> $.className("grid-cell" + " " + (props.getClassName() != null ? props.getClassName() : "") + (props.isSelected() ? " selected" : "")),
                childList -> {
                    if (props.isReorderEnabled()) {
                        childList.add(
                                div($ -> $.className("reorder"),
                                        dragHandleSvgIcon.$()
                                )
                        );
                    }

                    if (props.isSelectionEnabled()) {
                        childList.add(
                                div($ -> $.className("checkbox"),
                                        checkbox.$($ -> {
                                            $.setChecked(props.isSelected());
                                            $.setOnCheck(() -> {
                                                if (props.getOnSelectionChanged() != null) {
                                                    $this.props().getOnSelectionChanged().run($this.props().getData(), !props.isSelected());
                                                }
                                            });
                                        })
                                )
                        );
                    }

                    childList.add(
                            renderCell($this, props.getData(), props.getColumns())
                    );
                }
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected abstract ReactElement renderCell(ReactComponent<P, S> $this, D data, List<GridColumn> columns);

    protected CSSProps applyColumnSizing(CSSProps style, String columnId, List<GridColumn> columns) {
        if (style == null) {
            style = new CSSProps();
        }

        if (columnId == null || columnId.isEmpty() || columns == null || columns.isEmpty()) {
            return style;
        }

        GridColumn column = null;
        for (GridColumn c : columns) {
            if (c.getId() != null && c.getId().equals(columnId)) {
                column = c;
                break;
            }
        }

        if (column == null) {
            return style;
        }

        GridColumn.Display display = column.getDisplay();
        if (display == null) {
            return style;
        }

//        style.overflow("hidden");
        style.minWidth(display.getMinWidth() == null ? 0 : display.getMinWidth() + "px");
        if (display.getWidth() != null) {
            style.width(display.getWidth() + "px");
        } else {
            style.flexGrow(display.getFlexGrow());
            style.flexShrink(display.getFlexShrink());
            style.flexBasis(display.getFlexBasis());
        }
        return style;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props<D> extends BaseProps {
        @JsProperty
        boolean isSelectionEnabled();

        @JsProperty
        void setSelectionEnabled(boolean selectionEnabled);

        @JsProperty
        boolean isReorderEnabled();

        @JsProperty
        void setReorderEnabled(boolean reorderEnabled);

        @JsProperty
        boolean isSelected();

        @JsProperty
        void setSelected(boolean selected);

        @JsProperty
        Func.Run2<D, Boolean> getOnSelectionChanged();

        @JsProperty
        void setOnSelectionChanged(Func.Run2<D, Boolean> onSelectionChanged);

        @JsProperty
        D getData();

        @JsProperty
        void setData(D data);

        @JsProperty
        List<GridColumn> getColumns();

        @JsProperty
        void setColumns(List<GridColumn> columns);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
