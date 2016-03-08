package camber.client.reactd3;


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
        return $wnd.Camber.ReactD3.LineChart;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        Object legend; // usually a string, assuming like legend Template in chartjs, sometimes boolean
//        LineData[] data;
//        String className;
//        Object width; // string or double
//        Object height;
//        ViewBoxObject viewBoxObject;
//        String title;
//        String yAxisLabel;
//        String xAxisLabel;
//        String xAxisClassName;
//        String yAxisClassName;
//        boolean gridHorizontal;
//        double circleRadius;
//        boolean hoverAnimation;
//        Object margins; // they use an object for margins
//
//        MouseEventHandler onClick;


        @JsProperty
        Object getLegend();

        @JsProperty
        void setLegend(Object legend);

        @JsProperty
        LineData[] getData();

        @JsProperty
        void setData(LineData[] data);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getWidth();

        @JsProperty
        void setWidth(String width);

        @JsProperty
        String getHeight();

        @JsProperty
        void setHeight(String height);

        @JsProperty
        ViewBoxObject getViewBoxObject();

        @JsProperty
        void setViewBoxObject(ViewBoxObject viewBoxObject);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        String getyAxisLabel();

        @JsProperty
        void setyAxisLabel(String yAxisLabel);

        @JsProperty
        String getxAxisLabel();

        @JsProperty
        void setxAxisLabel(String xAxisLabel);

        @JsProperty
        String getxAxisClassName();

        @JsProperty
        void setxAxisClassName(String xAxisClassName);

        @JsProperty
        String getyAxisClassName();

        @JsProperty
        void setyAxisClassName(String yAxisClassName);

        @JsProperty
        boolean isGridHorizontal();

        @JsProperty
        void setGridHorizontal(boolean gridHorizontal);

        @JsProperty
        double getCircleRadius();

        @JsProperty
        void setCircleRadius(double circleRadius);

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
        default Props data(final LineData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props width(final String width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final String height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props viewBoxObject(final ViewBoxObject viewBoxObject) {
            setViewBoxObject(viewBoxObject);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
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
        default Props gridHorizontal(final boolean gridHorizontal) {
            setGridHorizontal(gridHorizontal);
            return this;
        }

        @JsOverlay
        default Props circleRadius(final double circleRadius) {
            setCircleRadius(circleRadius);
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
    public interface LineData {
//        String name;
//        Values[] values;
//        double strokeWidth;
//        String strokeDashArray;

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        Values[] getValues();

        @JsProperty
        void setValues(Values[] values);

        @JsProperty
        double getStrokeWidth();

        @JsProperty
        void setStrokeWidth(double strokeWidth);

        @JsProperty
        String getStrokeDashArray();

        @JsProperty
        void setStrokeDashArray(String strokeDashArray);

        @JsOverlay
        default LineData name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default LineData values(final Values[] values) {
            setValues(values);
            return this;
        }

        @JsOverlay
        default LineData strokeWidth(final double strokeWidth) {
            setStrokeWidth(strokeWidth);
            return this;
        }

        @JsOverlay
        default LineData strokeDashArray(final String strokeDashArray) {
            setStrokeDashArray(strokeDashArray);
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

    @JsType(isNative = true)
    public interface ViewBoxObject {
//        double x;
//        double y;
//        double width;
//        double height;

        @JsProperty
        double getX();

        @JsProperty
        void setX(double x);

        @JsProperty
        double getY();

        @JsProperty
        void setY(double y);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsOverlay
        default ViewBoxObject x(final double x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default ViewBoxObject y(final double y) {
            setY(y);
            return this;
        }

        @JsOverlay
        default ViewBoxObject width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default ViewBoxObject height(final double height) {
            setHeight(height);
            return this;
        }

    }


}


