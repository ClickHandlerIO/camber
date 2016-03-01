package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
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



        ////////////////////
        // fluent setters
        ////////////////////


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
