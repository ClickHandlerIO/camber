package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


public class LaunchSvgIcon extends ExternalComponent<LaunchSvgIcon.Props> {

    @Inject
    public LaunchSvgIcon() {
    }

    @Override
    protected native ReactClass<LaunchSvgIcon.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Launch;
    }-*/;

    @JsType
    public static class Props extends SvgIcon.Props {
    }
}
