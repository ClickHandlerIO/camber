package io.clickhandler.camber.client.grid;

import io.clickhandler.materialUiGwt.client.Checkbox;
import io.clickhandler.materialUiGwt.client.icons.ArrowDropDownSvgIcon;
import io.clickhandler.materialUiGwt.client.icons.ArrowDropUpSvgIcon;
import elemental.html.DivElement;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.dom.StyleProps;
import io.clickhandler.reactGwt.client.react.*;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.reactGwt.client.dom.DOM.div;
import static io.clickhandler.reactGwt.client.dom.DOM.span;

public class GridHeaderCell extends Component<GridHeaderCell.Props, GridHeaderCell.State> {
    private Ref<DivElement> divRef = Ref.make();

    @Inject
    Checkbox checkbox;
    @Inject
    ArrowDropUpSvgIcon arrowDropUpSvgIcon;
    @Inject
    ArrowDropDownSvgIcon arrowDropDownSvgIcon;
    @Inject
    GridHeaderCellDivider gridHeaderCellDivider;

    @Inject
    public GridHeaderCell() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        GridColumn c = $this.getProps().getColumn();

        return div($ -> {
                    $.ref(divRef);
                    $.className("header-cell" + (!c.isAllowSort() ? " not-sortable" : ""));

                    StyleProps s = new StyleProps();
                    s.overflow("hidden");
                    s.minWidth(c.getDisplay().getMinWidth() == null ? 0 : c.getDisplay().getMinWidth() + "px");
                    if (c.getDisplay().getWidth() != null) {
                        s.width(c.getDisplay().getWidth() + "px");
                    } else {
                        s.flexGrow(c.getDisplay().getFlexGrow());
                        s.flexShrink(c.getDisplay().getFlexShrink());
                        s.flexBasis(c.getDisplay().getFlexBasis());
                    }
                    $.style(s);
                },
                span($ -> {
                            // handle sort
                            $.className("title-span");
                            $.onClick(e -> {
                                GridColumn c2 = $this.getProps().getColumn();
                                if (!c2.isAllowSort()) {
                                    return;
                                }

                                GridSort updatedSort;
                                if (c2.getSort() == null) {
                                    c2.setSort(GridSort.NONE);
                                }

                                switch (c2.getSort()) {
                                    case NONE:
                                        updatedSort = GridSort.DESC;
                                        break;
                                    case ASC:
                                        updatedSort = GridSort.NONE;
                                        break;
                                    case DESC:
                                        updatedSort = GridSort.ASC;
                                        break;
                                    default:
                                        updatedSort = GridSort.NONE;
                                        break;
                                }

                                if ($this.getProps().getOnSortChanged() != null) {
                                    $this.getProps().getOnSortChanged().run(c2, updatedSort);
                                }
                            });
                        },
                        c.getTitle()
                ),
                c.getSort() == null || c.getSort().equals(GridSort.NONE) ? null : c.getSort().equals(GridSort.ASC) ? arrowDropUpSvgIcon.$($ -> $.setColor("#5f5f5f")) : arrowDropDownSvgIcon.$($ -> $.setColor("#5f5f5f"))
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        GridColumn getColumn();

        @JsProperty
        void setColumn(GridColumn column);

        @JsProperty
        Func.Run2<GridColumn, GridSort> getOnSortChanged();

        @JsProperty
        void setOnSortChanged(Func.Run2<GridColumn, GridSort> onSortChanged);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
