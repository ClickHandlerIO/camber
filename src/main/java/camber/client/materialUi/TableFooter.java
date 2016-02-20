package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class TableFooter {
    @JsType
    public static class Props {
        boolean adjustForCheckbox;
        String className;
        String style;

        @Inject
        public Props() {
        }
    }
}
