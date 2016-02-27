package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class PersonAddSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PersonAddSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.PersonAdd;
    }-*/;
}
