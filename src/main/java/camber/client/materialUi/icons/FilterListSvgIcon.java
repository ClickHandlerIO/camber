package camber.client.materialUi.icons;

import io.clickhandler.web.react.ReactClass;

import javax.inject.Inject;


public class FilterListSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FilterListSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Icons.FilterList;
    }-*/;
}
