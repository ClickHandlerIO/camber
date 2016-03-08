package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


public class AreaChart extends ExternalComponent<AreaChart.Props> {

    @Inject
    public AreaChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props {
        double id;
        String namespace;
        String className;
        double height;
        double width;
        Object origin;
        boolean xDomainUpdate;
        boolean yDomainUpdate;
        String yMousePointerDisplayLocation;
        Object padding;

        Func.Run xScale;
        Func.Run yScale;
        Func.Run yMousePointerDisplayFormat;

        // areachart specific
        String fill;
        double[] plotData;
        String stroke;
        double opacity;

        Func.Run base;
        Func.Run xAccesor;
        Func.Run yAccesor;

        // coordinate objects
        XAxis xAxis;
        YAxis yAxis;

    }
}
