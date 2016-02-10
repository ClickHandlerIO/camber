package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

public class FontIcon {
    @JsType
    public static class Props {
        String className; // used to enter icon className, probably will work with our current icon enums
        String color;
        String hoverColor;
        String style; // ?

        // functions
        Object onMouseEnter; // func
        Object onMouseLeave; // func

    }
}
