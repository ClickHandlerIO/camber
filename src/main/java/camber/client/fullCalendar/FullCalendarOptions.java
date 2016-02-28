package camber.client.fullCalendar;

import com.google.gwt.dom.client.NativeEvent;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

@JsType
public class FullCalendarOptions {
    public boolean allDayDefault;
    public double aspectRatio;
    public Moment defaultDate;
    public String eventColor;
    public String eventBackgroundColor;
    public String eventBorderColor;
    public String eventTextColor;
    public FullCalendarHeader header;
    public double height;
    public boolean editable;
    public boolean eventStartEditable;
    public boolean eventDurationEditable;
    public Object eventConstraint;
    public boolean eventOverlap;
    public boolean eventLimit;
    public Func.Run3<Moment, NativeEvent, FullCalendarView> dayClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseover;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseout;
}
