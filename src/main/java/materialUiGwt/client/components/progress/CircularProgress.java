package materialUiGwt.client.components.progress;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *
 */
public class CircularProgress {
    @JsType
    public static class Props {
        String color;
        String innerStyle;
        int max = 100; // only works in determinate mode
        int min = 0; // only works in determinate mode
        String mode = "indeterminate"; // enum 'determinate' 'indeterminate'(default)
        int size = 1; // size of progress
        String style;
        int value = 0; // only works in determinate mode

    }
}
