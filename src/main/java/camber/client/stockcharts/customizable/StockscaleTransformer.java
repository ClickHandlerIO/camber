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
 *  component that can be used with graphs to customize
 */
public class StockscaleTransformer extends ExternalComponent<StockscaleTransformer.Props> {

    @Inject
    public StockscaleTransformer() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        Object[] data;
//        double width;
//        String type; // svg, canvas
////        Func.Run1<StockscaleTransformer> fitWidth; // used for this component, leaving out for now


        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props type(final String type) {
            setType(type);
            return this;
        }


    }
}
