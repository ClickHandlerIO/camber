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


public class LineChart extends ExternalComponent<LineChart.Props> {

    @Inject
    public LineChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        double id;
//        String namespace;
//        String fill;
//        Object[] plotData;
//        String stroke;
//        XAxis xAxis;
//        YAxis yAxis;
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
        double getId();

        @JsProperty
        void setId(double id);

        @JsProperty
        String getNamespace();

        @JsProperty
        void setNamespace(String namespace);

        @JsProperty
        String getFill();

        @JsProperty
        void setFill(String fill);

        @JsProperty
        Object[] getPlotData();

        @JsProperty
        void setPlotData(Object[] plotData);

        @JsProperty
        String getStroke();

        @JsProperty
        void setStroke(String stroke);

        @JsProperty
        XAxis getxAxis();

        @JsProperty
        void setxAxis(XAxis xAxis);

        @JsProperty
        YAxis getyAxis();

        @JsProperty
        void setyAxis(YAxis yAxis);

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
        default Props id(final double id) {
            setId(id);
            return this;
        }

        @JsOverlay
        default Props namespace(final String namespace) {
            setNamespace(namespace);
            return this;
        }

        @JsOverlay
        default Props fill(final String fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props plotData(final Object[] plotData) {
            setPlotData(plotData);
            return this;
        }

        @JsOverlay
        default Props stroke(final String stroke) {
            setStroke(stroke);
            return this;
        }

        @JsOverlay
        default Props xAxis(final XAxis xAxis) {
            setxAxis(xAxis);
            return this;
        }

        @JsOverlay
        default Props yAxis(final YAxis yAxis) {
            setyAxis(yAxis);
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
