package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class FileUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.FileUpload;
    }-*/;
}
