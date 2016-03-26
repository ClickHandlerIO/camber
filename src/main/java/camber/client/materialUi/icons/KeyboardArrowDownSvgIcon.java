package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class KeyboardArrowDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public KeyboardArrowDownSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.KeyboardArrowDown;
    }-*/;
}
