package camber.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class TextField {
    @JsType
    public static class Props {
        String className;
        String defaultValue;
        boolean disabled;
        String errorStyle;
        ReactElement errorText;
        String floatingLabelStyle;
        ReactElement floatingLabelText;
        boolean fullWidth;
        String hintStyle;
        ReactElement hintText;
        String id;
        String inputStyle;
        boolean multiLine;
        int rows = 1;
        int rowsMax;
        String style;
        String type = "text";
        String underlineDisabledStyle;
        String underlineFocusStyle;
        boolean underlineShow = true;
        String underlineStyle;
        Object value; // String most likely but can be nmber bool


        // functions
        Object onBlur; // func
        Object onChange; // func
        Object onEnterKeyDown; // func
        Object onFocus; // func
        Object onKeyDown; // func

    }
}
