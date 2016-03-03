package camber.client.fullCalendar;

import io.clickhandler.momentGwt.client.Duration;
import io.clickhandler.web.Func;
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
    public String rendering; // can set to "background" to create background object
    public boolean overlap;
    public Object constraint;
    public Object source; // automatically populated EventSource object
    public String color;
    public String eventColor;
    public String backgroundColor;
    public String borderColor;
    public String textColor;
    public boolean allDayDefault;
    public String startParam;
    public String endParam;
    public String timezoneParam;
    public boolean lazyFetching;
    public Duration defaultTimedEventDuration;
    public Duration defaultAllDayEventDuration; // default 1 day
    public boolean forceEventDuration;
    // event rendering
    public Duration nextDayThreshold;
    public Object eventOrder;

    // event methods
    public Func.Run1<FullCalendarEvent> updateEvent; // must be this event

    // can be used with scheduler ResourceObject id
    String resourceId;
}
