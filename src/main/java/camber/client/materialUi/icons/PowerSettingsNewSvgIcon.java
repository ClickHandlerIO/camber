package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class PowerSettingsNewSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PowerSettingsNewSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.PowerSettingsNew;
    }-*/;
}
