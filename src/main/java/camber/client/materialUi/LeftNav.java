package camber.client.materialUi;

import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;
import camber.client.ExternalComponent;
import camber.client.ReactClass;

import javax.inject.Inject;

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
        public String overlayStyle; //
        public String style; // ?
        public int swipeAreaWidth; // default 30
        public Integer width; // can be null, defaulting to value from theme
        public Object onRequestChange; // func
    }
}
