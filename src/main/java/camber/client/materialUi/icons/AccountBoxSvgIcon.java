package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class AccountBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountBoxSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AccountBox;
    }-*/;
}
