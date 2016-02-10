package materialUiGwt.client.components.toolbar;

import jsinterop.annotations.JsType;

/**
 *
 */
public class ToolbarGroup {
    @JsType
    public static class Props {
        String className;
        boolean firstChild; // for first child left gap
        // invalid Variable name 'float' changed below
        String floatGroup; // enum 'left' 'right'
        boolean rightGap; // for last child right gap
        String style;

    }
}
