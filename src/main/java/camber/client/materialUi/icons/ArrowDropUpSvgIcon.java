package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ArrowDropUpSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropUpSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.ArrowDropUp;
    }-*/;
}
