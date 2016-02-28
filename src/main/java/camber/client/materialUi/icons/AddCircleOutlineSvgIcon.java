package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class AddCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AddCircleOutline;
    }-*/;
}
