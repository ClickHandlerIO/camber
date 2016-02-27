package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class UnarchiveSvgIcon extends AbstractMaterialIcon {

    @Inject
    public UnarchiveSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Unarchive;
    }-*/;
}
