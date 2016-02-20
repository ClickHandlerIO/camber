package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

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

        @Inject
        public Props() {
        }
    }
}
