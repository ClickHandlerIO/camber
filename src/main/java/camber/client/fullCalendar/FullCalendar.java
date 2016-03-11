package camber.client.fullCalendar;

import camber.client.util.Lodash;
import com.google.gwt.user.client.Window;
import elemental.html.DivElement;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.web.Func;
import io.clickhandler.web.Jso;
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
    protected void componentDidMount(final ReactComponent<Props, State> $this, Props props, State state) {
        super.componentDidMount($this, props, state);
        buildFullCalendar($this);

        $this.register(Window.addResizeHandler(resizeEvent -> {
            destroy(divRef.get($this));
            buildFullCalendar($this);
        }));
    }

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<Props, State> $this, Props curProps, Props nextProps, State curState, State nextState) {
        return !Lodash.isEqual(curProps, nextProps);
    }

    @Override
    protected void componentDidUpdate(ReactComponent<Props, State> $this, Props prevProps, Props curProps, State prevState, State curState) {
        super.componentDidUpdate($this, prevProps, curProps, prevState, curState);
//        updateData(divRef.get($this), curProps.getData());
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
        FullCalendarHeader header = Jso.create();
        header.setCenter("prev,title,next");
        header.setLeft("month,agendaWeek,agendaDay");

        FullCalendarOptions options = Jso.create();
        options.setHeader(header);
        options.setAllDayDefault(false);
        options.setEditable(false);
        options.setEventColor("#3a87ad");
        options.setEventTextColor("#fff");
        options.setEventLimit(true);
        options.setHeight(Window.getClientHeight() - divRef.get($this).getOffsetTop() - 24); // 24 is padding
        options.setEventClick((fullCalendarEvent, nativeEvent1, fullCalendarView1) -> {
            if ($this.props().getOnEventClicked() != null) {
                $this.props().getOnEventClicked().onEventClicked(fullCalendarEvent);
            }
        });
        options.setEvents(props().getEventFn());

        init(divRef.get($this), options);
//        updateData(divRef.get($this), $this.props().getData());
    }

    private native void init(DivElement divElement, FullCalendarOptions options) /*-{
        // build opts object with events as first param (required by full calendar)
        // todo look into JsObject(isNative) for options
        //var opts = {
        //    events: [], // must always be first
        //    dayClick: options.dayClick,
        //    eventColor: options.eventColor,
        //    eventBackgroundColor: options.eventBackgroundColor,
        //    eventBorderColor: options.eventBorderColor,
        //    eventTextColor: options.eventTextColor,
        //    eventClick: options.eventClick,
        //    editable: options.editable,
        //    eventStartEditable: options.eventStartEditable,
        //    eventDurationEditable: options.eventDurationEditable,
        //    eventOverlap: options.eventOverlap,
        //    eventConstraint: options.eventConstraint,
        //    eventLimit: options.eventLimit,
        //    header: {
        //        left: options.header.left,
        //        center: options.header.center,
        //        right: options.header.right
        //    },
        //    height: options.height
        //};
        $wnd.$(divElement).fullCalendar(options);
    }-*/;

    private native void destroy(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('destroy');
    }-*/;

//    private void updateData(DivElement divElement, FullCalendarEvent[] data) {
//        clearEvents(divElement);
//        addEvents(divElement, data);
//    }

    private native void clearEvents(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('removeEvents');
    }-*/;

    private native void addEvents(DivElement divElement, FullCalendarEvent[] data) /*-{
        $wnd.$(divElement).fullCalendar('addEventSource', data);
    }-*/;

    public interface EventClickHandler {
        void onEventClicked(FullCalendarEvent event);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> getEventFn();

        @JsProperty
        void setEventFn(Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> eventFn);

        @JsProperty
        EventClickHandler getOnEventClicked();

        @JsProperty
        void setOnEventClicked(EventClickHandler onEventClicked);

        @JsOverlay
        default Props eventFun(final Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> eventFn) {
            setEventFn(eventFn);
            return this;
        }

        @JsOverlay
        default Props onEventClicked(final EventClickHandler onEventClicked) {
            setOnEventClicked(onEventClicked);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
    }
}
