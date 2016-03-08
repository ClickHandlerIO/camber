package camber.client.victory;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * this is an enhanced label
 */
public class VictoryLine extends ExternalComponent<VictoryLine.Props> {

    @Inject
    public VictoryLine() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryLine;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object animate;
        Object[] data;
        Object domain; // object with a min and max, examples ['a', 'z'], {x: [0, 100], y: [0, 1]}
        double height;
        double width;
        String interpolation;
        Object label;
        Object padding; // double or shape object
        Object samples;
        Object scale;
        boolean standalone;
        // todo - handle style, it's more complex here
        Object style;
        Object x; // can be string or function also
        Object y;


    }
}
