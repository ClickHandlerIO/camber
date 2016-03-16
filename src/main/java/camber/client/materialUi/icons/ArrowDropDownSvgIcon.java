package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ArrowDropDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropDownSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.ArrowDropDown;
    }-*/;
}
