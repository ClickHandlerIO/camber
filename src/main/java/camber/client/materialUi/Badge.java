package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Badge extends ExternalComponent<Badge.Props> {

    @Inject
    public Badge() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Badge;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public ReactElement badgeContent;
        public CSSProps badgeStyle;
        public String className;
        public boolean primary;
        public boolean secondary;
        public CSSProps style;

        @Inject
        public Props() {
        }
    }
}
