package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class DatePicker {
    @JsType
    public static class Props {
        public boolean autoOk;
        public String container; // enum 'dialog' 'inline'
        public String defaultDate; // ?
        public boolean disableYearSelection;
        public boolean disabled;
        public int firstDayOfWeek; // default 0 - varies by locale
        public String locale;
        public String maxDate; // ?
        public String minDate; // ?
        public String mode; // enum 'portrait' 'landscape'
        public String style; // ?
        public String textFieldStyle; // ?
        public Object value; // any type
        public String valueLink; // ?
        public String wordings; // ?
        public Object DateTimeFormat; // func
        public Object formatDate; // func
        public Object onChange; // func
        public Object onDismiss; // func
        public Object onFocus; // func
        public Object onShow; // func
        public Object onTouchTap; // func
        public Object shouldDisableDate; // func

        @Inject
        public Props() {
        }
    }
}
