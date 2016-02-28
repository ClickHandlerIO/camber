package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class AddCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AddCircle;
    }-*/;
}
