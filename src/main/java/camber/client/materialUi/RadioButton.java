package camber.client.materialUi;

import jsinterop.annotations.JsType;

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
