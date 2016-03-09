package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class CloudUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.CloudUpload;
    }-*/;
}
