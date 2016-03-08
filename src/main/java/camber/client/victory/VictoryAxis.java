package camber.client.victory;

import io.clickhandler.web.dom.CSSProps;
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
public class VictoryAxis extends ExternalComponent<VictoryAxis.Props> {

    @Inject
    public VictoryAxis() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryAxis;
    }-*/;

    // todo - handle style, it's more complex here, once library stabilizes we can implement more specific objects as well

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        VictoryAnimation animate;
//        boolean crossAxis;
//        boolean dependentAxis;
//        double[] domain; // a 2 element array with the min and max expected values for your axis
//        double height;
//        double width;
//        Object label; // can be a string or label component
//        double labelPadding;
//        double offsetX;
//        double offsetY;
//        String orientation; // one of 'top' 'bottom' 'left' 'right'
//        Object padding; // can be a double or an object with top: left: etc. double values
//        String scale; // can be something else but don't use it that way
//        boolean standalone; // use false here to make them composable, ie. have an x and y axis
//        double tickCount;
//        String[] tickFormat;
//        Object[] tickValues; // strings or numbers
//        Object style;
//        MouseEventHandler onClick;


        @JsProperty
        VictoryAnimation getAnimate();

        @JsProperty
        void setAnimate(VictoryAnimation animate);

        @JsProperty
        boolean isCrossAxis();

        @JsProperty
        void setCrossAxis(boolean crossAxis);

        @JsProperty
        boolean isDependentAxis();

        @JsProperty
        void setDependentAxis(boolean dependentAxis);

        @JsProperty
        double[] getDomain();

        @JsProperty
        void setDomain(double[] domain);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        Object getLabel();

        @JsProperty
        void setLabel(Object label);

        @JsProperty
        double getLabelPadding();

        @JsProperty
        void setLabelPadding(double labelPadding);

        @JsProperty
        double getOffsetX();

        @JsProperty
        void setOffsetX(double offsetX);

        @JsProperty
        double getOffsetY();

        @JsProperty
        void setOffsetY(double offsetY);

        @JsProperty
        String getOrientation();

        @JsProperty
        void setOrientation(String orientation);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        String getScale();

        @JsProperty
        void setScale(String scale);

        @JsProperty
        boolean isStandalone();

        @JsProperty
        void setStandalone(boolean standalone);

        @JsProperty
        double getTickCount();

        @JsProperty
        void setTickCount(double tickCount);

        @JsProperty
        String[] getTickFormat();

        @JsProperty
        void setTickFormat(String[] tickFormat);

        @JsProperty
        Object[] getTickValues();

        @JsProperty
        void setTickValues(Object[] tickValues);

        @JsProperty
        Object getStyle();

        @JsProperty
        void setStyle(Object style);

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
        default Props crossAxis(final boolean crossAxis) {
            setCrossAxis(crossAxis);
            return this;
        }

        @JsOverlay
        default Props dependentAxis(final boolean dependentAxis) {
            setDependentAxis(dependentAxis);
            return this;
        }

        @JsOverlay
        default Props domain(final double[] domain) {
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
        default Props label(final Object label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props labelPadding(final double labelPadding) {
            setLabelPadding(labelPadding);
            return this;
        }

        @JsOverlay
        default Props offsetX(final double offsetX) {
            setOffsetX(offsetX);
            return this;
        }

        @JsOverlay
        default Props offsetY(final double offsetY) {
            setOffsetY(offsetY);
            return this;
        }

        @JsOverlay
        default Props orientation(final String orientation) {
            setOrientation(orientation);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props scale(final String scale) {
            setScale(scale);
            return this;
        }

        @JsOverlay
        default Props standalone(final boolean standalone) {
            setStandalone(standalone);
            return this;
        }

        @JsOverlay
        default Props tickCount(final double tickCount) {
            setTickCount(tickCount);
            return this;
        }

        @JsOverlay
        default Props tickFormat(final String[] tickFormat) {
            setTickFormat(tickFormat);
            return this;
        }

        @JsOverlay
        default Props tickValues(final Object[] tickValues) {
            setTickValues(tickValues);
            return this;
        }

        @JsOverlay
        default Props style(final Object style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
