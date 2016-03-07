package camber.client.reactd3;


import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class LineChart {

    @Inject
    public LineChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object legend; // usually a string, assuming like legend Template in chartjs, sometimes boolean
        LineData[] data;
        String className;
        String width;
        String height;
        ViewBoxObject viewBoxObject;
        String title;
        String yAxisLabel;
        String xAxisLabel;
        String xAxisClassName;
        String yAxisClassName;
        boolean gridHorizontal;
        double circleRadius;
        boolean hoverAnimation;
        Object margins; // they use an object for margins

        MouseEventHandler onClick;


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

        public Props legend(final Object legend) {
            this.legend = legend;
            return this;
        }

        public Props data(final LineData[] data) {
            this.data = data;
            return this;
        }

        public Props className(final String className) {
            this.className = className;
            return this;
        }

        public Props width(final String width) {
            this.width = width;
            return this;
        }

        public Props height(final String height) {
            this.height = height;
            return this;
        }

        public Props viewBoxObject(final ViewBoxObject viewBoxObject) {
            this.viewBoxObject = viewBoxObject;
            return this;
        }

        public Props title(final String title) {
            this.title = title;
            return this;
        }

        public Props yAxisLabel(final String yAxisLabel) {
            setyAxisLabel(yAxisLabel);
            return this;
        }

        public Props xAxisLabel(final String xAxisLabel) {
            setxAxisLabel(xAxisLabel);
            return this;
        }

        public Props xAxisClassName(final String xAxisClassName) {
            setxAxisClassName(xAxisClassName);
            return this;
        }

        public Props yAxisClassName(final String yAxisClassName) {
            setyAxisClassName(yAxisClassName);
            return this;
        }

        public Props gridHorizontal(final boolean gridHorizontal) {
            setGridHorizontal(gridHorizontal);
            return this;
        }

        public Props circleRadius(final double circleRadius) {
            setCircleRadius(circleRadius);
            return this;
        }

        public Props hoverAnimation(final boolean hoverAnimation) {
            setHoverAnimation(hoverAnimation);
            return this;
        }

        public Props margin(final Object margin) {
            setMargin(margin);
            return this;
        }

        public Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }



    }


    @JsType(isNative = true)
    public class LineData {
        String name;
        Values[] values;
        double strokeWidth;
        String strokeDashArray;

    }

    @JsType(isNative = true)
    public class Values {
        double x;
        double y;

    }

    @JsType(isNative = true)
    public class ViewBoxObject {
        double x;
        double y;
        double width;
        double height;

    }


}


