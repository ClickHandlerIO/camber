package camber.client.stockcharts;

import camber.client.stockcharts.customizable.HistogramSeries;
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
 *  a more customizable histogram graph, has props from both component classes
 */
public class CandlestickHistogramChart extends ExternalComponent<CandlestickHistogramChart.Props> {

    @Inject
    public CandlestickHistogramChart() {
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
//        HistogramSeries dataSeries; // another attempt by adding the component as a variable
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run xAccesor;
//        Func.Run yAccesor;
//        MouseEventHandler onClick;


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
        HistogramSeries getDataSeries();

        @JsProperty
        void setDataSeries(HistogramSeries dataSeries);

        @JsProperty
        Func.Run getxScale();

        @JsProperty
        void setxScale(Func.Run xScale);

        @JsProperty
        Func.Run getyScale();

        @JsProperty
        void setyScale(Func.Run yScale);

        @JsProperty
        Func.Run getxAccesor();

        @JsProperty
        void setxAccesor(Func.Run xAccesor);

        @JsProperty
        Func.Run getyAccesor();

        @JsProperty
        void setyAccesor(Func.Run yAccesor);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


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
        default Props dataSeries(final HistogramSeries dataSeries) {
            setDataSeries(dataSeries);
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
        default Props xAccesor(final Func.Run xAccesor) {
            setxAccesor(xAccesor);
            return this;
        }

        @JsOverlay
        default Props yAccesor(final Func.Run yAccesor) {
            setyAccesor(yAccesor);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}