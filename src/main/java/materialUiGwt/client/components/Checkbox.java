package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class Checkbox {
    @JsType
    public static class Props {
        boolean checked;
        ReactElement checkedIcon; // SvgIcon to use when checked
        ReactElement unCheckedIcon; // SvgIcon to use when un-checked
        boolean defaultChecked;
        boolean disabled;
        String iconStyle;
        String labelPosition; // enum 'left' 'right'
        String labelStyle;
        String style;
        String valueLink;

    }
}
