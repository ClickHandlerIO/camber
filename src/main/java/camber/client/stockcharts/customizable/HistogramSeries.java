package camber.client.stockcharts.customizable;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * can be use with charts like Candlestick is a small portion below original chart
 */
public class HistogramSeries extends ExternalComponent<HistogramSeries.Props> {

    @Inject
    public HistogramSeries() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        String baseAt; // top, bottom, middle
//        String direction; // up, down
//        boolean stroke;
//        Object fill; // can be string or specific func
//        double opacity;
//        double widthRatio;
//        Object[] plotData;
//
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run xAccessor;
//        Func.Run yAccessor;


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getBaseAt();

        @JsProperty
        void setBaseAt(String baseAt);

        @JsProperty
        String getDirection();

        @JsProperty
        void setDirection(String direction);

        @JsProperty
        boolean isStroke();

        @JsProperty
        void setStroke(boolean stroke);

        @JsProperty
        Object getFill();

        @JsProperty
        void setFill(Object fill);

        @JsProperty
        double getOpacity();

        @JsProperty
        void setOpacity(double opacity);

        @JsProperty
        double getWidthRatio();

        @JsProperty
        void setWidthRatio(double widthRatio);

        @JsProperty
        Object[] getPlotData();

        @JsProperty
        void setPlotData(Object[] plotData);

        @JsProperty
        Func.Run getxScale();

        @JsProperty
        void setxScale(Func.Run xScale);

        @JsProperty
        Func.Run getyScale();

        @JsProperty
        void setyScale(Func.Run yScale);

        @JsProperty
        Func.Run getxAccessor();

        @JsProperty
        void setxAccessor(Func.Run xAccessor);

        @JsProperty
        Func.Run getyAccessor();

        @JsProperty
        void setyAccessor(Func.Run yAccessor);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props baseAt(final String baseAt) {
            setBaseAt(baseAt);
            return this;
        }

        @JsOverlay
        default Props direction(final String direction) {
            setDirection(direction);
            return this;
        }

        @JsOverlay
        default Props stroke(final boolean stroke) {
            setStroke(stroke);
            return this;
        }

        @JsOverlay
        default Props fill(final Object fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props opacity(final double opacity) {
            setOpacity(opacity);
            return this;
        }

        @JsOverlay
        default Props widthRatio(final double widthRatio) {
            setWidthRatio(widthRatio);
            return this;
        }

        @JsOverlay
        default Props plotData(final Object[] plotData) {
            setPlotData(plotData);
            return this;
        }

        @JsOverlay
        default Props xScale(final Func.Run xScale) {
            setxScale(xScale);
            return this;
        }

        @JsOverlay
        default Props yScale(final Func.Run yScale) {
            setyScale(yScale);
            return this;
        }

        @JsOverlay
        default Props xAccessor(final Func.Run xAccessor) {
            setxAccessor(xAccessor);
            return this;
        }

        @JsOverlay
        default Props yAccessor(final Func.Run yAccessor) {
            setyAccessor(yAccessor);
            return this;
        }


    }
}
