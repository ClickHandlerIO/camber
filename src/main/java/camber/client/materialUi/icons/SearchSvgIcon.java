package camber.client.materialUi.icons;

import camber.client.ReactClass;

import javax.inject.Inject;


public class SearchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SearchSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.Search;
    }-*/;
}
