package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class AccountCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AccountCircle;
    }-*/;
}
