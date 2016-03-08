package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * alpha library, please note any updates at https://github.com/rrag/react-stockcharts
 */
public class CandlestickChart extends ExternalComponent<CandlestickChart.Props> {

    @Inject
    public CandlestickChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
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



    }
}
