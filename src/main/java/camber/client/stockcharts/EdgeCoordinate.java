package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class EdgeCoordinate extends ExternalComponent<EdgeCoordinate.Props> {

    @Inject
    public EdgeCoordinate() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        String className;
        String namespace;
        String type; // vertical, horizontal
        Object coordinate;
        double x1;
        double y1;
        double x2;
        double y2;
        String orient; // top, bottom, left, right
        double rectWidth;
        boolean hideLine;
        String fill;
        String textFill;
        String lineStroke;
        double lineOpacity;
        double opacity;
        String fontFamily;
        double fontSize;

    }

    @JsType
    class EdgeIndicator {
        String itemType;
        String orient;
        String edgeAt;
        double forChart;
        double dorDataSeries;
        Object displayFormat;
    }


}
