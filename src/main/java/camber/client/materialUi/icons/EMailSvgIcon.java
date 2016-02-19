package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class EmailSvgIcon extends AbstractMaterialIcon {

    @Inject
    public EmailSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Email;
    }-*/;
}
