package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class MailOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MailOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.MailOutline;
    }-*/;
}
