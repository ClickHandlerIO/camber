package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * appears in most charts, here we have a customizable reference
 */
public class ChartCanvas extends ExternalComponent<ChartCanvas.Props> {

    @Inject
    public ChartCanvas() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        double width;
//        double height;
//        Object margin;
//        String interval; // ie d, w, m, d12, w15, m1, m5, etc
//        String type; // svg, hybrid
//        Object[] data;
//        double initialDisplay;
//        Object[] dataTransform; // this may be able to hold those transform classes as an array
//        String className;
//        double zIndex;
////        MouseEventHandler onclick; - not implemented currently

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        Object getMargin();

        @JsProperty
        void setMargin(Object margin);

        @JsProperty
        String getInterval();

        @JsProperty
        void setInterval(String interval);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        double getInitialDisplay();

        @JsProperty
        void setInitialDisplay(double initialDisplay);

        @JsProperty
        Object[] getDataTransform();

        @JsProperty
        void setDataTransform(Object[] dataTransform);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        double getzIndex();

        @JsProperty
        void setzIndex(double zIndex);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props margin(final Object margin) {
            setMargin(margin);
            return this;
        }

        @JsOverlay
        default Props interval(final String interval) {
            setInterval(interval);
            return this;
        }

        @JsOverlay
        default Props type(final String type) {
            setType(type);
            return this;
        }

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props initialDisplay(final double initialDisplay) {
            setInitialDisplay(initialDisplay);
            return this;
        }

        @JsOverlay
        default Props dataTransform(final Object[] dataTransform) {
            setDataTransform(dataTransform);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props zIndex(final double zIndex) {
            setzIndex(zIndex);
            return this;
        }

    }
}
