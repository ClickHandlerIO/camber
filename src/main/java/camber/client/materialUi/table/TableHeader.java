package camber.client.materialUi.table;

import jsinterop.annotations.JsType;

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

    }
}
