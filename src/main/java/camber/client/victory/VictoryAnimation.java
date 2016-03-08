package camber.client.victory;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
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
    public interface Props extends BaseProps {
//        double velocity;
//        String easing;
//        double delay;
//        Object[] data;
//
//        Func.Run onEnd;


        @JsProperty
        double getVelocity();

        @JsProperty
        void setVelocity(double velocity);

        @JsProperty
        String getEasing();

        @JsProperty
        void setEasing(String easing);

        @JsProperty
        double getDelay();

        @JsProperty
        void setDelay(double delay);

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        Func.Run getOnEnd();

        @JsProperty
        void setOnEnd(Func.Run onEnd);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props velocity(final double velocity) {
            setVelocity(velocity);
            return this;
        }

        @JsOverlay
        default Props easing(final String easing) {
            setEasing(easing);
            return this;
        }

        @JsOverlay
        default Props delay(final double delay) {
            setDelay(delay);
            return this;
        }

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props onEnd(final Func.Run onEnd) {
            setOnEnd(onEnd);
            return this;
        }


    }
}
