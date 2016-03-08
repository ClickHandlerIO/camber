package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * can be use with charts like Candlestick
 */
public class HeikinAshiTransformer extends ExternalComponent<HeikinAshiTransformer.Props> {

    @Inject
    public HeikinAshiTransformer() {
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

        Func.Run1<HeikinAshiTransformer> fitWidth; // used for this component



    }
}
