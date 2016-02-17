package materialUiGwt.client.components.menus;

import jsinterop.annotations.JsType;

/**
 *
 */
public class Menu {
    @JsType
    public static class Props {
        boolean animated;
        boolean autoWidth = true;
        boolean desktop;
        boolean initiallyKeyboardFocused;
        String listStyle; // ?
        Integer maxHeight; // can be null
        boolean multiple; // for multi-select
        String openDirection; // ? default = 'bottom-left'  type = PropTypes.corners
        String selectedMenuItemStyle; // ?
        String style; // ?
        Object value; // any
        String valueLink;
        String width; // PropTypes.stringOrNumber
        String zDepth; // ? type = PropTypes.zDepth, default 1


        // functions
        Object onChange; // func
        Object onEscKeyDown; // func
        Object onItemTouchTap; // func
        Object onKeyDown; // func


    }
}
