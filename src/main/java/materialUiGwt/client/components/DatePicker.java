package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

public class DatePicker {
    @JsType
    public static class Props {
        boolean autoOk;
        String container; // enum 'dialog' 'inline'
        String defaultDate; // ?
        boolean disableYearSelection;
        boolean disabled;
        int firstDayOfWeek; // default 0 - varies by locale
        String locale;
        String maxDate; // ?
        String minDate; // ?
        String mode; // enum 'portrait' 'landscape'
        String style; // ?
        String textFieldStyle; // ?
        Object value; // any type
        String valueLink; // ?
        String wordings; // ?

        // functions
        Object DateTimeFormat; // func
        Object formatDate; // func
        Object onChange; // func
        Object onDismiss; // func
        Object onFocus; // func
        Object onShow; // func
        Object onTouchTap; // func
        Object shouldDisableDate; // func

        // deprecated but still present
        boolean showYearSelector;

    }
}
