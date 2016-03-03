package camber.client.fullCalendar;

import camber.client.fullCalendar.buttons.ButtonText;
import camber.client.fullCalendar.scheduler.ResourceObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.client.ui.HTMLTable;
import elemental.html.DivElement;
import io.clickhandler.momentGwt.client.Duration;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import io.clickhandler.web.react.ExternalComponent;
import jsinterop.annotations.JsType;

@JsType
public class FullCalendarOptions {
    public FullCalendarHeader header;
    public boolean allDayDefault;
    public double aspectRatio;
    public String eventColor;
    public String eventBackgroundColor;
    public String eventBorderColor;
    public String eventTextColor;
    public Object weekNumberCalculation;
    public Object businessHours; // boolean or businessHours object
    public double height;
    public double contentHeight;
    public double firstDay; // integer for first day of the week, 0 is default Sunday
    public double[] hiddenDays; // array of day-of-week indices to hide. Each index is zero-base (Sunday=0) and ranges from 0-6
    public boolean fixedWeekCount;
    public boolean weekends;
    public boolean weekNumbers;
    public boolean isRTL;
    public boolean editable;
    public boolean theme;
    public boolean handleWindowResize;
    public boolean eventLimit;

    // agenda options - specific to agenda views of calendar
    public boolean allDaySlot;
    public String allDayText;
    public String slotLabelFormat;
    public Duration slotDuration;
    public Duration slotLabelInterval;
    public Duration snapDuration;
    public Duration scrollTime;
    public Duration minTime;
    public Duration maxTime;
    public boolean slotEventOverlap;
    // moment stuff
    public String timezone;
    // date stuff
    public Moment defaultDate;
    public boolean nowIndicator;
    // text/time customization options
    public String timeFormat;
    public String columnFormat;
    public String titleFormat;
    public String[] monthNames;
    public String[] monthNamesShort;
    public String[] dayNames;
    public String[] dayNamesShort;
    public String weekNumbertitle;
    public boolean displayEventTime;
    public boolean displayEventEnd;
    public Object eventLimitText; // String of function. defaults to "more" and should be left like this
    public String dayPopoverFormat;

    // draggable stuff
    public boolean eventStartEditable;
    public boolean eventDurationEditable;
    public double dragRevertDuration;
    public double dragOpacity;
    public boolean dragScroll;
    public Object eventOverlap; // boolean or Function
    public Object eventConstraint; // id, businessHours, object


    // selection objects
    public boolean selectable;
    public Object selectHelper; // boolean or function
    public boolean unselectAuto;
    public String unselectDefault;
    public Object selectOverlap; // boolean or function
    public Object selectConstraint;


    // functions
    public Func.Run eventLimitClick;
    public Func.Run render;
    public Func.Run destroy;
    public Func.Run2<FullCalendarView, Element> viewRender;
    public Func.Run2<FullCalendarView, Element> viewDestroy;
    public Func.Run2<Moment, HTMLTable.Cell> dayRender; // for modifying a day cell
    public Func.Run1<FullCalendarView> windowResize;
    public Func.Run3<NativeEvent, Element, FullCalendarView> eventRender;
    public Func.Run3<NativeEvent, Element, FullCalendarView> eventAfterRender;
    public Func.Run1<FullCalendarView> eventAfterAllRender;
    public Func.Run3<NativeEvent, Element, FullCalendarView> eventDestroy;

    public Func.Run3<Moment, NativeEvent, FullCalendarView> dayClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventClick;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseover;
    public Func.Run3<FullCalendarEvent, NativeEvent, FullCalendarView> eventMouseout;
    public Func.Run3<Moment, Moment, String> formatRange;

    // date functions
    public Func.Run prev;
    public Func.Run next;
    public Func.Run prevYear;
    public Func.Run nextYear;
    public Func.Run today;
    public Func.Run1<Moment> gotoDate;
    public Func.Run1<Duration> incrementDate;

    // select callbacks
//    public Func.Run5<Moment, Moment, NativeEvent, FullCalendarView, ResourceObject> select; // wont work until Func5 implemented in web
    public Func.Run2<FullCalendarView, NativeEvent> unselect;


    // note: some properties can be set after initialization, ie $('#calendar').fullCalendar('option', propertyName, newValue);
}
