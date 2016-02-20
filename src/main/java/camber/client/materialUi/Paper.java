package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Paper extends ExternalComponent<Paper.Props> {

    @Inject
    public Paper() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Paper;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public boolean circle;
        public boolean rounded;
        public CSSProps style;
        public boolean transitionEnabled;
        public int zDepth;

        @Inject
        public Props() {
        }
    }
}
