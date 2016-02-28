package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class AddShoppingCartSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddShoppingCartSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.AddShoppingCart;
    }-*/;
}
