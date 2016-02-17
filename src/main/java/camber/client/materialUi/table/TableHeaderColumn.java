package camber.client.materialUi.table;

import jsinterop.annotations.JsType;

/**
 *
 */
public class TableHeaderColumn {
    @JsType
    public static class Props {
        String className;
        int columnNumber;
        String key;
        String style;
        String tooltip;
        String tooltipStyle;
        
        // functions
        Object onClick; // func

    }
}
