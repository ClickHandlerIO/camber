package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class CloudDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.CloudUpload;
    }-*/;
}
