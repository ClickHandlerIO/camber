package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


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
    }
}
