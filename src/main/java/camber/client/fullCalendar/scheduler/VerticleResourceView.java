package camber.client.fullCalendar.scheduler;

import com.google.gwt.dom.client.NativeEvent;
import io.clickhandler.momentGwt.client.Duration;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

@JsType
public class VerticleResourceView {
    // this is just another view, can be called with the right parameter in FullCalendarView and props there
    // keeping this here for added variables and as a note to add the proper additional resource js files

    public String name;
    public String title;
    public Moment start;
    public Moment end;
    public Moment intervalStart;
    public Moment intervalEnd;

    // this primarily extends agenda views and basic views via the scheduler add on
    // both of these determine if multi-day agenda or basic views should display resource columns
    public boolean groupByResource;
    public boolean groupByDateAndResource;

}
