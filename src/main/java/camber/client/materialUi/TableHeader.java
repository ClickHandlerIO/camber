package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class TableHeader {
    @JsType
    public static class Props {
        boolean adjustForCheckBox;
        String className;
        boolean displaySelectAll = true;
        boolean enableSelectAll = true;
        boolean selectAllSelected;
        String style;
        
        // functions
        Object onSelectAll; // func

        @Inject
        public Props() {
        }
    }
}
