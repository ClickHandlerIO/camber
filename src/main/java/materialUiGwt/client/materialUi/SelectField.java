package materialUiGwt.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class SelectField {
    @JsType
    public static class Props {
        boolean autoWidth;
        boolean disabled;
        String errorStyle;
        ReactElement errorText; // node
        String floatingLabelStyle;
        ReactElement floatingLabelText;
        boolean fullWidth;
        String hintStyle;
        ReactElement hintText;
        String iconStyle;
        String labelStyle;
        String selectFieldRoot; // ?
        String style;
        String underlineDisabledStyle;
        String underlineFocusStyle;
        String underlineStyle;
        Object value; // any

        // functions
        Object onBlur; // func
        Object onChange; // func
        Object onFocus; // func

        // left out deprecated

    }
}
