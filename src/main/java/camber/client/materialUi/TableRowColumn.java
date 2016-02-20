package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
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

        @Inject
        public Props() {
        }
    }
}
