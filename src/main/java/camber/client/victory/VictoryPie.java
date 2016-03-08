package camber.client.victory;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * this is an enhanced label
 */
public class VictoryPie extends ExternalComponent<VictoryPie.Props> {

    @Inject
    public VictoryPie() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryLine;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object animate;
        Object colorScale; // string, or array of css colors
        Object[] data;
        double endAngle;
        double height;
        double width;
        double innerRadius;
        ReactElement labelComponent;
        double padAngle;;
        Object padding; // double or shape object
        boolean standalone;
        double startAngle;
        // todo - handle style, it's more complex here
        Object style;
        Object x; // can be string or function also
        Object y;



    }
}
