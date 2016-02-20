package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class MenuSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MenuSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Menu;
    }-*/;
}
