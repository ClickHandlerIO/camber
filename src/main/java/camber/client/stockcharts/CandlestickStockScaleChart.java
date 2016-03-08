package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * single component for candlestick chart with finance time scale, is shown that is can be combined like this in demo
 */
public class CandlestickStockScaleChart extends ExternalComponent<CandlestickStockScaleChart.Props> {

    @Inject
    public CandlestickStockScaleChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String className;
        String wickClassName;
        String candleClassName;
        Object[] classNames; //  string array or shape array
        double widthRatio;
        Object[] stroke; //  string array or shape array
        Object[] wickStroke; //  string array or shape array
        Object[] fill; //  string array or shape array
        Object[] compareSeries;
        Object[] plotData;
        double opacity;
        Func.Run xScale;
        Func.Run yScale;
        Func.Run xAccesor;
        Func.Run yAccesor;

        // financial time props
        Object[] data;
        double width;
        String type; // svg, canvas
        Func.Run1<StockscaleTransformer> fitWidth; // used for this component



    }
}
