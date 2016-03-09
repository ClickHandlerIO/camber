package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class AttachFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AttachFileSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AttachFile;
    }-*/;
}
