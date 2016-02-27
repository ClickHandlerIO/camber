package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class ReplySvgIcon extends AbstractMaterialIcon {

    @Inject
    public ReplySvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Reply;
    }-*/;
}
