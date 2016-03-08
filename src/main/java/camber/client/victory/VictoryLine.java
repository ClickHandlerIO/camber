package camber.client.victory;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * these libraries are in alpha and may be updated soon
 */
public class VictoryLine extends ExternalComponent<VictoryLine.Props> {

    @Inject
    public VictoryLine() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryLine;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        VictoryAnimation animate;
//        Object[] data;
//        Object domain; // object with a min and max, examples ['a', 'z'], {x: [0, 100], y: [0, 1]}
//        double height;
//        double width;
//        String interpolation;
//        Object label;
//        Object padding; // double or shape object
//        Object samples;
//        Object scale;
//        boolean standalone;
//        // possibly - handle style, it's more complex here
//        Object style;
//        Object x; // can be string or function also
//        Object y;
//        MouseEventHandler onClick;

        @JsProperty
        VictoryAnimation getAnimate();

        @JsProperty
        void setAnimate(VictoryAnimation animate);

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        Object getDomain();

        @JsProperty
        void setDomain(Object domain);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        String getInterpolation();

        @JsProperty
        void setInterpolation(String interpolation);

        @JsProperty
        Object getLabel();

        @JsProperty
        void setLabel(Object label);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        Object getSamples();

        @JsProperty
        void setSamples(Object samples);

        @JsProperty
        Object getScale();

        @JsProperty
        void setScale(Object scale);

        @JsProperty
        boolean isStandalone();

        @JsProperty
        void setStandalone(boolean standalone);

        @JsProperty
        Object getStyle();

        @JsProperty
        void setStyle(Object style);

        @JsProperty
        Object getX();

        @JsProperty
        void setX(Object x);

        @JsProperty
        Object getY();

        @JsProperty
        void setY(Object y);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props animate(final VictoryAnimation animate) {
            setAnimate(animate);
            return this;
        }

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props domain(final Object domain) {
            setDomain(domain);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props interpolation(final String interpolation) {
            setInterpolation(interpolation);
            return this;
        }

        @JsOverlay
        default Props label(final Object label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props samples(final Object samples) {
            setSamples(samples);
            return this;
        }

        @JsOverlay
        default Props scale(final Object scale) {
            setScale(scale);
            return this;
        }

        @JsOverlay
        default Props standalone(final boolean standalone) {
            setStandalone(standalone);
            return this;
        }

        @JsOverlay
        default Props style(final Object style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props x(final Object x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default Props y(final Object y) {
            setY(y);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
