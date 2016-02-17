package materialUiGwt.client.materialUi.tabs;

import jsinterop.annotations.JsType;

/**
 *
 */
public class Tabs {
    @JsType
    public static class Props {
        String className;
        String contentContainerClassName;
        String contentContainerStyle;
        int initialSelectedIndex = 0;
        String inkBarStyle;
        String style;
        String tabItemContainerStyle;
        Object value; // any


        // functions
        Object onChange; // func
        Object tabTemplate; // func

    }
}
