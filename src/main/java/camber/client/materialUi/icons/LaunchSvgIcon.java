package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class LaunchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public LaunchSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Launch;
    }-*/;
}
