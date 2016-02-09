package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

public class Badge {
    @JsType
    public static class Props {

        String className;
        ReactElement badgeContent;
        String badgeStyle; // ?
        boolean primary;
        boolean secondary;
        String style; // ?

    }
}
