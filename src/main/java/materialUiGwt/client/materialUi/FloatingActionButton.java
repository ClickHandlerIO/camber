package materialUiGwt.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class FloatingActionButton {
    @JsType
    public static class Props {
        String backgroundColor;
        boolean disabled;
        String disabledColor; // defaults to Colors.grey300
        String href;
        String iconClassName;
        String iconStyle;
        boolean linkButton;
        boolean mini;
        boolean secondary;
        String style;

        // functions
        Object onMouseDown; // func
        Object onMouseEnter; // func
        Object onMouseLeave; // func
        Object onMouseUp; // func
        Object onTouchEnd; // func
        Object onTouchStart; // func

    }
}
