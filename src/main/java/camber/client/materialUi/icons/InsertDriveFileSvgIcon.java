package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class InsertDriveFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public InsertDriveFileSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.InsertDriveFile;
    }-*/;
}
