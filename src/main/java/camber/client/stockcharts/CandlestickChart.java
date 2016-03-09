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
 * alpha library, please note any updates at https://github.com/rrag/react-stockcharts
 */
public class CandlestickChart extends ExternalComponent<CandlestickChart.Props> {

    @Inject
    public CandlestickChart() {
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
//
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run xAccessor;
//        Func.Run yAccessor;
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
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
