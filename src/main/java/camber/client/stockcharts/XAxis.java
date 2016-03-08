package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class XAxis extends ExternalComponent<XAxis.Props> {

    @Inject
    public XAxis() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String axisAt; // top, middle, bottom
        String orient; // top, bottom
        Object range;
        double ticks;
        double innerTickSize;
        double outerTickSize;
        Object tickFormat;
        Object tickPadding;
        Object tickSize;
        Object[] tickValues;



    }
}
