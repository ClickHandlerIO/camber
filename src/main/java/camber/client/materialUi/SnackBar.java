package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class SnackBar {
    @JsType
    public static class Props {
        String action; // label for the action
        int autoHideDuration; // in ms
        String bodyStyle;
        String className;
        String message; //? node  - required
        boolean open; // required
        String style;

        // functions
        Object onActionTouchTap; // func
        Object onRequestClose; // func


        // left out deprecated

        @Inject
        public Props() {
        }
    }
}
