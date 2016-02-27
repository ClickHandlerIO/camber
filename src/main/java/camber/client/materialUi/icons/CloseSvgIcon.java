package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class CloseSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloseSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Close;
    }-*/;
}
