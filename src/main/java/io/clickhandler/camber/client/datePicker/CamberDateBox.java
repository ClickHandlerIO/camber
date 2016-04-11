package io.clickhandler.camber.client.datePicker;

import io.clickhandler.camber.client.util.DateUtil;
import io.clickhandler.camber.client.util.UUID;
import com.google.gwt.dom.client.Document;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import io.clickhandler.momentGwt.client.Moment;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

@Singleton
public class CamberDateBox extends Component<CamberDateBox.Props, CamberDateBox.State> {
//    private final Loggly log = Loggly.get(CamberDateBox.class);

    @Inject
    public CamberDateBox() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent $this, Props props, State state) {
        return div($ -> $.id(state.getGuid()));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public State getInitialState(final ReactComponent<Props, State> $this) {
        State s = super.getInitialState($this);
        s.setGuid(UUID.uuid());

        DateBox widget = new DateBox();
        widget.setFireNullValues(true);
        widget.addValueChangeHandler(e -> {
            if ($this.props().getOnMomentChanged() != null) {
                $this.props().getOnMomentChanged().run(e.getValue() == null ? null : DateUtil.fromBrowserAdjustedDate(e.getValue()));
            }
        });
        if ($this.props().getWidth() != null) {
            widget.setWidth($this.props().getWidth());
        }
        s.setDateBox(widget);

        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this, Props props, State state) {
        super.componentDidMount($this, props, state);

        // add widget to ui
        HTMLPanel panel = HTMLPanel.wrap(Document.get().getElementById(state.getGuid()));
        panel.add(state.getDateBox());
    }

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props curProps, Props nextProps) {
        super.intakeProps($this, curProps, nextProps);
        DateBox widget = $this.state().getDateBox();
        widget.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat(nextProps.getFormat())));
        widget.setValue(nextProps.getMoment() == null ? null : DateUtil.toBrowserAdjustedDate(nextProps.getMoment()), false);
        widget.getDatePicker().setVisibleYearCount(nextProps.getVisibleYearCount() == null ? 20 : nextProps.getVisibleYearCount().intValue());
        widget.getDatePicker().setYearAndMonthDropdownVisible(nextProps.isEnableMonthYearDropdowns());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getFormat();

        @JsProperty
        void setFormat(String format);  // http://www.gwtproject.org/javadoc/latest/com/google/gwt/i18n/client/DateTimeFormat.html

        @JsProperty
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        Func.Run1<Moment> getOnMomentChanged();

        @JsProperty
        void setOnMomentChanged(Func.Run1<Moment> onMomentChanged);

        @JsProperty
        boolean isEnableMonthYearDropdowns();

        @JsProperty
        void setEnableMonthYearDropdowns(boolean enableMonthYearDropdowns);

        @JsProperty
        Double getVisibleYearCount();

        @JsProperty
        void setVisibleYearCount(Double visibleYearCount);

        @JsProperty
        String getWidth();

        @JsProperty
        void setWidth(String width);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        String getGuid();

        @JsProperty
        void setGuid(String guid);

        @JsProperty
        DateBox getDateBox();

        @JsProperty
        void setDateBox(DateBox momentBox);
    }
}
