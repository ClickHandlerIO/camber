package camber.client.grid;

import camber.client.materialUi.FlatButton;
import camber.client.materialUi.icons.ChevronLeftSvgIcon;
import camber.client.materialUi.icons.ChevronRightSvgIcon;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.Component;
import io.clickhandler.web.react.ReactComponent;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.web.dom.DOM.div;

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
