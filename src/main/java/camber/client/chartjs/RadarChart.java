package camber.client.chartjs;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  in JS: var myRadarChart = new Chart(ctx).Radar(data, options);
 */
public class RadarChart extends ExternalComponent<RadarChart.Props> {

    @Inject
    public RadarChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // chart specific options
//        Data data;
//        boolean scaleShowLine;
//        boolean angleShowLineOut;
//        boolean scaleShowLabels;
//        boolean scaleBeginAtZero;
//        String angleLineColor;
//        double angleLineWidth;
//        String pointLabelFontFamily;
//        String pointLabelFontStyle; // defaults to "normal",  would be CSSProps but not actual style
//        double pointLabelFontSize;
//        String pointLabelFontColor;
//        boolean pointDot;
//        double pointDotRadius;
//        double pointDotStrokeWidth;
//        double pointHitDetectionRadius;
//        boolean datasetStroke;
//        double datasetStrokeWidth;
//        boolean datasetFill;
//        String legendTemplate;


        @JsProperty
        Data getData();

        @JsProperty
        void setData(Data data);

        @JsProperty
        boolean isScaleShowLine();

        @JsProperty
        void setScaleShowLine(boolean scaleShowLine);

        @JsProperty
        boolean isAngleShowLineOut();

        @JsProperty
        void setAngleShowLineOut(boolean angleShowLineOut);

        @JsProperty
        boolean isScaleShowLabels();

        @JsProperty
        void setScaleShowLabels(boolean scaleShowLabels);

        @JsProperty
        boolean isScaleBeginAtZero();

        @JsProperty
        void setScaleBeginAtZero(boolean scaleBeginAtZero);

        @JsProperty
        String getAngleLineColor();

        @JsProperty
        void setAngleLineColor(String angleLineColor);

        @JsProperty
        double getAngleLineWidth();

        @JsProperty
        void setAngleLineWidth(double angleLineWidth);

        @JsProperty
        String getPointLabelFontFamily();

        @JsProperty
        void setPointLabelFontFamily(String pointLabelFontFamily);

        @JsProperty
        String getPointLabelFontStyle();

        @JsProperty
        void setPointLabelFontStyle(String pointLabelFontStyle);

        @JsProperty
        double getPointLabelFontSize();

        @JsProperty
        void setPointLabelFontSize(double pointLabelFontSize);

        @JsProperty
        String getPointLabelFontColor();

        @JsProperty
        void setPointLabelFontColor(String pointLabelFontColor);

        @JsProperty
        boolean isPointDot();

        @JsProperty
        void setPointDot(boolean pointDot);

        @JsProperty
        double getPointDotRadius();

        @JsProperty
        void setPointDotRadius(double pointDotRadius);

        @JsProperty
        double getPointDotStrokeWidth();

        @JsProperty
        void setPointDotStrokeWidth(double pointDotStrokeWidth);

        @JsProperty
        double getPointHitDetectionRadius();

        @JsProperty
        void setPointHitDetectionRadius(double pointHitDetectionRadius);

        @JsProperty
        boolean isDatasetStroke();

        @JsProperty
        void setDatasetStroke(boolean datasetStroke);

        @JsProperty
        double getDatasetStrokeWidth();

        @JsProperty
        void setDatasetStrokeWidth(double datasetStrokeWidth);

        @JsProperty
        boolean isDatasetFill();

        @JsProperty
        void setDatasetFill(boolean datasetFill);

        @JsProperty
        String getLegendTemplate();

        @JsProperty
        void setLegendTemplate(String legendTemplate);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final Data data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props scaleShowLine(final boolean scaleShowLine) {
            setScaleShowLine(scaleShowLine);
            return this;
        }

        @JsOverlay
        default Props angleShowLineOut(final boolean angleShowLineOut) {
            setAngleShowLineOut(angleShowLineOut);
            return this;
        }

        @JsOverlay
        default Props scaleShowLabels(final boolean scaleShowLabels) {
            setScaleShowLabels(scaleShowLabels);
            return this;
        }

        @JsOverlay
        default Props scaleBeginAtZero(final boolean scaleBeginAtZero) {
            setScaleBeginAtZero(scaleBeginAtZero);
            return this;
        }

        @JsOverlay
        default Props angleLineColor(final String angleLineColor) {
            setAngleLineColor(angleLineColor);
            return this;
        }

        @JsOverlay
        default Props angleLineWidth(final double angleLineWidth) {
            setAngleLineWidth(angleLineWidth);
            return this;
        }

        @JsOverlay
        default Props pointLabelFontFamily(final String pointLabelFontFamily) {
            setPointLabelFontFamily(pointLabelFontFamily);
            return this;
        }

        @JsOverlay
        default Props pointLabelFontStyle(final String pointLabelFontStyle) {
            setPointLabelFontStyle(pointLabelFontStyle);
            return this;
        }

        @JsOverlay
        default Props pointLabelFontSize(final double pointLabelFontSize) {
            setPointLabelFontSize(pointLabelFontSize);
            return this;
        }

        @JsOverlay
        default Props pointLabelFontColor(final String pointLabelFontColor) {
            setPointLabelFontColor(pointLabelFontColor);
            return this;
        }

        @JsOverlay
        default Props pointDot(final boolean pointDot) {
            setPointDot(pointDot);
            return this;
        }

        @JsOverlay
        default Props pointDotRadius(final double pointDotRadius) {
            setPointDotRadius(pointDotRadius);
            return this;
        }

        @JsOverlay
        default Props pointDotStrokeWidth(final double pointDotStrokeWidth) {
            setPointDotStrokeWidth(pointDotStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props pointHitDetectionRadius(final double pointHitDetectionRadius) {
            setPointHitDetectionRadius(pointHitDetectionRadius);
            return this;
        }

        @JsOverlay
        default Props datasetStroke(final boolean datasetStroke) {
            setDatasetStroke(datasetStroke);
            return this;
        }

        @JsOverlay
        default Props datasetStrokeWidth(final double datasetStrokeWidth) {
            setDatasetStrokeWidth(datasetStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props datasetFill(final boolean datasetFill) {
            setDatasetFill(datasetFill);
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
        String[] getLabels();

        @JsProperty
        void setLabels(String[] labels);

        @JsProperty
        Dataset[] getDatasets();

        @JsProperty
        void setDatasets(Dataset[] datasets);

    }

    /**
     *
     */
    @JsType(isNative = true)
    public interface Dataset {
        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        String getFillColor();

        @JsProperty
        void setFillColor(String fillColor);

        @JsProperty
        String getPointColor();

        @JsProperty
        void setPointColor(String pointColor);

        @JsProperty
        String getPointStrokeColor();

        @JsProperty
        void setPointStrokeColor(String pointStrokeColor);

        @JsProperty
        String getPointHighlightFill();

        @JsProperty
        void setPointHighlightFill(String pointHighlightFill);

        @JsProperty
        String getPointHighlightStroke();

        @JsProperty
        void setPointHighlightStroke(String pointHighlightStroke);

        @JsProperty
        double[] getData();

        @JsProperty
        void setData(double[] data);
    }

}
