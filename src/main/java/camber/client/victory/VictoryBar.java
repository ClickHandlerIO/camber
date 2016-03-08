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
public class VictoryBar extends ExternalComponent<VictoryBar.Props> {

    @Inject
    public VictoryBar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryBar;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        VictoryAnimation animate;
        Object[] data;
        Object dataAttributes;
        Object[] categories; // double or String array - like tick values
        Object colorScale; // string, or array of css colors
        Object domain; // object with a min and max, examples [-1, 1], {x: [0, 100], y: [0, 1]}
        Object domainPadding;
        boolean grouped;
        boolean horizontal;
        double height;
        double width;
        Object[] labels; // string or element
        ReactElement labelComponent;
        Object padding; // can be a double or an object with top: left: etc. double values
        String scale; // can be something else but don't use it that way
        boolean stacked;
        boolean standalone;
        Object x;
        Object y;
        // todo - handle style a better way? is more complex here
        Object style;

        MouseEventHandler onClick;


    }
}
