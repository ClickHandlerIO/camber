package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

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

        @Inject
        public Props() {
        }
    }
}
