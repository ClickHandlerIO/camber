package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class RemoveCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public RemoveCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.RemoveCircle;
    }-*/;
}
