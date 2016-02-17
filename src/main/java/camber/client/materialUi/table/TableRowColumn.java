package camber.client.materialUi.table;

import jsinterop.annotations.JsType;

/**
 *
 */
public class TableRowColumn {
    @JsType
    public static class Props {
        String className;
        int columnNumber;
        boolean hoverable;
        String key;
        String style;
        
        // functions
        Object onClick; // func
        Object onHover; // func
        Object onHoverExit; // func

    }
}
