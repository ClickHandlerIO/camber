package camber.client.stockcharts;

import camber.client.stockcharts.customizable.StockscaleTransformer;
import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * single component for candlestick chart with finance time scale, is shown as such in documentation
 */
public class CandlestickStockScaleChart extends ExternalComponent<CandlestickStockScaleChart.Props> {

    @Inject
    public CandlestickStockScaleChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        String wickClassName;
//        String candleClassName;
//        Object[] classNames; //  string array or shape array
//        double widthRatio;
//        Object[] stroke; //  string array or shape array
//        Object[] wickStroke; //  string array or shape array
//        Object[] fill; //  string array or shape array
//        Object[] compareSeries;
//        Object[] plotData;
//        double opacity;
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run xAccessor;
//        Func.Run yAccessor;
//        // financial time props
//        Object[] data; // can be same as plot data
//        double width;
//        String type; // svg, canvas
//        Func.Run1<StockscaleTransformer> fitWidth; // used for this component


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getWickClassName();

        @JsProperty
        void setWickClassName(String wickClassName);

        @JsProperty
        String getCandleClassName();

        @JsProperty
        void setCandleClassName(String candleClassName);

        @JsProperty
        Object[] getClassNames();

        @JsProperty
        void setClassNames(Object[] classNames);

        @JsProperty
        double getWidthRatio();

        @JsProperty
        void setWidthRatio(double widthRatio);

        @JsProperty
        Object[] getStroke();

        @JsProperty
        void setStroke(Object[] stroke);

        @JsProperty
        Object[] getWickStroke();

        @JsProperty
        void setWickStroke(Object[] wickStroke);

        @JsProperty
        Object[] getFill();

        @JsProperty
        void setFill(Object[] fill);

        @JsProperty
        Object[] getCompareSeries();

        @JsProperty
        void setCompareSeries(Object[] compareSeries);

        @JsProperty
        Object[] getPlotData();

        @JsProperty
        void setPlotData(Object[] plotData);

        @JsProperty
        double getOpacity();

        @JsProperty
        void setOpacity(double opacity);

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

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);

        @JsProperty
        Func.Run1<StockscaleTransformer> getFitWidth();

        @JsProperty
        void setFitWidth(Func.Run1<StockscaleTransformer> fitWidth);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props wickClassName(final String wickClassName) {
            setWickClassName(wickClassName);
            return this;
        }

        @JsOverlay
        default Props candleClassName(final String candleClassName) {
            setCandleClassName(candleClassName);
            return this;
        }

        @JsOverlay
        default Props classNames(final Object[] classNames) {
            setClassNames(classNames);
            return this;
        }

        @JsOverlay
        default Props widthRatio(final double widthRatio) {
            setWidthRatio(widthRatio);
            return this;
        }

        @JsOverlay
        default Props stroke(final Object[] stroke) {
            setStroke(stroke);
            return this;
        }

        @JsOverlay
        default Props wickStroke(final Object[] wickStroke) {
            setWickStroke(wickStroke);
            return this;
        }

        @JsOverlay
        default Props fill(final Object[] fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props compareSeries(final Object[] compareSeries) {
            setCompareSeries(compareSeries);
            return this;
        }

        @JsOverlay
        default Props plotData(final Object[] plotData) {
            setPlotData(plotData);
            return this;
        }

        @JsOverlay
        default Props opacity(final double opacity) {
            setOpacity(opacity);
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

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props type(final String type) {
            setType(type);
            return this;
        }

        @JsOverlay
        default Props fitWidth(final Func.Run1<StockscaleTransformer> fitWidth) {
            setFitWidth(fitWidth);
            return this;
        }


    }
}
