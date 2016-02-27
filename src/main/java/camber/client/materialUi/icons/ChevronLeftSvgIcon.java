package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ChevronLeftSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronLeftSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.ChevronLeft;
    }-*/;
}