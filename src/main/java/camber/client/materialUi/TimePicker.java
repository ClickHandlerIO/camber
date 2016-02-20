package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePicker {
    @JsType
    public static class Props {
        boolean autoOk;
        String defaultTime;
        String format; // enum 'ampm '24hr'
        boolean pedantic;
        String style; // ?
        String textFieldStyle; // ?

        // functions
        Object onChange; // func
        Object onDismiss; // func
        Object onFocus; // func
        Object onShow; // func
        Object onTouchTap; // func

        @Inject
        public Props() {
        }
    }
}
