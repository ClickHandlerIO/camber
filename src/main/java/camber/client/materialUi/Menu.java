package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class Menu extends ExternalComponent<Menu.Props> {

    @Inject
    public Menu() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Menu;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public boolean animated;
        public boolean autoWidth;
        public boolean desktop;
        public boolean initiallyKeyboardFocused;
        public CSSProps listStyle;
        public Integer maxHeight; // can be null
        public boolean multiple;
        public Func.Run onChange; // func
        public KeyboardEventHandler onEscKeyDown;
        public TouchEventHandler onItemTouchTap;
        public KeyboardEventHandler onKeyDown;
        public String openDirection; // ie 'bottom-left'  type = PropTypes.corners
        public CSSProps selectedMenuItemStyle;
        public CSSProps style;
        public Object value;
        public Object valueLink;
        public int width;
        public int zDepth;

        @Inject
        public Props() {
        }
    }
}
