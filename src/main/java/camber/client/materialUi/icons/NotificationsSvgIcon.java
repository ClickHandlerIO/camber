package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class NotificationsSvgIcon extends AbstractMaterialIcon {

    @Inject
    public NotificationsSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Notifications;
    }-*/;
}
