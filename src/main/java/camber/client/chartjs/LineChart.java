package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  in JS this is instantiated like:  var myLineChart = new Chart(ctx).Line(data, options);
 */
public class LineChart extends ExternalComponent<LineChart.Props> {

    @Inject
    public LineChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // line chart specific options
//        boolean scaleShowGridLines;
//        boolean scaleGridLineColor;
//        double scaleGridLineWidth;
//        boolean scaleShowHorizontalLines;
//        boolean scaleShowVerticalLines;
//        boolean bezierCurve;  // whether the line is curved between points
//        boolean bezierTension; // tension of the curve
//        boolean pointDot;
//        double pointDotRadius;
//        double pointDotStrokeWidth;
//        double pointHitDetectionRadius;
//        boolean datasetStroke;
//        double datasetStrokeWidth;
//        boolean datasetFill;
//        String legendTemplate; // defaults to "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
//        MouseEventHandler onClick; // func - leaving this out for now as the javascript seems to handle clicks based on where the chart is clicked

        @JsProperty
        Data getData();

        @JsProperty
        void setData(Data data);

        @JsProperty
        boolean isScaleShowGridLines();

        @JsProperty
        void setScaleShowGridLines(boolean scaleShowGridLines);

        @JsProperty
        boolean isScaleGridLineColor();

        @JsProperty
        void setScaleGridLineColor(boolean scaleGridLineColor);

        @JsProperty
        double getScaleGridLineWidth();

        @JsProperty
        void setScaleGridLineWidth(double scaleGridLineWidth);

        @JsProperty
        boolean isScaleShowHorizontalLines();

        @JsProperty
        void setScaleShowHorizontalLines(boolean scaleShowHorizontalLines);

        @JsProperty
        boolean isScaleShowVerticalLines();

        @JsProperty
        void setScaleShowVerticalLines(boolean scaleShowVerticalLines);

        @JsProperty
        boolean isBezierCurve();

        @JsProperty
        void setBezierCurve(boolean bezierCurve);

        @JsProperty
        boolean isBezierTension();

        @JsProperty
        void setBezierTension(boolean bezierTension);

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

//        @JsProperty
//        MouseEventHandler getOnClick();
//
//        @JsProperty
//        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final Data data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props scaleShowGridLines(final boolean scaleShowGridLines) {
            setScaleShowGridLines(scaleShowGridLines);
            return this;
        }

        @JsOverlay
        default Props scaleGridLineColor(final boolean scaleGridLineColor) {
            setScaleGridLineColor(scaleGridLineColor);
            return this;
        }

        @JsOverlay
        default Props scaleGridLineWidth(final double scaleGridLineWidth) {
            setScaleGridLineWidth(scaleGridLineWidth);
            return this;
        }

        @JsOverlay
        default Props scaleShowHorizontalLines(final boolean scaleShowHorizontalLines) {
            setScaleShowHorizontalLines(scaleShowHorizontalLines);
            return this;
        }

        @JsOverlay
        default Props scaleShowVerticalLines(final boolean scaleShowVerticalLines) {
            setScaleShowVerticalLines(scaleShowVerticalLines);
            return this;
        }

        @JsOverlay
        default Props bezierCurve(final boolean bezierCurve) {
            setBezierCurve(bezierCurve);
            return this;
        }

        @JsOverlay
        default Props bezierTension(final boolean bezierTension) {
            setBezierTension(bezierTension);
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

//        @JsOverlay
//        default Props onClick(final MouseEventHandler onClick) {
//            setOnClick(onClick);
//            return this;
//        }


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
     * capitalized as such in js
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
