package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class RemoveCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public RemoveCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.RemoveCircleOutline;
    }-*/;
}
