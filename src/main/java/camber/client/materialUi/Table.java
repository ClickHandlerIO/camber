package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Table {
    @JsType
    public static class Props {
        boolean allRowsSelected;
        String bodyStyle;
        String className;
        boolean fixedFooter = true;
        boolean fixedHeader = true;
        String footerStyle;
        String headerStyle;
        String height = "inherit"; // defaults to inherit
        boolean multiSelectable;
        boolean selectable;
        String style;
        String wrapperStyle;


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
