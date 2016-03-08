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
public class VictoryPie extends ExternalComponent<VictoryPie.Props> {

    @Inject
    public VictoryPie() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryPie;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        VictoryAnimation animate;
//        Object colorScale; // string, or array of css colors
//        Object[] data;
//        double endAngle;
//        double height;
//        double width;
//        double innerRadius;
//        ReactElement labelComponent;
//        double padAngle;;
//        Object padding; // double or shape object
//        boolean standalone;
//        double startAngle;
//        // maybe - handle style, it's more complex here
//        Object style;
//        Object x; // can be string or function also
//        Object y;
//        MouseEventHandler onClick;


        @JsProperty
        VictoryAnimation getAnimate();

        @JsProperty
        void setAnimate(VictoryAnimation animate);

        @JsProperty
        Object getColorScale();

        @JsProperty
        void setColorScale(Object colorScale);

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        double getEndAngle();

        @JsProperty
        void setEndAngle(double endAngle);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getInnerRadius();

        @JsProperty
        void setInnerRadius(double innerRadius);

        @JsProperty
        ReactElement getLabelComponent();

        @JsProperty
        void setLabelComponent(ReactElement labelComponent);

        @JsProperty
        double getPadAngle();

        @JsProperty
        void setPadAngle(double padAngle);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        boolean isStandalone();

        @JsProperty
        void setStandalone(boolean standalone);

        @JsProperty
        double getStartAngle();

        @JsProperty
        void setStartAngle(double startAngle);

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
        default Props colorScale(final Object colorScale) {
            setColorScale(colorScale);
            return this;
        }

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props endAngle(final double endAngle) {
            setEndAngle(endAngle);
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
        default Props innerRadius(final double innerRadius) {
            setInnerRadius(innerRadius);
            return this;
        }

        @JsOverlay
        default Props labelComponent(final ReactElement labelComponent) {
            setLabelComponent(labelComponent);
            return this;
        }

        @JsOverlay
        default Props padAngle(final double padAngle) {
            setPadAngle(padAngle);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props standalone(final boolean standalone) {
            setStandalone(standalone);
            return this;
        }

        @JsOverlay
        default Props startAngle(final double startAngle) {
            setStartAngle(startAngle);
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
