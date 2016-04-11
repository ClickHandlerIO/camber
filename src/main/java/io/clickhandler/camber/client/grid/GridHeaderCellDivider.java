package io.clickhandler.camber.client.grid;

import io.clickhandler.materialUiGwt.client.Checkbox;
import elemental.client.Browser;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

public class GridHeaderCellDivider extends Component<GridHeaderCellDivider.Props, GridHeaderCellDivider.State> {

    @Inject
    Checkbox checkbox;

    @Inject
    public GridHeaderCellDivider() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return
                div($ -> {
                            $.className("cell-divider");

                            $.onMouseDown(e -> {
//                                log.trace("Mouse Down");
                                e.preventDefault();
                                e.stopPropagation();
                                $this.setState(s -> s.setMouseDown(true));
                            });
                        },
                        div($ -> $.className("divider-viz"))
                );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this, Props props, State state) {
        super.componentDidMount($this, props, state);

        Browser.getWindow().addEventListener("mouseup", event -> {
            if ($this.state().isMouseDown()) {
//                log.trace("DROPPED!", event);
                event.preventDefault();
                event.stopPropagation();
            }
            $this.setState(s -> s.setMouseDown(false));
        }, false);

        Browser.getWindow().addEventListener("mousemove", event -> {
            if ($this.state().isMouseDown()) {
                event.preventDefault();
                event.stopPropagation();
                if ($this.props().getMovementXHandler() != null) {
                    $this.props().getMovementXHandler().run(((GridMouseEvent) event).getMovementX());
                }

            }
        }, false);
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
        Func.Run1<Double> getMovementXHandler();

        @JsProperty
        void setMovementXHandler(Func.Run1<Double> resizeHandler);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        boolean isMouseDown();

        @JsProperty
        void setMouseDown(boolean mouseDown);
    }
}
