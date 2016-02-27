package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ChevronRightSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronRightSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.ChevronRight;
    }-*/;
}
