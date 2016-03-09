package camber.client.stockcharts.customizable;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  is needed to use other transforms, or can be used alone with charts like Candlestick
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
    public class Props extends BaseProps {
        Object[] data;
        double width;
        String type; // svg, canvas

        Func.Run1<StockscaleTransformer> fitWidth; // used for this component



    }
}
