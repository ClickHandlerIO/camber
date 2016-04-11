package io.clickhandler.camber.client.grid;

import io.clickhandler.materialUiGwt.client.Checkbox;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import java.util.List;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

public class GridHeader extends Component<GridHeader.Props, GridHeader.State> {

    @Inject
    Checkbox checkbox;
    @Inject
    GridHeaderCell gridHeaderCell;

    @Inject
    public GridHeader() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return div($ -> $.className("grid-header"),
                headerChildren -> {
                    if (props.isReorderEnabled()) {
                        headerChildren.add(div($ -> $.className("reorder-placeholder")));
                    }

                    if (props.isSelectionEnabled()) {
                        headerChildren.add(
                                div($ -> $.className("checkbox"),
                                        checkbox.$($ -> {
                                            $.setChecked(props.isAllSelected());
                                            $.setOnCheck(() -> {
                                                if (props.getOnAllSelectedChanged() != null) {
                                                    $this.props().getOnAllSelectedChanged().run(!$this.props().isAllSelected());
                                                }
                                            });
                                        })
                                )
                        );
                    }

                    headerChildren.add(
                            div($ -> $.className("header-row-container"),
                                    rowContainerChildren -> {
                                        for (double i = 0.; i <= state.getMaxRowIdx(); ++i) {
                                            final double j = i;
                                            rowContainerChildren.add(
                                                    div($ -> $.className("header-row"),
                                                            rowChildren -> {
                                                                for (GridColumn c : $this.props().getColumns()) {
                                                                    if (c.getDisplay().getRow() == j) {
                                                                        rowChildren.add(
                                                                                gridHeaderCell.$($ -> {
                                                                                    $.setColumn(c);
                                                                                    $.setOnSortChanged((c2, sort) -> {
                                                                                        if ($this.props().getOnSortChanged() != null) {
                                                                                            $this.props().getOnSortChanged().run(c2, sort);
                                                                                        }
                                                                                    });
                                                                                })
                                                                        );
                                                                    }
                                                                }
                                                            }
                                                    )
                                            );
                                        }
                                    }
                            )
                    );
                }
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props curProps, Props nextProps) {
        super.intakeProps($this, curProps, nextProps);

        // get row count
        double maxRowIdx = 0.;
        if (nextProps.getColumns() != null) {
            for (GridColumn c : nextProps.getColumns()) {
                maxRowIdx = c.getDisplay().getRow() > maxRowIdx ? c.getDisplay().getRow() : maxRowIdx;
            }
        }

        final double finalMaxRowIdx = maxRowIdx;
        $this.setState(s -> s.setMaxRowIdx(finalMaxRowIdx));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isSelectionEnabled();

        @JsProperty
        void setSelectionEnabled(boolean selectionEnabled);

        @JsProperty
        boolean isReorderEnabled();

        @JsProperty
        void setReorderEnabled(boolean reorderEnabled);

        @JsProperty
        boolean isAllSelected();

        @JsProperty
        void setAllSelected(boolean allSelected);

        @JsProperty
        List<GridColumn> getColumns();

        @JsProperty
        void setColumns(List<GridColumn> columns);

        @JsProperty
        Func.Run1<Boolean> getOnAllSelectedChanged();

        @JsProperty
        void setOnAllSelectedChanged(Func.Run1<Boolean> onAllSelectedChanged);

        @JsProperty
        Func.Run2<GridColumn, GridSort> getOnSortChanged();

        @JsProperty
        void setOnSortChanged(Func.Run2<GridColumn, GridSort> onSortChanged);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        double getMaxRowIdx();

        @JsProperty
        void setMaxRowIdx(double maxRowIdx);
    }
}
