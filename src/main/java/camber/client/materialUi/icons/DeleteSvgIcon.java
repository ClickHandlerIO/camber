package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class DeleteSvgIcon extends AbstractMaterialIcon {

    @Inject
    public DeleteSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Delete;
    }-*/;
}
