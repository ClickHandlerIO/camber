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
import javax.inject.Singleton;

@Singleton
public class BarChart extends ExternalComponent<BarChart.Props> {

    @Inject
    public BarChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.BarChart;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String chartClassName;
//        String xAxisClassName;
//        String yAxisClassName;
//        BarData[] data;
//        String title;
//        double yAxisTickCount;
//        String yAxisLabel;
//        String xAxisLabel;
//        String stackOffset; // one of 4 values
//        Object width; // string or double
//        double height;
//        double rangeRoundBandsPadding;
//        Object margins; // can be created as another interface in here if needed
//        String fill; // seems to be fill color
//        Func.Run1<Object> valuesAccessor;
//        MouseEventHandler onClick;


        @JsProperty
        String getChartClassName();

        @JsProperty
        void setChartClassName(String chartClassName);

        @JsProperty
        String getxAxisClassName();

        @JsProperty
        void setxAxisClassName(String xAxisClassName);

        @JsProperty
        String getyAxisClassName();

        @JsProperty
        void setyAxisClassName(String yAxisClassName);

        @JsProperty
        BarData[] getData();

        @JsProperty
        void setData(BarData[] data);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        double getyAxisTickCount();

        @JsProperty
        void setyAxisTickCount(double yAxisTickCount);

        @JsProperty
        String getyAxisLabel();

        @JsProperty
        void setyAxisLabel(String yAxisLabel);

        @JsProperty
        String getxAxisLabel();

        @JsProperty
        void setxAxisLabel(String xAxisLabel);

        @JsProperty
        String getStackOffset();

        @JsProperty
        void setStackOffset(String stackOffset);

        @JsProperty
        Object getWidth();

        @JsProperty
        void setWidth(Object width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getRangeRoundBandsPadding();

        @JsProperty
        void setRangeRoundBandsPadding(double rangeRoundBandsPadding);

        @JsProperty
        Object getMargins();

        @JsProperty
        void setMargins(Object margins);

        @JsProperty
        String getFill();

        @JsProperty
        void setFill(String fill);

        @JsProperty
        Func.Run1<Object> getValuesAccessor();

        @JsProperty
        void setValuesAccessor(Func.Run1<Object> valuesAccessor);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props chartClassName(final String chartClassName) {
            setChartClassName(chartClassName);
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
        default Props data(final BarData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props yAxisTickCount(final double yAxisTickCount) {
            setyAxisTickCount(yAxisTickCount);
            return this;
        }

        @JsOverlay
        default Props yAxisLabel(final String yAxisLabel) {
            setyAxisLabel(yAxisLabel);
            return this;
        }

        @JsOverlay
        default Props xAxisLabel(final String xAxisLabel) {
            setxAxisLabel(xAxisLabel);
            return this;
        }

        @JsOverlay
        default Props stackOffset(final String stackOffset) {
            setStackOffset(stackOffset);
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
        default Props rangeRoundBandsPadding(final double rangeRoundBandsPadding) {
            setRangeRoundBandsPadding(rangeRoundBandsPadding);
            return this;
        }

        @JsOverlay
        default Props margins(final Object margins) {
            setMargins(margins);
            return this;
        }

        @JsOverlay
        default Props fill(final String fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props valuesAccessor(final Func.Run1<Object> valuesAccessor) {
            setValuesAccessor(valuesAccessor);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }


    @JsType(isNative = true)
    public interface BarData {
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
        default BarData name(final String name) {
            setName(name);
            return this;
        }
        @JsOverlay
        default BarData values(final Values[] values) {
            setValues(values);
            return this;
        }

    }

    @JsType(isNative = true)
    public interface Values {
//        double x;
//        double y;

        @JsProperty
        double getX();

        @JsProperty
        void setX(double x);

        @JsProperty
        double getY();

        @JsProperty
        void setY(double y);

        @JsOverlay
        default Values x(final double x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default Values y(final double y) {
            setY(y);
            return this;
        }

    }


}
