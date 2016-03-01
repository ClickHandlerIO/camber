package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  in JS:  var myPieChart = new Chart(ctx[0]).Pie(data,options);
 */
public class PieChart extends ExternalComponent<PieChart.Props> {

    @Inject
    public PieChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // chart specific options
//        Data[] data;
//        boolean segmentShowStroke;
//        String segmentStrokeColor;
//        double segmentStrokeWidth;
//        double percentageInnerCutout; // 0 for pie chart
//        double animationSteps;
//        String animationEasing;
//        boolean animateRotate;
//        boolean animateScale;
//        String legendTemplate;

        @JsProperty
        Data[] getData();

        @JsProperty
        void setData(Data[] data);

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
        double getPercentageInnerCutout();

        @JsProperty
        void setPercentageInnerCutout(double percentageInnerCutout);

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
        default Props percentageInnerCutout(final double percentageInnerCutout) {
            setPercentageInnerCutout(percentageInnerCutout);
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
