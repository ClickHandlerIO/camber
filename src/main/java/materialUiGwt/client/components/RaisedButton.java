package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class RaisedButton {
    @JsType
    public static class Props {
        String backgroundColor;
        String className;
        boolean disabled;
        String disabledBackgroundColor;
        String disabledLabelColor;
        ReactElement label;
        String labelStyle; // ?
        boolean linkButton;
        Object onMouseDown; // func
    }
}
