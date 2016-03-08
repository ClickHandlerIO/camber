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
public class HistogramSeries extends ExternalComponent<HistogramSeries.Props> {

    @Inject
    public HistogramSeries() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String className;
        String baseAt; // top, bottom, middle
        String direction; // up, down
        boolean stroke;
        Object fill; // can be string or specific func
        double opacity;
        double widthRatio;
        Object[] plotData;

        Func.Run xScale;
        Func.Run yScale;
        Func.Run xAccesor;
        Func.Run yAccesor;



    }
}
