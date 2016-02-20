package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

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
