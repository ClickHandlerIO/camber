package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class RefreshIndicator {
    @JsType
    public static class Props {
        String color;
        int left; // the absolute left position of the indicator in pixels
        String loadingColor;
        int percentage = 0; // max is 100
        int size = 40; // size in pixels
        String status = "hide"; // enum 'ready' 'loading' 'hide'
        String style;
        int top; // the absolute top position of the indicator in pixels

        @Inject
        public Props() {
        }
    }
}
