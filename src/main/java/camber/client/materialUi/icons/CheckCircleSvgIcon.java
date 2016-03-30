package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class CheckCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CheckCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.CheckCircle;
    }-*/;
}
