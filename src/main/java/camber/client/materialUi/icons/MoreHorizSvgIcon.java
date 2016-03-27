package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class MoreHorizSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreHorizSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.MoreHoriz;
    }-*/;
}
