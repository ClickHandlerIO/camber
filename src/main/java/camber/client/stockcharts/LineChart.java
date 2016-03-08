package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


public class LineChart extends ExternalComponent<LineChart.Props> {

    @Inject
    public LineChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props {
        // not yet as developed as other chart types
        String className;
        double id;
        String namespace;
        String fill;
        Object[] plotData;
        String stroke;

        Func.Run xScale;
        Func.Run yScale;
        Func.Run xAccesor;
        Func.Run yAccesor;




    }
}
