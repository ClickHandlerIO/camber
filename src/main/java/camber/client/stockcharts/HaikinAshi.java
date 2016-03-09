package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * A pre-wrapped sophisticated graph
 * Spelled 'HeikinAshi' in documentation, but HaikinAshi in sample code so using that here.
 */
public class HaikinAshi extends ExternalComponent<HaikinAshi.Props> {

    @Inject
    public HaikinAshi() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object[] data;
        double width;
        String type; // svg, hybrid

        Func.Run1<HaikinAshi> fitWidth; // used for this component
        MouseEventHandler onClick;



    }
}
