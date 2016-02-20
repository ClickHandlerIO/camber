package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class LinearProgress {
    @JsType
    public static class Props {
        String color;
        String innerStyle;
        int max = 100; // only works in determinate mode
        int min = 0; // only works in determinate mode
        String mode = "indeterminate"; // enum 'determinate' 'indeterminate'(default)
        String style;
        int value = 0; // only works in determinate mode

        @Inject
        public Props() {
        }
    }
}
