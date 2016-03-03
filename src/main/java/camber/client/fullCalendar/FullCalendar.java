package camber.client.fullCalendar;

import camber.client.util.Lodash;
import com.google.gwt.user.client.Window;
import elemental.html.DivElement;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.react.*;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import javax.inject.Inject;

import static io.clickhandler.web.dom.DOM.div;

public class FullCalendar extends Component<FullCalendar.Props, FullCalendar.State> {
    private final Ref<DivElement> divRef = Ref.make();

    @Inject
    public FullCalendar() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> reactComponent, Props props, State state) {
        return div($ -> $.ref(divRef).className("camber-full-calendar"));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void componentDidMount(final ReactComponent<Props, State> $this) {
        super.componentDidMount($this);
        buildFullCalendar($this);

        $this.register(Window.addResizeHandler(resizeEvent -> {
            destroy(divRef.get($this));
            buildFullCalendar($this);
        }));

        // for testing (fake data)
//        FullCalendarEvent[] data = new FullCalendarEvent[9];
//        for (int i = 1; i < 10; ++i) {
//            FullCalendarEvent e = new FullCalendarEvent();
//            e.id = Integer.toString(i);
//            e.title = Integer.toString(i) + " Test";
//            e.start = "2016-02-0" + Integer.toString(i) + "T10:30:00";
//            data[i - 1] = e;
//        }
    }

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<Props, State> $this, Props curProps, Props nextProps, State curState, State nextState) {
        return !Lodash.isEqual(curProps, nextProps);
    }

    @Override
    protected void componentDidUpdate(ReactComponent<Props, State> $this, Props curProps, Props nextProps, State curState, State nextState) {
        super.componentDidUpdate($this, curProps, nextProps, curState, nextState);
        updateData(divRef.get($this), nextProps.getData());
    }

    @Override
    protected void componentWillUnmount(ReactComponent<Props, State> $this) {
        super.componentWillUnmount($this);
        destroy(divRef.get($this));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private void buildFullCalendar(ReactComponent<Props, State> $this) {
        FullCalendarHeader header = new FullCalendarHeader();
        header.center = "prev,title,next";
        header.left = "month,agendaWeek,agendaDay";

        FullCalendarOptions options = new FullCalendarOptions();
        options.header = header;
        options.allDayDefault = false;
        options.editable = false;
        options.eventColor = "#3a87ad";
        options.eventTextColor = "#fff";
        options.eventLimit = true;
        options.height = Window.getClientHeight() - divRef.get($this).getOffsetTop() - 24; // 24 is padding;
//        options.dayClick = (moment, nativeEvent, fullCalendarView) -> log.trace("Day Clicked!");
        options.eventClick = (fullCalendarEvent, nativeEvent, fullCalendarView) -> {
            if ($this.props().getOnEventClicked() != null) {
                $this.props().getOnEventClicked().onEventClicked(fullCalendarEvent.id);
            }
        };

        init(divRef.get($this), options);
        updateData(divRef.get($this), $this.props().getData());
    }

    private native void init(DivElement divElement, FullCalendarOptions options) /*-{
        // build opts object with events as first param (required by full calendar)
        var opts = {
            events: [], // must always be first
            dayClick: options.dayClick,
            eventColor: options.eventColor,
            eventBackgroundColor: options.eventBackgroundColor,
            eventBorderColor: options.eventBorderColor,
            eventTextColor: options.eventTextColor,
            eventClick: options.eventClick,
            editable: options.editable,
            eventStartEditable: options.eventStartEditable,
            eventDurationEditable: options.eventDurationEditable,
            eventOverlap: options.eventOverlap,
            eventConstraint: options.eventConstraint,
            eventLimit: options.eventLimit,
            header: {
                left: options.header.left,
                center: options.header.center,
                right: options.header.right
            },
            height: options.height
        };
        $wnd.$(divElement).fullCalendar(opts);
    }-*/;

    private native void destroy(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('destroy');
    }-*/;

    private void updateData(DivElement divElement, FullCalendarEvent[] data) {
        clearEvents(divElement);
        addEvents(divElement, data);
    }

    private native void clearEvents(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('removeEvents');
    }-*/;

    private native void addEvents(DivElement divElement, FullCalendarEvent[] data) /*-{
        $wnd.$(divElement).fullCalendar('addEventSource', data);
    }-*/;

    // doesn't work in options
    private native Moment getDate() /*-{
        $wnd.$(divElement).fullCalendar('getDate');
    }-*/;

    private native void select(Moment moment) /*-{
        $wnd.$(divElement).fullCalendar('select', moment);
    }-*/;

    private native void unselect() /*-{
        $wnd.$(divElement).fullCalendar('unselect');
    }-*/;

    private native void refetchEvents() /*-{
        $wnd.$(divElement).fullCalendar('refetchEvents');
    }-*/;

    // render a new event on the calendar
    private native void renderEvent(FullCalendarEvent event) /*-{
        $wnd.$(divElement).fullCalendar('renderEvent', event);
    }-*/;

    // rerenders all events on the calendar
    private native void rerenderEvents() /*-{
        $wnd.$(divElement).fullCalendar('rerenderEvents');
    }-*/;


    public interface EventClickHandler {
        void onEventClicked(String eventId);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        EventClickHandler getOnEventClicked();

        @JsProperty
        void setOnEventClicked(EventClickHandler onEventClicked);

        @JsProperty
        FullCalendarEvent[] getData();

        @JsProperty
        void setData(FullCalendarEvent[] data);

        @JsOverlay
        default Props onEventClicked(final EventClickHandler onEventClicked) {
            setOnEventClicked(onEventClicked);
            return this;
        }

        @JsOverlay
        default Props data(final FullCalendarEvent[] data) {
            setData(data);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        FullCalendarEvent[] getEvents();

        @JsProperty
        void setEvents(FullCalendarEvent[] events);

        @JsOverlay
        default State events(final FullCalendarEvent[] events) {
            setEvents(events);
            return this;
        }
    }
}
