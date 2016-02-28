package camber.client.fullCalendar;

import camber.client.util.Lodash;
import elemental.html.DivElement;
import io.clickhandler.web.react.*;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import java.util.List;

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
        return div($ -> $.ref(divRef));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this) {
        super.componentDidMount($this);

        FullCalendarHeader header = new FullCalendarHeader();
        header.center = "prev,title,next";
        header.right = "month,agendaWeek,agendaDay";

        FullCalendarOptions options = new FullCalendarOptions();
        options.header = header;
//        options.allDayDefault = false;
        options.editable = false;
        options.eventLimit = true;
        options.aspectRatio = 1.35;
//        options.eventClick = (fullCalendarEvent, nativeEvent, fullCalendarView) -> {
//            if ($this.props().getOnEventClicked() != null) {
//                $this.props().getOnEventClicked().onEventClicked(fullCalendarEvent.id);
//            }
//        };

        init(divRef.get($this), options);
//        updateData(divRef.get($this), $this.props().getData());
    }

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<Props, State> $this, Props curProps, Props nextProps, State curState, State nextState) {
        return !Lodash.isEqual(curProps, nextProps);
    }

    @Override
    protected void componentDidUpdate(ReactComponent<Props, State> $this, Props curProps, Props nextProps, State curState, State nextState) {
        super.componentDidUpdate($this, curProps, nextProps, curState, nextState);
//        updateData(divRef.get($this), nextProps.getData());
    }

    @Override
    protected void componentWillUnmount(ReactComponent<Props, State> $this) {
        super.componentWillUnmount($this);
        destroy(divRef.get($this));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private native void init(DivElement divElement, FullCalendarOptions options) /*-{
        $wnd.$(divElement).fullCalendar({});
    }-*/;

    private native void destroy(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('destroy');
    }-*/;

    private void updateData(DivElement divElement, List<FullCalendarEvent> data) {
        clearEvents(divElement);
        addEvents(divElement, data);
    }

    private native void clearEvents(DivElement divElement) /*-{
        $wnd.$(divElement).fullCalendar('removeEvents');
    }-*/;

    private native void addEvents(DivElement divElement, List<FullCalendarEvent> data) /*-{
        $wnd.$(divElement).fullCalendar('addEventSource', data);
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
        List<FullCalendarEvent> getData();

        @JsProperty
        void setData(List<FullCalendarEvent> data);

        @JsOverlay
        default Props onEventClicked(final EventClickHandler onEventClicked) {
            setOnEventClicked(onEventClicked);
            return this;
        }

        @JsOverlay
        default Props data(final List<FullCalendarEvent> data) {
            setData(data);
            return this;
        }
    }

    @JsType(isNative = true)
    public interface State {
    }
}
