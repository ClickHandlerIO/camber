package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  in JS: var myPolarChart = new Chart(ctx).PolarArea(data, options);
 */
public class PolarAreaChart extends ExternalComponent<PolarAreaChart.Props> {

    @Inject
    public PolarAreaChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // chart specific options
//        Data[] data;
//        boolean scaleShowLabelBackdrop;
//        boolean scaleBackdropColor;
//        boolean scaleBeginAtZero;
//        double scaleBackdropPaddingY;
//        double scaleBackdropPaddingX;
//        boolean scaleShowLine;
//        boolean segmentShowStroke;
//        String segmentStrokeColor;
//        double segmentStrokeWidth;
//        double animationSteps;
//        String animationEasing;
//        boolean animateRotate;
//        boolean animateScale;
//        String legendTemplate; // long default "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"

        @JsProperty
        Data[] getData();

        @JsProperty
        void setData(Data[] data);

        @JsProperty
        boolean isScaleShowLabelBackdrop();

        @JsProperty
        void setScaleShowLabelBackdrop(boolean scaleShowLabelBackdrop);

        @JsProperty
        boolean isScaleBackdropColor();

        @JsProperty
        void setScaleBackdropColor(boolean scaleBackdropColor);

        @JsProperty
        boolean isScaleBeginAtZero();

        @JsProperty
        void setScaleBeginAtZero(boolean scaleBeginAtZero);

        @JsProperty
        double getScaleBackdropPaddingY();

        @JsProperty
        void setScaleBackdropPaddingY(double scaleBackdropPaddingY);

        @JsProperty
        double getScaleBackdropPaddingX();

        @JsProperty
        void setScaleBackdropPaddingX(double scaleBackdropPaddingX);

        @JsProperty
        boolean isScaleShowLine();

        @JsProperty
        void setScaleShowLine(boolean scaleShowLine);

        @JsProperty
        boolean isSegmentShowStroke();

        @JsProperty
        void setSegmentShowStroke(boolean segmentShowStroke);

        @JsProperty
        String getSegmentStrokeColor();

        @JsProperty
        void setSegmentStrokeColor(String segmentStrokeColor);

        @JsProperty
        double getSegmentStrokeWidth();

        @JsProperty
        void setSegmentStrokeWidth(double segmentStrokeWidth);

        @JsProperty
        double getAnimationSteps();

        @JsProperty
        void setAnimationSteps(double animationSteps);

        @JsProperty
        String getAnimationEasing();

        @JsProperty
        void setAnimationEasing(String animationEasing);

        @JsProperty
        boolean isAnimateRotate();

        @JsProperty
        void setAnimateRotate(boolean animateRotate);

        @JsProperty
        boolean isAnimateScale();

        @JsProperty
        void setAnimateScale(boolean animateScale);

        @JsProperty
        String getLegendTemplate();

        @JsProperty
        void setLegendTemplate(String legendTemplate);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final Data[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props scaleShowLabelBackdrop(final boolean scaleShowLabelBackdrop) {
            setScaleShowLabelBackdrop(scaleShowLabelBackdrop);
            return this;
        }

        @JsOverlay
        default Props scaleBackdropColor(final boolean scaleBackdropColor) {
            setScaleBackdropColor(scaleBackdropColor);
            return this;
        }

        @JsOverlay
        default Props scaleBeginAtZero(final boolean scaleBeginAtZero) {
            setScaleBeginAtZero(scaleBeginAtZero);
            return this;
        }

        @JsOverlay
        default Props scaleBackdropPaddingY(final double scaleBackdropPaddingY) {
            setScaleBackdropPaddingY(scaleBackdropPaddingY);
            return this;
        }

        @JsOverlay
        default Props scaleBackdropPaddingX(final double scaleBackdropPaddingX) {
            setScaleBackdropPaddingX(scaleBackdropPaddingX);
            return this;
        }

        @JsOverlay
        default Props scaleShowLine(final boolean scaleShowLine) {
            setScaleShowLine(scaleShowLine);
            return this;
        }

        @JsOverlay
        default Props segmentShowStroke(final boolean segmentShowStroke) {
            setSegmentShowStroke(segmentShowStroke);
            return this;
        }

        @JsOverlay
        default Props segmentStrokeColor(final String segmentStrokeColor) {
            setSegmentStrokeColor(segmentStrokeColor);
            return this;
        }

        @JsOverlay
        default Props segmentStrokeWidth(final double segmentStrokeWidth) {
            setSegmentStrokeWidth(segmentStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props animationSteps(final double animationSteps) {
            setAnimationSteps(animationSteps);
            return this;
        }

        @JsOverlay
        default Props animationEasing(final String animationEasing) {
            setAnimationEasing(animationEasing);
            return this;
        }

        @JsOverlay
        default Props animateRotate(final boolean animateRotate) {
            setAnimateRotate(animateRotate);
            return this;
        }

        @JsOverlay
        default Props animateScale(final boolean animateScale) {
            setAnimateScale(animateScale);
            return this;
        }

        @JsOverlay
        default Props legendTemplate(final String legendTemplate) {
            setLegendTemplate(legendTemplate);
            return this;
        }

    }


    /**
     *
     */
    @JsType(isNative = true)
    public interface Data {
        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        String getHighlight();

        @JsProperty
        void setHighlight(String highlight);

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

    }

}
