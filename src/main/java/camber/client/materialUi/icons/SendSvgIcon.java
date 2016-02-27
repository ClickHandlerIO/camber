package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class SendSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SendSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Send;
    }-*/;
}
