package camber.client.stockcharts.customizable;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *   Component that can be added to graphs
 */
public class Brush extends ExternalComponent<Brush.Props> {

    @Inject
    public Brush() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String ref; // taking out for now since externalcomponent has this as well
//        double id;
//        boolean enabled;
//        Object[] items;
//        double[] xRange;
//        Func.Run2<double[], Object[]> onBrush;


        @JsProperty
        double getId();

        @JsProperty
        void setId(double id);

        @JsProperty
        boolean isEnabled();

        @JsProperty
        void setEnabled(boolean enabled);

        @JsProperty
        Object[] getItems();

        @JsProperty
        void setItems(Object[] items);

        @JsProperty
        double[] getxRange();

        @JsProperty
        void setxRange(double[] xRange);

        @JsProperty
        Func.Run2<double[], Object[]> getOnBrush();

        @JsProperty
        void setOnBrush(Func.Run2<double[], Object[]> onBrush);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props id(final double id) {
            setId(id);
            return this;
        }

        @JsOverlay
        default Props enabled(final boolean enabled) {
            setEnabled(enabled);
            return this;
        }

        @JsOverlay
        default Props items(final Object[] items) {
            setItems(items);
            return this;
        }

        @JsOverlay
        default Props xRange(final double[] xRange) {
            setxRange(xRange);
            return this;
        }

        @JsOverlay
        default Props onBrush(final Func.Run2<double[], Object[]> onBrush) {
            setOnBrush(onBrush);
            return this;
        }


    }
}
