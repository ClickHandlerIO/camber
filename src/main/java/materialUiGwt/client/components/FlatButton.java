package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class FlatButton {
    @JsType
    public static class Props {
        String backgroundColor;
        boolean disabled;
        String hoverColor;
        String href;
        ReactElement icon;
        ReactElement label;
        String labelPosition = "after"; // enum 'before' 'after'
        String labelStyle;
        boolean linkButton;
        boolean primary;
        String rippleColor;
        boolean secondary;
        String style;

        // functions
        Object onKeyboardFocus; // func
        Object onMouseEnter; // func
        Object onMouseLeave; // func
        Object onTouchStart; // func

    }
}
