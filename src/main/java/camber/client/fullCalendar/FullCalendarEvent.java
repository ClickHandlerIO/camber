package camber.client.fullCalendar;

import jsinterop.annotations.JsType;

@JsType
public class FullCalendarEvent {
    public String id;
    public String title;
    public boolean allDay;
    public String start;
    public String end;
    public String url;
    public String className;
    public boolean editable;
    public boolean startEditable;
    public boolean durationEditable;
    public String rendering;
    public boolean overlap;
    public Object constraint;
    public Object source; // automatically populated EventSource object
    public String color;
    public String backgroundColor;
    public String borderColor;
    public String textColor;
}
