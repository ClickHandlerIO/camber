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
public class VictoryLabel extends ExternalComponent<VictoryLabel.Props> {

    @Inject
    public VictoryLabel() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryLabel;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object capHeight;
        Object data;
        double lineHeight;
        Object style;
        Object textAnchor;
        Object verticalAnchor;
        Object transform;
        double x;
        double y;
        Object dx;
        Object dy;


    }
}
