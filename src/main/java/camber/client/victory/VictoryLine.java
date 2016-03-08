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
        public Object[] getData();

        @JsProperty
        public void setData(Object[] data);

        @JsProperty
        public Object getDomain();

        @JsProperty
        public void setDomain(Object domain);

        @JsProperty
        public double getHeight();

        @JsProperty
        public void setHeight(double height);

        @JsProperty
        public double getWidth();

        @JsProperty
        public void setWidth(double width);

        @JsProperty
        public String getInterpolation();

        @JsProperty
        public void setInterpolation(String interpolation);

        @JsProperty
        public Object getLabel();

        @JsProperty
        public void setLabel(Object label);

        @JsProperty
        public Object getPadding();

        @JsProperty
        public void setPadding(Object padding);

        @JsProperty
        public Object getSamples();

        @JsProperty
        public void setSamples(Object samples);

        @JsProperty
        public Object getScale();

        @JsProperty
        public void setScale(Object scale);

        @JsProperty
        public boolean isStandalone();

        @JsProperty
        public void setStandalone(boolean standalone);

        @JsProperty
        public Object getStyle();

        @JsProperty
        public void setStyle(Object style);

        @JsProperty
        public Object getX();

        @JsProperty
        public void setX(Object x);

        @JsProperty
        public Object getY();

        @JsProperty
        public void setY(Object y);

        @JsProperty
        public MouseEventHandler getOnClick();

        @JsProperty
        public void setOnClick(MouseEventHandler onClick);


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
