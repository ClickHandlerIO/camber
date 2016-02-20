package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * vertical bar used to separate groups of components
 */
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
