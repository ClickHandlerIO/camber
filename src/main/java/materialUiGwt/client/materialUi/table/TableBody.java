package materialUiGwt.client.materialUi.table;

import jsinterop.annotations.JsType;

/**
 *
 */
public class TableBody {
    @JsType
    public static class Props {
        boolean allRowsSelected;
        String className;
        boolean deselectOnClickaway = true;
        boolean displayRowCheckbox = true;
        boolean multiSelectable;
        boolean preScanRows = true;
        boolean selectable = true;
        boolean showRowHover;
        boolean stripedRows;
        String style;
        
        // functions
        Object onCellClick; // func
        Object onCellHover; // func
        Object onCellHoverExit; // func
        Object onRowHover; // func
        Object onRowHoverExit; // func
        Object onRowSelection; // func

    }
}
