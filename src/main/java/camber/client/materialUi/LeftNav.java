package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LeftNav extends ExternalComponent<LeftNav.Props> {

    @Inject
    public LeftNav() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.LeftNav;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public String className;
        public boolean disableSwipeToOpen;
        public boolean docked = true;
        public Boolean open; // uses Boolean because can be null, null value means uncontrolled
        public boolean openRight;
        public String overlayClassName;
        public Object overlayStyle;
        public CSSProps style;
        public int swipeAreaWidth;
        public Integer width; // can be null, defaulting to value from theme
        public Func.Run2<Boolean, Object> onRequestChange; // TODO get this to work (need to pass in a function

        @Inject
        public Props() {
        }
    }
}
