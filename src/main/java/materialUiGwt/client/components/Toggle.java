package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class Toggle {
    @JsType
    public static class Props {
        boolean defaultToggled;
        boolean disabled;
        String elementStyle;
        String iconStyle;
        String labelPosition; // enum 'left' 'right' default left
        String labelStyle;
        String rippleStyle;
        String style;
        String thumbStyle;
        boolean toggled; // toggled if set to true
        String trackStyle;
        String valueLink;

        // functions
        Object onToggle; // func

    }
}
