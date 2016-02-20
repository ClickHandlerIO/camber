package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class ToolbarTitle {
    @JsType
    public static class Props {
        String className;
        String style;
        String text; // text to be displayed in title

        @Inject
        public Props() {
        }
    }
}
