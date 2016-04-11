package io.clickhandler.camber.client.fullCalendar;

import com.google.gwt.user.client.Window;
import elemental.html.DivElement;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.react.*;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

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
        return div($ -> {
            $.ref(divRef);
            $.className("camber-full-calendar");
            if (props.getStyle() != null) {
                $.style(props.getStyle());
            }
        });
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

        $this.subscribe(UpdateFullCalendarEvent.class, e -> {
            destroy(divRef.get($this)); // todo call 'render' instead?
            buildFullCalendar($this);
        });
    }

    @Override
    protected void componentWillReceiveProps(ReactComponent<Props, State> $this, Props curProps, Props nextProps) {
        super.componentWillReceiveProps($this, curProps, nextProps);

        if (!curProps.getView().equals(nextProps.getView())) {
            changeView(divRef.get($this), nextProps.getView().getId());
        }

//        if (!curProps.getMoment().isSame(nextProps.getMoment())) {
        goToDate(divRef.get($this), nextProps.getMoment());
//        }
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
        header.setCenter("");
        header.setLeft("");
        header.setRight("");

        FullCalendarOptions options = Jso.create();
        options.setHeader(header);
        options.setDefaultView($this.props().getView().getId());
        options.setDefaultDate($this.props().getMoment());
        options.setAllDayDefault(false);
        options.setEditable(false);
        options.setEventColor("#3a87ad");
        options.setEventTextColor("#fff");
        options.setEventLimit(true);
        options.setHeight(Window.getClientHeight() - divRef.get($this).getOffsetTop() - 15); // 15 is padding
        options.setEventClick((fullCalendarEvent, nativeEvent1, fullCalendarView1) -> {
            if ($this.props().getOnEventClicked() != null) {
                $this.props().getOnEventClicked().onEventClicked(fullCalendarEvent);
            }
        });
        options.setEvents((moment, moment2, o, run1) -> {
            if ($this.props().getEventFn() != null) {
                $this.props().getEventFn().run(moment, moment2, o, run1);
            }
        });

        init(divRef.get($this), options);
    }

    private native void init(DivElement divElement, FullCalendarOptions options) /*-{
        $wnd.$(divElement).fullCalendar(options);
    }-*/;

    private native void destroy(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('destroy');
    }-*/;

    private native void clearEvents(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('removeEvents');
    }-*/;

    private native void addEvents(DivElement divElement, FullCalendarEvent[] data) /*-{
        $wnd.$(divElement).fullCalendar('addEventSource', data);
    }-*/;

    private native void changeView(DivElement divElement, String view) /*-{
        $wnd.$(divElement).fullCalendar('changeView', view);
    }-*/;

    private native void goToDate(DivElement divElement, Moment date) /*-{
        $wnd.$(divElement).fullCalendar('gotoDate', date);
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

        @JsProperty
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        FullCalendarViewType getView();

        @JsProperty
        void setView(FullCalendarViewType view);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsOverlay
        default Props eventFn(final Func.Run4<Moment, Moment, Object, Func.Run1<FullCalendarEvent[]>> eventFn) {
            setEventFn(eventFn);
            return this;
        }

        @JsOverlay
        default Props onEventClicked(final EventClickHandler onEventClicked) {
            setOnEventClicked(onEventClicked);
            return this;
        }

        @JsOverlay
        default Props moment(final Moment moment) {
            setMoment(moment);
            return this;
        }

        @JsOverlay
        default Props view(final FullCalendarViewType view) {
            setView(view);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
    }
}
