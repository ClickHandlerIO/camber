package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

public class IconButton {
    @JsType
    public static class Props {
        String className;
        boolean disabled;
        String iconStyle;
        String style;
        ReactElement tooltip;
        String tooltipPosition; // type = PropTypes.cornersAndCenter default='bottom-center'
        String tooltipStyles;
        boolean touch; // prop to make tooltip larger for mobile

        // functions
        Object onBlur; // func
        Object onFocus; // func
        Object onKeyboardFocus; // func
        Object onMouseEnter; // func
        Object onMouseLeave; // func

    }
}
