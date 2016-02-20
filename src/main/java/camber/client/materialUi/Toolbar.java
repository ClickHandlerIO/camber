package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Toolbar {
    @JsType
    public static class Props {
        String className;
        String style;
        boolean noGutter; // spacing of toolbar

        @Inject
        public Props() {
        }
    }
}
