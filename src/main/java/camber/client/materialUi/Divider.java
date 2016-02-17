package camber.client.materialUi;

import jsinterop.annotations.JsType;

public class Divider {
    @JsType
    public static class Props {
        String className;
        boolean inset; // inset parameter allows the divider to to align with inset content, such as inset List components
        String muiTheme; // ?
        String style; // ?

    }
}