package camber.client.fullCalendar;

import io.clickhandler.momentGwt.client.Moment;
import jsinterop.annotations.JsType;

@JsType
public class FullCalendarView {
    public String name;
    public String title;
    public Moment start;
    public Moment end;
    public Moment intervalStart;
    public Moment intervalEnd;
}
