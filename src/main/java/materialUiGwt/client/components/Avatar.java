package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class Avatar {
    @JsType
    public static class Props {
        String backgroundColor;
        String className;
        String color;
        ReactElement icon;
        int size; // default 40
        String src;
        String style; //?

    }
}
