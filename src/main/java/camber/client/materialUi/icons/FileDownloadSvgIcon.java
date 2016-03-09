package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class FileDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.FileDownload;
    }-*/;
}
