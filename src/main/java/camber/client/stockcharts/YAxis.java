package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class YAxis extends ExternalComponent<YAxis.Props> {

    @Inject
    public YAxis() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String axisAt; // left, middle, right
        String orient; // left, right
        Object range;
        boolean percentScale;
        double ticks;
        double innerTickSize;
        double outerTickSize;
        Object tickFormat;
        Object tickPadding;
        Object tickSize;
        Object[] tickValues;



    }
}
