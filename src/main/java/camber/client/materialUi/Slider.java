package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FocusEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Slider extends ExternalComponent<Slider.Props> {

    @Inject
    public Slider() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Slider;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

//        double defaultValue; // type valueInRangePropType
//        double min; // must be between 0 and 1 inclusive, cannot equal max
//        double max; // must be between 0 and 1 inclusive, cannot equal min
//        double value; // the value of the slider
//        String description;
//        boolean disableFocusRipple;
//        boolean disabled;
//        String error;
//        String name;
//        boolean required;
//        double step = 0.01; // the granularity slider can step through values
//        CSSProps style;
//        FocusEventHandler onBlur; // func
//        Func.Run onChange; // func
//        Func.Run onDragStart; // func
//        Func.Run onDragStop; // func
//        FocusEventHandler onFocus; // func


        @JsProperty
        double getDefaultValue();

        @JsProperty
        void setDefaultValue(double defaultValue);

        @JsProperty
        double getMin();

        @JsProperty
        void setMin(double min);

        @JsProperty
        double getMax();

        @JsProperty
        void setMax(double max);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);

        @JsProperty
        String getDescription();

        @JsProperty
        void setDescription(String description);

        @JsProperty
        boolean isDisableFocusRipple();

        @JsProperty
        void setDisableFocusRipple(boolean disableFocusRipple);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getError();

        @JsProperty
        void setError(String error);

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        boolean isRequired();

        @JsProperty
        void setRequired(boolean required);

        @JsProperty
        double getStep();

        @JsProperty
        void setStep(double step);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        Func.Run getOnDragStart();

        @JsProperty
        void setOnDragStart(Func.Run onDragStart);

        @JsProperty
        Func.Run getOnDragStop();

        @JsProperty
        void setOnDragStop(Func.Run onDragStop);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props defaultValue(final double defaultValue) {
            setDefaultValue(defaultValue);
            return this;
        }

        @JsOverlay
        default Props min(final double min) {
            setMin(min);
            return this;
        }

        @JsOverlay
        default Props max(final double max) {
            setMax(max);
            return this;
        }

        @JsOverlay
        default Props value(final double value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props description(final String description) {
            setDescription(description);
            return this;
        }

        @JsOverlay
        default Props disableFocusRipple(final boolean disableFocusRipple) {
            setDisableFocusRipple(disableFocusRipple);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props error(final String error) {
            setError(error);
            return this;
        }

        @JsOverlay
        default Props name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default Props required(final boolean required) {
            setRequired(required);
            return this;
        }

        @JsOverlay
        default Props step(final double step) {
            setStep(step);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onBlur(final FocusEventHandler onBlur) {
            setOnBlur(onBlur);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onDragStart(final Func.Run onDragStart) {
            setOnDragStart(onDragStart);
            return this;
        }

        @JsOverlay
        default Props onDragStop(final Func.Run onDragStop) {
            setOnDragStop(onDragStop);
            return this;
        }

        @JsOverlay
        default Props onFocus(final FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }


    }
}
