package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
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
