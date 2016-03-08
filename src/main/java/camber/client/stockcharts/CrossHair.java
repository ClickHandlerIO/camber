package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class CrossHair extends ExternalComponent<CrossHair.Props> {

    @Inject
    public CrossHair() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String namespace;
        double yAxisPad;
        double height;
        double width;
        Object[] mouseXY;
        String xDisplayValue;
        Object[] edges;


    }
}
