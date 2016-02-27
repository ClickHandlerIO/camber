package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class GpsFixedSvgIcon extends AbstractMaterialIcon {

    @Inject
    public GpsFixedSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.GpsFixed;
    }-*/;
}
