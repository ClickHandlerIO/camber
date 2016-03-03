package camber.client.fullCalendar.scheduler;

import com.google.gwt.dom.client.NativeEvent;
import io.clickhandler.momentGwt.client.Duration;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

@JsType
public class TimelineView {
    // this is just another view, can be called with the right parameter in FullCalendarView and props there
    // keeping this here for added variables and as a note to add the proper additional resource js files

    public String name;
    public String title;
    public Moment start;
    public Moment end;
    public Moment intervalStart;
    public Moment intervalEnd;

    // timeline specific properties
    public String resourceAreaWidth;
    public String resourceLabelText;
    public Object[] resourceColumns;
    public double snapDuration;

    // these two are similar to min max in the Agenda view
    public Duration minTime;
    public Duration maxTime;
    public double scrollTime; // when slot duration is an hour or less

    // these props have the caveat that if not specified they are specially calculated to be "reasonable", sounds good enough honestly
    public double slotWidth; // number in pixels
    public Duration slotDuration;
    public String[] slotLabelFormat; //  can be an array of strings for multiple tiers, otherwise 1 suffices
    public Object slotLabelInterval; // String or object

    // func
    Func.Run4<Moment, NativeEvent, TimelineView, ResourceObject> dayClick;

}
