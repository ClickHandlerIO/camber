package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class IconMenu extends ExternalComponent<IconMenu.Props> {

    @Inject
    public IconMenu() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.IconMenu;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public Origin anchorOrigin;
        public String className;
        public boolean closeOnItemTouchTap;
        public ReactElement iconButtonElement;
        public CSSProps iconStyle;
        public CSSProps menuStyle;
        public TouchEventHandler onItemTouchTap;
        public KeyboardEventHandler onKeyboardFocus;
        public MouseEventHandler onMouseDown;
        public MouseEventHandler onMouseEnter;
        public MouseEventHandler onMouseLeave;
        public MouseEventHandler onMouseUp;
        public Func.Run onRequestChange;
        public TouchEventHandler onTouchTap;
        public boolean open;
        public CSSProps style;
        public Origin targetOrigin;
        public int touchTapCloseDelay;

        @Inject
        public Props() {
        }
    }

    @JsType
    public static class Origin {
        public String vertical; // top, middle, bottom
        public String horizontal; // left, center, right
    }
}
