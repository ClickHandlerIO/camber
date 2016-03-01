package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  in JS this is instantiated like:  var myBarChart = new Chart(ctx).Bar(data, options);
 */
public class BarChart extends ExternalComponent<BarChart.Props> {

    @Inject
    public BarChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // bar chart specific options
//        MouseEventHandler onClick; // func - leaving this out for now as the javascript seems to handle clicks based on where the chart is clicked
//        boolean scaleBeginAtZero;
//        boolean scaleShowGridLines;
//        String scaleGridLineColor;
//        double scaleGridLineWidth;
//        boolean scaleShowHorizontalLines;
//        boolean scaleShowVerticalLines;
//        boolean barShowStroke;
//        double barStrokeWidth;
//        double barValueSpacing;
//        double barDatasetSpacing;
//        String legendTemplate; // default messy string - "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"


        @JsProperty
        boolean isScaleBeginAtZero();


        @JsProperty
        void setScaleBeginAtZero(boolean scaleBeginAtZero);


        @JsProperty
        boolean isScaleShowGridLines();


        @JsProperty
        void setScaleShowGridLines(boolean scaleShowGridLines);


        @JsProperty
        String getScaleGridLineColor();


        @JsProperty
        void setScaleGridLineColor(String scaleGridLineColor);


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
        boolean isBarShowStroke();


        @JsProperty
        void setBarShowStroke(boolean barShowStroke);


        @JsProperty
        double getBarStrokeWidth();


        @JsProperty
        void setBarStrokeWidth(double barStrokeWidth);


        @JsProperty
        double getBarValueSpacing();


        @JsProperty
        void setBarValueSpacing(double barValueSpacing);


        @JsProperty
        double getBarDatasetSpacing();


        @JsProperty
        void setBarDatasetSpacing(double barDatasetSpacing);


        @JsProperty
        String getLegendTemplate();


        @JsProperty
        void setLegendTemplate(String legendTemplate);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props scaleBeginAtZero(final boolean scaleBeginAtZero) {
            setScaleBeginAtZero(scaleBeginAtZero);
            return this;
        }

        @JsOverlay
        default Props scaleShowGridLines(final boolean scaleShowGridLines) {
            setScaleShowGridLines(scaleShowGridLines);
            return this;
        }

        @JsOverlay
        default Props scaleGridLineColor(final String scaleGridLineColor) {
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
        default Props barShowStroke(final boolean barShowStroke) {
            setBarShowStroke(barShowStroke);
            return this;
        }

        @JsOverlay
        default Props barStrokeWidth(final double barStrokeWidth) {
            setBarStrokeWidth(barStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props barValueSpacing(final double barValueSpacing) {
            setBarValueSpacing(barValueSpacing);
            return this;
        }

        @JsOverlay
        default Props barDatasetSpacing(final double barDatasetSpacing) {
            setBarDatasetSpacing(barDatasetSpacing);
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
        String getStrokeColor();

        @JsProperty
        void setStrokeColor(String strokeColor);

        @JsProperty
        String getHighlightFill();

        @JsProperty
        void setHighlightFill(String highlightFill);

        @JsProperty
        String getHighlightStroke();

        @JsProperty
        void setHighlightStroke(String highlightStroke);

        @JsProperty
        double[] getData();

        @JsProperty
        void setData(double[] data);
    }

}
