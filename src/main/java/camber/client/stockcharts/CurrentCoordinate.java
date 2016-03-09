package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * used for charts
 */
public class CurrentCoordinate extends ExternalComponent<CurrentCoordinate.Props> {

    @Inject
    public CurrentCoordinate() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        double forChart;
//        double forDataSeries;
//        double forCompareSeries;
//        double r;
//        String classname;
//        String chartCanvasType;
//        boolean show;
//        Object[] chartData;
//        Object[] currentItems;
//
//        Func.Run yAccessor;
//        Func.Run getCanvasContexts;


        @JsProperty
        double getForChart();

        @JsProperty
        void setForChart(double forChart);

        @JsProperty
        double getForDataSeries();

        @JsProperty
        void setForDataSeries(double forDataSeries);

        @JsProperty
        double getForCompareSeries();

        @JsProperty
        void setForCompareSeries(double forCompareSeries);

        @JsProperty
        double getR();

        @JsProperty
        void setR(double r);

        @JsProperty
        String getClassname();

        @JsProperty
        void setClassname(String classname);

        @JsProperty
        String getChartCanvasType();

        @JsProperty
        void setChartCanvasType(String chartCanvasType);

        @JsProperty
        boolean isShow();

        @JsProperty
        void setShow(boolean show);

        @JsProperty
        Object[] getChartData();

        @JsProperty
        void setChartData(Object[] chartData);

        @JsProperty
        Object[] getCurrentItems();

        @JsProperty
        void setCurrentItems(Object[] currentItems);

        @JsProperty
        Func.Run getyAccessor();

        @JsProperty
        void setyAccessor(Func.Run yAccessor);

        @JsProperty
        Func.Run getGetCanvasContexts();

        @JsProperty
        void setGetCanvasContexts(Func.Run getCanvasContexts);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props forChart(final double forChart) {
            setForChart(forChart);
            return this;
        }

        @JsOverlay
        default Props forDataSeries(final double forDataSeries) {
            setForDataSeries(forDataSeries);
            return this;
        }

        @JsOverlay
        default Props forCompareSeries(final double forCompareSeries) {
            setForCompareSeries(forCompareSeries);
            return this;
        }

        @JsOverlay
        default Props r(final double r) {
            setR(r);
            return this;
        }

        @JsOverlay
        default Props classname(final String classname) {
            setClassname(classname);
            return this;
        }

        @JsOverlay
        default Props chartCanvasType(final String chartCanvasType) {
            setChartCanvasType(chartCanvasType);
            return this;
        }

        @JsOverlay
        default Props show(final boolean show) {
            setShow(show);
            return this;
        }

        @JsOverlay
        default Props chartData(final Object[] chartData) {
            setChartData(chartData);
            return this;
        }

        @JsOverlay
        default Props currentItems(final Object[] currentItems) {
            setCurrentItems(currentItems);
            return this;
        }

        @JsOverlay
        default Props yAccessor(final Func.Run yAccessor) {
            setyAccessor(yAccessor);
            return this;
        }

        @JsOverlay
        default Props getCanvasContexts(final Func.Run getCanvasContexts) {
            setGetCanvasContexts(getCanvasContexts);
            return this;
        }


    }
}
