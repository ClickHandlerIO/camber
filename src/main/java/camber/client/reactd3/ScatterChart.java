package camber.client.reactd3;


import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class ScatterChart extends ExternalComponent<ScatterChart.Props> {

    @Inject
    public ScatterChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ReactD3.ScatterChart;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        Object legend; // usually a string, assuming like legend Template in chartjs, sometimes boolean
//        String className;
//        double circleRadius;
//        ScatterData[] data;
//        Object width; // string or double
//        Object height;
//        String title;
//        double xAxisStrokeWidth;
//        double yAxisStrokeWidth;
//        String xAxisClassName;
//        String yAxisClassName;
//        boolean hoverAnimation;
//        Object margins; // use an object for margins, can be created as another interface in here if needed
//        MouseEventHandler onClick;


        @JsProperty
        Object getLegend();

        @JsProperty
        void setLegend(Object legend);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        double getCircleRadius();

        @JsProperty
        void setCircleRadius(double circleRadius);

        @JsProperty
        ScatterData[] getData();

        @JsProperty
        void setData(ScatterData[] data);

        @JsProperty
        Object getWidth();

        @JsProperty
        void setWidth(Object width);

        @JsProperty
        Object getHeight();

        @JsProperty
        void setHeight(Object height);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        double getxAxisStrokeWidth();

        @JsProperty
        void setxAxisStrokeWidth(double xAxisStrokeWidth);

        @JsProperty
        double getyAxisStrokeWidth();

        @JsProperty
        void setyAxisStrokeWidth(double yAxisStrokeWidth);

        @JsProperty
        String getxAxisClassName();

        @JsProperty
        void setxAxisClassName(String xAxisClassName);

        @JsProperty
        String getyAxisClassName();

        @JsProperty
        void setyAxisClassName(String yAxisClassName);

        @JsProperty
        boolean isHoverAnimation();

        @JsProperty
        void setHoverAnimation(boolean hoverAnimation);

        @JsProperty
        Object getMargins();

        @JsProperty
        void setMargins(Object margins);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props legend(final Object legend) {
            setLegend(legend);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props circleRadius(final double circleRadius) {
            setCircleRadius(circleRadius);
            return this;
        }

        @JsOverlay
        default Props data(final ScatterData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props width(final Object width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final Object height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props xAxisStrokeWidth(final double xAxisStrokeWidth) {
            setxAxisStrokeWidth(xAxisStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props yAxisStrokeWidth(final double yAxisStrokeWidth) {
            setyAxisStrokeWidth(yAxisStrokeWidth);
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
        default Props hoverAnimation(final boolean hoverAnimation) {
            setHoverAnimation(hoverAnimation);
            return this;
        }

        @JsOverlay
        default Props margins(final Object margins) {
            setMargins(margins);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }

    @JsType(isNative = true)
    public interface ScatterData {
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
        default ScatterData name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default ScatterData values(final Values[] values) {
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
