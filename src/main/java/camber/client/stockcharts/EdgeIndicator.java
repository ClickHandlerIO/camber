package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class EdgeIndicator extends ExternalComponent<EdgeIndicator.Props> {

    @Inject
    public EdgeIndicator() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String itemType;
//        String orient;
//        String edgeAt;
//        double forChart;
//        double forDataSeries;
//        Object displayFormat;

        @JsProperty
        String getItemType();

        @JsProperty
        void setItemType(String itemType);

        @JsProperty
        String getOrient();

        @JsProperty
        void setOrient(String orient);

        @JsProperty
        String getEdgeAt();

        @JsProperty
        void setEdgeAt(String edgeAt);

        @JsProperty
        double getForChart();

        @JsProperty
        void setForChart(double forChart);

        @JsProperty
        double getForDataSeries();

        @JsProperty
        void setForDataSeries(double forDataSeries);

        @JsProperty
        Object getDisplayFormat();

        @JsProperty
        void setDisplayFormat(Object displayFormat);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props itemType(final String itemType) {
            setItemType(itemType);
            return this;
        }

        @JsOverlay
        default Props orient(final String orient) {
            setOrient(orient);
            return this;
        }

        @JsOverlay
        default Props edgeAt(final String edgeAt) {
            setEdgeAt(edgeAt);
            return this;
        }

        @JsOverlay
        default Props forChart(final double forChart) {
            setForChart(forChart);
            return this;
        }

        @JsOverlay
        default Props forDataSeries(final double forDataSeries) {
            setForDataSeries(forDataSeries);
            return this;
        }

        @JsOverlay
        default Props displayFormat(final Object displayFormat) {
            setDisplayFormat(displayFormat);
            return this;
        }


    }
    


}
