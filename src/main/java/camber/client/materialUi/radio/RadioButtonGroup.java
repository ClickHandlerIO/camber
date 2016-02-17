package camber.client.materialUi.radio;

import jsinterop.annotations.JsType;

/**
 *
 */
public class RadioButtonGroup {
    @JsType
    public static class Props {
        String className;
        String defaultSelected;
        String labelPosition; // enum 'left' 'right'
        String name; //
        String style;
        String valueSelected;

        // functions
        Object onChange; // func
    }
}
