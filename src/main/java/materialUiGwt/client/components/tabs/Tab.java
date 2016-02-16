package materialUiGwt.client.components.tabs;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class Tab {
    @JsType
    public static class Props {
        String className;
        ReactElement icon;
        ReactElement label;
        boolean selected;
        String style;
        String width;
        Object value; // any

        // functions
        Object onActive; // func
        Object onTouchTap; // func

    }
}
