package camber.client.reactd3;


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
public class AreaChart extends ExternalComponent<AreaChart.Props> {

    @Inject
    public AreaChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.AreaChart;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        AreaData[] data;
//        Object width; // string or double
//        double height;
//        ViewBoxObject viewBoxObject;
//        String title;
//        Object xAxisTickInterval; // can have string unit; double: interval
//        String yAxisTickCount;
//        boolean interpolate;
//        Object interpolationType;
//        boolean hoverAnimation;
//        Object margins; // can be created as another interface in here if needed
//        MouseEventHandler onClick;


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        AreaData[] getData();

        @JsProperty
        void setData(AreaData[] data);

        @JsProperty
        Object getWidth();

        @JsProperty
        void setWidth(Object width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        ViewBoxObject getViewBoxObject();

        @JsProperty
        void setViewBoxObject(ViewBoxObject viewBoxObject);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        Object getxAxisTickInterval();

        @JsProperty
        void setxAxisTickInterval(Object xAxisTickInterval);

        @JsProperty
        String getyAxisTickCount();

        @JsProperty
        void setyAxisTickCount(String yAxisTickCount);

        @JsProperty
        boolean isInterpolate();

        @JsProperty
        void setInterpolate(boolean interpolate);

        @JsProperty
        Object getInterpolationType();

        @JsProperty
        void setInterpolationType(Object interpolationType);

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
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props data(final AreaData[] data) {
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
        default Props xAxisTickInterval(final Object xAxisTickInterval) {
            setxAxisTickInterval(xAxisTickInterval);
            return this;
        }

        @JsOverlay
        default Props yAxisTickCount(final String yAxisTickCount) {
            setyAxisTickCount(yAxisTickCount);
            return this;
        }

        @JsOverlay
        default Props interpolate(final boolean interpolate) {
            setInterpolate(interpolate);
            return this;
        }

        @JsOverlay
        default Props interpolationType(final Object interpolationType) {
            setInterpolationType(interpolationType);
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
    public interface AreaData {
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
        default AreaData name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default AreaData values(final Values[] values) {
            setValues(values);
            return this;
        }

    }

    @JsType(isNative = true)
    public interface Values {
//        Object x; // can be different things like string or date
//        double y;

        @JsProperty
        Object getX();

        @JsProperty
        void setX(Object x);

        @JsProperty
        double getY();

        @JsProperty
        void setY(double y);

        @JsOverlay
        default Values x(final Object x) {
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
