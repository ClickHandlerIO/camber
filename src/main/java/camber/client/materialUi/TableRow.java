package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class TableRow {
    @JsType
    public static class Props {
        String className;
        boolean displayborder = true;
        boolean hoverable;
        boolean hovered;
        int rowNumber; // automatiaclly populated when used with TableBody
        boolean selectable;
        boolean selected;
        boolean striped;
        String style;

        // functions
        Object onCellClick; // func
        Object onCellHover; // func
        Object onCellHoverExit; // func
        Object onRowClick; // func
        Object onRowHover; // func
        Object onRowHoverExit; // func

        @Inject
        public Props() {
        }
    }
}
