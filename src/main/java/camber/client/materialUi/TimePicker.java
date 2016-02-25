package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FocusEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePicker {

    @Inject
    public TimePicker() {
    }



    @JsType(isNative = true)
    public static class Props {
        boolean autoOk;
        String defaultTime;
        String format; // enum 'ampm '24hr'
        boolean pedantic;
        CSSProps style; // ?
        CSSProps textFieldStyle; // ?
        Func.Run onChange; // func
        Func.Run onDismiss; // func
        FocusEventHandler onFocus; // func
        Func.Run onShow; // func
        TouchEventHandler onTouchTap; // func


    }
}
