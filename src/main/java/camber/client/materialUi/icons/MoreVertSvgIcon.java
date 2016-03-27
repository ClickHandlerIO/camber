package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class MoreVertSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreVertSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.MoreVert;
    }-*/;
}
