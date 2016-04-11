package io.clickhandler.camber.client.datePicker;

import io.clickhandler.camber.client.util.UUID;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.HTMLPanel;
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
public class CamberDatePicker extends Component<CamberDatePicker.Props, CamberDatePicker.State> {
//    private final Loggly log = Loggly.get(CamberDatePicker.class);

    @Inject
    public CamberDatePicker() {
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
    public State getInitialState(ReactComponent<Props, State> $this) {
        State s = super.getInitialState($this);
        s.setGuid(UUID.uuid());
        s.setPicker(new MomentPickerWidget());
        return s;
    }

    @Override
    protected void componentDidMount(ReactComponent<Props, State> $this, Props props, State state) {
        super.componentDidMount($this, props, state);

        // add widget to ui
        HTMLPanel panel = HTMLPanel.wrap(Document.get().getElementById(state.getGuid()));
        panel.add(state.getPicker());
    }

    @Override
    protected void intakeProps(ReactComponent<Props, State> $this, Props curProps, Props nextProps) {
        super.intakeProps($this, curProps, nextProps);
        $this.state().getPicker().setValue(nextProps.getMoment());
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
        Moment getMoment();

        @JsProperty
        void setMoment(Moment moment);

        @JsProperty
        Func.Run1<Moment> getOnMomentChanged();

        @JsProperty
        void setOnMomentChanged(Func.Run1<Moment> onMomentChanged);
    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        String getGuid();

        @JsProperty
        void setGuid(String guid);

        @JsProperty
        MomentPickerWidget getPicker();

        @JsProperty
        void setPicker(MomentPickerWidget picker);
    }
}
