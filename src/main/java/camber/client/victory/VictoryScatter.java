package camber.client.victory;

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
 * these libraries are in alpha and may be updated soon
 */
public class VictoryScatter extends ExternalComponent<VictoryScatter.Props> {

    @Inject
    public VictoryScatter() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryScatter;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        VictoryAnimation animate;
//        String bubbleProperty;
//        Object[] data;
//        Object domain; // object with a min and max, examples ['a', 'z'], {x: [0, 100], y: [0, 1]}
//        double height;
//        double width;
//        ReactElement labelComponent;
//        double maxBubbleSize;
//        Object padding; // number or object
//        Object samples;
//        Object scale;
//        boolean showLabels;
//        Object size;
//        boolean standalone;
//        String symbol;
//        Object style;
//        Object x; // can be string or function also
//        Object y;
//        MouseEventHandler onClick;


        @JsProperty
        VictoryAnimation getAnimate();

        @JsProperty
        void setAnimate(VictoryAnimation animate);

        @JsProperty
        String getBubbleProperty();

        @JsProperty
        void setBubbleProperty(String bubbleProperty);

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
        ReactElement getLabelComponent();

        @JsProperty
        void setLabelComponent(ReactElement labelComponent);

        @JsProperty
        double getMaxBubbleSize();

        @JsProperty
        void setMaxBubbleSize(double maxBubbleSize);

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
        boolean isShowLabels();

        @JsProperty
        void setShowLabels(boolean showLabels);

        @JsProperty
        Object getSize();

        @JsProperty
        void setSize(Object size);

        @JsProperty
        boolean isStandalone();

        @JsProperty
        void setStandalone(boolean standalone);

        @JsProperty
        String getSymbol();

        @JsProperty
        void setSymbol(String symbol);

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
        default Props bubbleProperty(final String bubbleProperty) {
            setBubbleProperty(bubbleProperty);
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
        default Props labelComponent(final ReactElement labelComponent) {
            setLabelComponent(labelComponent);
            return this;
        }

        @JsOverlay
        default Props maxBubbleSize(final double maxBubbleSize) {
            setMaxBubbleSize(maxBubbleSize);
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
        default Props showLabels(final boolean showLabels) {
            setShowLabels(showLabels);
            return this;
        }

        @JsOverlay
        default Props size(final Object size) {
            setSize(size);
            return this;
        }

        @JsOverlay
        default Props standalone(final boolean standalone) {
            setStandalone(standalone);
            return this;
        }

        @JsOverlay
        default Props symbol(final String symbol) {
            setSymbol(symbol);
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
