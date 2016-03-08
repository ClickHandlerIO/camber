package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class CandlestickChart extends ExternalComponent<CandlestickChart.Props> {

    @Inject
    public CandlestickChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ReactD3.CandlestickChart;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        String xAxisClassName;
//        String yAxisClassName;
//        OhlcData[] data;
//        Object width; // can be string or double
//        double height;
//        String title;
//        Object xAxisTickInterval; // change to an interface in here?
//        double[] xAxisTickValues;
//        double[] yAxisTickValues;
//        double yAxisTickCount;
//        double yAxisOffset;
//        boolean hoverAnimation;
//        double legendOffset;
//        Object margins; // use an object for margins, can be created as another interface in here if needed
//        // internal functions
//        Func.Run1<Object> fillUp;
//        Func.Run2<Object, Object> fillUpAccessor;
//        Func.Run fillDown;
//        Func.Run2<Object, Object> fillDownAccessor;
//        Func.Run xAccesor;
//        Func.Run xAxisFormatter;
//        Func.Run yAccesor;
//        Func.Run yAxisFormatter;
//        MouseEventHandler onClick;

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getxAxisClassName();

        @JsProperty
        void setxAxisClassName(String xAxisClassName);

        @JsProperty
        String getyAxisClassName();

        @JsProperty
        void setyAxisClassName(String yAxisClassName);

        @JsProperty
        OhlcData[] getData();

        @JsProperty
        void setData(OhlcData[] data);

        @JsProperty
        Object getWidth();

        @JsProperty
        void setWidth(Object width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        Object getxAxisTickInterval();

        @JsProperty
        void setxAxisTickInterval(Object xAxisTickInterval);

        @JsProperty
        double[] getxAxisTickValues();

        @JsProperty
        void setxAxisTickValues(double[] xAxisTickValues);

        @JsProperty
        double[] getyAxisTickValues();

        @JsProperty
        void setyAxisTickValues(double[] yAxisTickValues);

        @JsProperty
        double getyAxisTickCount();

        @JsProperty
        void setyAxisTickCount(double yAxisTickCount);

        @JsProperty
        double getyAxisOffset();

        @JsProperty
        void setyAxisOffset(double yAxisOffset);

        @JsProperty
        boolean isHoverAnimation();

        @JsProperty
        void setHoverAnimation(boolean hoverAnimation);

        @JsProperty
        double getLegendOffset();

        @JsProperty
        void setLegendOffset(double legendOffset);

        @JsProperty
        Object getMargins();

        @JsProperty
        void setMargins(Object margins);

        @JsProperty
        Func.Run1<Object> getFillUp();

        @JsProperty
        void setFillUp(Func.Run1<Object> fillUp);

        @JsProperty
        Func.Run2<Object, Object> getFillUpAccessor();

        @JsProperty
        void setFillUpAccessor(Func.Run2<Object, Object> fillUpAccessor);

        @JsProperty
        Func.Run getFillDown();

        @JsProperty
        void setFillDown(Func.Run fillDown);

        @JsProperty
        Func.Run2<Object, Object> getFillDownAccessor();

        @JsProperty
        void setFillDownAccessor(Func.Run2<Object, Object> fillDownAccessor);

        @JsProperty
        Func.Run getxAccesor();

        @JsProperty
        void setxAccesor(Func.Run xAccesor);

        @JsProperty
        Func.Run getxAxisFormatter();

        @JsProperty
        void setxAxisFormatter(Func.Run xAxisFormatter);

        @JsProperty
        Func.Run getyAccesor();

        @JsProperty
        void setyAccesor(Func.Run yAccesor);

        @JsProperty
        Func.Run getyAxisFormatter();

        @JsProperty
        void setyAxisFormatter(Func.Run yAxisFormatter);

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
        default Props xAxisClassName(final String xAxisClassName) {
            setxAxisClassName(xAxisClassName);
            return this;
        }

        @JsOverlay
        default Props yAxisClassName(final String yAxisClassName) {
            setyAxisClassName(yAxisClassName);
            return this;
        }

        @JsOverlay
        default Props data(final OhlcData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props width(final Object width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props xAxisTickInterval(final Object xAxisTickInterval) {
            setxAxisTickInterval(xAxisTickInterval);
            return this;
        }

        @JsOverlay
        default Props xAxisTickValues(final double[] xAxisTickValues) {
            setxAxisTickValues(xAxisTickValues);
            return this;
        }

        @JsOverlay
        default Props yAxisTickValues(final double[] yAxisTickValues) {
            setyAxisTickValues(yAxisTickValues);
            return this;
        }

        @JsOverlay
        default Props yAxisTickCount(final double yAxisTickCount) {
            setyAxisTickCount(yAxisTickCount);
            return this;
        }

        @JsOverlay
        default Props yAxisOffset(final double yAxisOffset) {
            setyAxisOffset(yAxisOffset);
            return this;
        }

        @JsOverlay
        default Props hoverAnimation(final boolean hoverAnimation) {
            setHoverAnimation(hoverAnimation);
            return this;
        }

        @JsOverlay
        default Props legendOffset(final double legendOffset) {
            setLegendOffset(legendOffset);
            return this;
        }

        @JsOverlay
        default Props margins(final Object margins) {
            setMargins(margins);
            return this;
        }

        @JsOverlay
        default Props fillUp(final Func.Run1<Object> fillUp) {
            setFillUp(fillUp);
            return this;
        }

        @JsOverlay
        default Props fillUpAccessor(final Func.Run2<Object, Object> fillUpAccessor) {
            setFillUpAccessor(fillUpAccessor);
            return this;
        }

        @JsOverlay
        default Props fillDown(final Func.Run fillDown) {
            setFillDown(fillDown);
            return this;
        }

        @JsOverlay
        default Props fillDownAccessor(final Func.Run2<Object, Object> fillDownAccessor) {
            setFillDownAccessor(fillDownAccessor);
            return this;
        }

        @JsOverlay
        default Props xAccesor(final Func.Run xAccesor) {
            setxAccesor(xAccesor);
            return this;
        }

        @JsOverlay
        default Props xAxisFormatter(final Func.Run xAxisFormatter) {
            setxAxisFormatter(xAxisFormatter);
            return this;
        }

        @JsOverlay
        default Props yAccesor(final Func.Run yAccesor) {
            setyAccesor(yAccesor);
            return this;
        }

        @JsOverlay
        default Props yAxisFormatter(final Func.Run yAxisFormatter) {
            setyAxisFormatter(yAxisFormatter);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }



    }


    @JsType(isNative = true)
    public interface OhlcData {
//        String name;
//        Values[] values;

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        Values[] getValues();

        @JsProperty
        void setValues(Values[] values);

        @JsOverlay
        default OhlcData name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default OhlcData values(final Values[] values) {
            setValues(values);
            return this;
        }


    }

    @JsType(isNative = true)
    public interface Values {
//        Object x; // can be different things like string or date
//        double open;
//        double close;
//        double high;
//        double low;

        @JsProperty
        Object getX();

        @JsProperty
        void setX(Object x);

        @JsProperty
        double getOpen();

        @JsProperty
        void setOpen(double open);

        @JsProperty
        double getClose();

        @JsProperty
        void setClose(double close);

        @JsProperty
        double getHigh();

        @JsProperty
        void setHigh(double high);

        @JsProperty
        double getLow();

        @JsProperty
        void setLow(double low);

        @JsOverlay
        default Values x(final Object x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default Values open(final double open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Values close(final double close) {
            setClose(close);
            return this;
        }

        @JsOverlay
        default Values high(final double high) {
            setHigh(high);
            return this;
        }

        @JsOverlay
        default Values low(final double low) {
            setLow(low);
            return this;
        }


    }

//    @JsType(isNative = true)
//    public class XAxisTickInterval {
//        String unit;
//        double interval;
//
//    }



}
