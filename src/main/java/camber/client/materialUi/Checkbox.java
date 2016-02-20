package camber.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
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

        @Inject
        public Props() {
        }
    }
}
