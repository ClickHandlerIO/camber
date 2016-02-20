package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * vertical bar used to separate groups of components
 */
@Singleton
public class ToolbarSeparator {
    @JsType
    public static class Props {
        String className;
        String style;

        @Inject
        public Props() {
        }
    }
}
