package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * base chart for some charts
 */
public class Chart extends ExternalComponent<Chart.Props> {

    @Inject
    public Chart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        double id;
        String transformDataAs; // appears needed if a transformer is applied to the chart
        double height;
        double width;
        boolean xDomainUpdate;
        boolean yDomainUpdate;
        String yMousePointerDisplayLocation;
        Object padding;
        Object origin; // can be array or func, defaults as 2 item double array for coordinates, but can be function

        Func.Run xScale;
        Func.Run yScale;
        Func.Run yMousePointerDisplayFormat;


    }
}
