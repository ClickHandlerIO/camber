package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * A pre-wrapped, less props, sophisticated graph
 */
public class PointAndFigure extends ExternalComponent<PointAndFigure.Props> {

    @Inject
    public PointAndFigure() {
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

        Func.Run1<PointAndFigure> fitWidth; // used for this component
        MouseEventHandler onClick;



    }
}
