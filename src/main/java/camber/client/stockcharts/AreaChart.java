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


public class AreaChart extends ExternalComponent<AreaChart.Props> {

    @Inject
    public AreaChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        double id;
//        String namespace;
//        String className;
//        double height;
//        double width;
//        Object origin;
//        boolean xDomainUpdate;
//        boolean yDomainUpdate;
//        String yMousePointerDisplayLocation;
//        Object padding;
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run yMousePointerDisplayFormat;
//        String fill;
//        Object[] plotData;
//        String stroke;
//        double opacity;
//        XAxis xAxis;
//        YAxis yAxis;
//        Func.Run base;
//        Func.Run xAccessor;
//        Func.Run yAccessor;
//        MouseEventHandler onClick;

        @JsProperty
        double getId();

        @JsProperty
        void setId(double id);

        @JsProperty
        String getNamespace();

        @JsProperty
        void setNamespace(String namespace);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        Object getOrigin();

        @JsProperty
        void setOrigin(Object origin);

        @JsProperty
        boolean isxDomainUpdate();

        @JsProperty
        void setxDomainUpdate(boolean xDomainUpdate);

        @JsProperty
        boolean isyDomainUpdate();

        @JsProperty
        void setyDomainUpdate(boolean yDomainUpdate);

        @JsProperty
        String getyMousePointerDisplayLocation();

        @JsProperty
        void setyMousePointerDisplayLocation(String yMousePointerDisplayLocation);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        Func.Run getxScale();

        @JsProperty
        void setxScale(Func.Run xScale);

        @JsProperty
        Func.Run getyScale();

        @JsProperty
        void setyScale(Func.Run yScale);

        @JsProperty
        Func.Run getyMousePointerDisplayFormat();

        @JsProperty
        void setyMousePointerDisplayFormat(Func.Run yMousePointerDisplayFormat);

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
        double getOpacity();

        @JsProperty
        void setOpacity(double opacity);

        @JsProperty
        Func.Run getBase();

        @JsProperty
        void setBase(Func.Run base);

        @JsProperty
        Func.Run getxAccessor();

        @JsProperty
        void setxAccessor(Func.Run xAccessor);

        @JsProperty
        Func.Run getyAccessor();

        @JsProperty
        void setyAccessor(Func.Run yAccessor);

        @JsProperty
        XAxis getxAxis();

        @JsProperty
        void setxAxis(XAxis xAxis);

        @JsProperty
        YAxis getyAxis();

        @JsProperty
        void setyAxis(YAxis yAxis);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

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
        default Props className(final String className) {
            setClassName(className);
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
        default Props origin(final Object origin) {
            setOrigin(origin);
            return this;
        }

        @JsOverlay
        default Props xDomainUpdate(final boolean xDomainUpdate) {
            setxDomainUpdate(xDomainUpdate);
            return this;
        }

        @JsOverlay
        default Props yDomainUpdate(final boolean yDomainUpdate) {
            setyDomainUpdate(yDomainUpdate);
            return this;
        }

        @JsOverlay
        default Props yMousePointerDisplayLocation(final String yMousePointerDisplayLocation) {
            setyMousePointerDisplayLocation(yMousePointerDisplayLocation);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
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
        default Props yMousePointerDisplayFormat(final Func.Run yMousePointerDisplayFormat) {
            setyMousePointerDisplayFormat(yMousePointerDisplayFormat);
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
        default Props opacity(final double opacity) {
            setOpacity(opacity);
            return this;
        }

        @JsOverlay
        default Props base(final Func.Run base) {
            setBase(base);
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
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
