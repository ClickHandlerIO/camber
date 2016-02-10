package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *  worth checking docs for this: http://www.material-ui.com/#/components/left-nav
 */
public class LeftNav {
    @JsType
    public static class Props {
        String className;
        boolean disableSwipeToOpen;
        boolean docked = true;
        Boolean open; // uses Boolean because can be null, null value means uncontrolled
        boolean openRight;
        String overlayClassName;
        String overlayStyle; //
        String style; // ?
        int swipeAreaWidth; // default 30
        Integer width; // can be null, defaulting to value from theme

        // functions
        Object onRequestChange; // func

        // deprecated
        ReactElement header;
        String menuItemClassName;
        String menuItemClassNameLink;
        String menuItemClassNameSubheader;
        String [] menuItems; // instead use composability
        int selectedIndex;
        Object onChange; // func
        Object onNavOpen; // func
        Object onNavClose; // func

    }
}
