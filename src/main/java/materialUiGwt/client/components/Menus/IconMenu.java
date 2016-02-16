package materialUiGwt.client.components.menus;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class IconMenu {
    @JsType
    public static class Props {
        String anchorOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
        String targetOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
        String className;
        boolean closeOnItemTouchTap = true;
        ReactElement iconButtonElement;  // only required here
        String iconStyle;
        String menuStyle;
        boolean open;
        String style;
        int touchTapCloseDelay = 200;

        // functions
        Object onItemTouchTap; // func
        Object onKeyboardFocus; // func
        Object onMouseDown; // func
        Object onMouseEnter; // func
        Object onMouseLeave; // func
        Object onMouseUp; // func
        Object onRequestChange; // func
        Object onTouchTap; // func


    }
}
