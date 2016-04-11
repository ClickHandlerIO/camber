package io.clickhandler.camber.client.grid;

import io.clickhandler.materialUiGwt.client.FlatButton;
import io.clickhandler.materialUiGwt.client.icons.ChevronLeftSvgIcon;
import io.clickhandler.materialUiGwt.client.icons.ChevronRightSvgIcon;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

public class GridSimplePager extends Component<GridSimplePager.Props, GridSimplePager.State> {

    @Inject
    FlatButton flatButton;
    @Inject
    ChevronLeftSvgIcon chevronLeftSvgIcon;
    @Inject
    ChevronRightSvgIcon chevronRightSvgIcon;

    @Inject
    public GridSimplePager() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return div($ -> $.className("grid-simple-pager"),
                flatButton.$($ -> {
                    $.setStyle(new CSSProps().marginRight("10px"));
                    $.setDisabled(!props.isPreviousEnabled());
                    $.setLabel("Prev");
                    $.setIcon(chevronLeftSvgIcon.$());
                    $.setLabelPosition("after");
                    $.onTouchTap(() -> {
                        if (props.getOnPreviousPage() != null) {
                            props.getOnPreviousPage().run();
                        }
                    });
                }),
                flatButton.$($ -> {
                    $.setDisabled(!props.isNextEnabled());
                    $.setLabel("More");
                    $.setIcon(chevronRightSvgIcon.$());
                    $.setLabelPosition("before");
                    $.onTouchTap(() -> {
                        if (props.getOnNextPage() != null) {
                            props.getOnNextPage().run();
                        }
                    });
                })
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
        boolean isPreviousEnabled();

        @JsProperty
        void setPreviousEnabled(boolean previousEnabled);

        @JsProperty
        boolean isNextEnabled();

        @JsProperty
        void setNextEnabled(boolean nextEnabled);

        @JsProperty
        Func.Run getOnNextPage();

        @JsProperty
        void setOnNextPage(Func.Run onNextPage);

        @JsProperty
        Func.Run getOnPreviousPage();

        @JsProperty
        void setOnPreviousPage(Func.Run onPreviousPage);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
