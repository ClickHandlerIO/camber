package camber.client.victory;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * this is an animation class, like the label it can be used with the other charts
 */
public class VictoryAnimation extends ExternalComponent<VictoryAnimation.Props> {

    @Inject
    public VictoryAnimation() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryAnimation;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        double velocity;
        String easing;
        double delay;
        Object[] data;

        Func.Run onEnd;




    }
}
