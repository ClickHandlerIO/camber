package materialUiGwt.client.components.Menus;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *
 */
public class MenuItem {
    @JsType
    public static class Props {
        boolean checked;
        boolean desktop;
        boolean disabled;
        String focusState; // enum 'none' 'focused' 'keyboard-focused'
        String innerDivStyle; // ?
        boolean insetChildren;
        ReactElement leftIcon;
        ReactElement menuItems; // nested MenuItems for this menu item, for nested menus
        ReactElement rightIcon;
        ReactElement secondaryText; // node - clock element for secondary text, if string passed in it becomes a div
        String style; // ?
        Object value; // any

        // functions
        Object onChange; // func
        Object onEscKeyDown; // func
        Object onItemTouchTap; // func
        Object onKeyDown; // func
        Object onTouchTap; // func


    }
}
