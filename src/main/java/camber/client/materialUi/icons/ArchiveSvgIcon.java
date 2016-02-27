package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ArchiveSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArchiveSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Archive;
    }-*/;
}
