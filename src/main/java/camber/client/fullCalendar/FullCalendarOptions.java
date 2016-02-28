package camber.client.fullCalendar;

import com.google.gwt.dom.client.NativeEvent;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

import java.util.ArrayList;
import java.util.List;

@JsType
public class FullCalendarOptions {
    public List<FullCalendarEvent> events = new ArrayList<>();
    public FullCalendarHeader header;
    public Moment defaultDate;
    public String eventColor;
    public String eventBackgroundColor;
    public String eventBorderColor;
    public String eventTextColor;
    public String className;
    public boolean editable;
    public boolean eventStartEditable;
    public boolean eventDurationEditable;
    public boolean eventOverlap;
    public Object eventConstraint;
    public boolean allDayDefault;
    public boolean eventLimit;
    public double aspectRatio;
    public Func.Run3<Moment, NativeEvent, FullCalendarView> dayClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseover;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseout;
}
