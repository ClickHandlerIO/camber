package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
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
