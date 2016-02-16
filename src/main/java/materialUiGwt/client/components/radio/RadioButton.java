package materialUiGwt.client.components.radio;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class RadioButton {
    @JsType
    public static class Props {
        boolean checked;
        boolean disabled;
        String iconStyle;
        String labelPosition; // enum 'left' 'right'
        String labelStyle;
        String style;
        String value;

        // functions
        Object onCheck; // func
    }
}
