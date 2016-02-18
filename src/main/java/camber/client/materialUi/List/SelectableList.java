package camber.client.materialUi.List;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
public class SelectableList extends ExternalComponent<SelectableList.Props> {

    @Inject
    public SelectableList() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.SelectableList;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public boolean insetSubheader;
        public Object style;
        public ReactElement subheader;
        public Object subheaderStyle;
        public int zDepth;

    }
}
