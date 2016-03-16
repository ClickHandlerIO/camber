package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class DragHandleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public DragHandleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.DragHandle;
    }-*/;
}
