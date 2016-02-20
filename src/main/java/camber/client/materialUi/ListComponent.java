package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
@Singleton
public class ListComponent extends ExternalComponent<ListComponent.Props> {

    @Inject
    public ListComponent() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.List;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public boolean insetSubheader;
        public CSSProps style;
        public ReactElement subheader;
        public Object subheaderStyle;
        public int zDepth;

        @Inject
        public Props() {
        }
    }
}
