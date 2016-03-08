package camber.client.victory;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * these libraries are in alpha and may be updated soon
 */
public class VictoryScatter extends ExternalComponent<VictoryScatter.Props> {

    @Inject
    public VictoryScatter() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryScatter;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {

        VictoryAnimation animate;
        String bubbleProperty;
        Object[] data;
        Object domain; // object with a min and max, examples ['a', 'z'], {x: [0, 100], y: [0, 1]}
        double height;
        double width;
        ReactElement labelComponent;
        double maxBubbleSize;
        Object padding; // number or object
        Object samples;
        Object scale;
        boolean showLabels;
        Object size;
        boolean standalone;
        String symbol;
        Object style;
        Object x; // can be string or function also
        Object y;

        MouseEventHandler onClick;





    }
}
