package camber.client.textareaAutosize;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.FormEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class TextareaAutosize extends ExternalComponent<TextareaAutosize.Props> {

    @Inject
    public TextareaAutosize() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.TextAreaAutosize;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // add an Object valueLink variable?
//        String value;
//        double height;
//        double minHeight;
//        double maxHeight;
//        boolean useCacheForDOMMeasurements;
//        double rows;
//        double minRows;
//        double maxRows;
//        FormEventHandler onChange; // func
//        Func.Run1<Double> onHeightChange; // func

        @JsProperty
        String getValue();

        @JsProperty
        void setValue(String value);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getMinHeight();

        @JsProperty
        void setMinHeight(double minHeight);

        @JsProperty
        double getMaxHeight();

        @JsProperty
        void setMaxHeight(double maxHeight);

        @JsProperty
        boolean isUseCacheForDOMMeasurements();

        @JsProperty
        void setUseCacheForDOMMeasurements(boolean useCacheForDOMMeasurements);

        @JsProperty
        double getRows();

        @JsProperty
        void setRows(double rows);

        @JsProperty
        double getMinRows();

        @JsProperty
        void setMinRows(double minRows);

        @JsProperty
        double getMaxRows();

        @JsProperty
        void setMaxRows(double maxRows);

        @JsProperty
        FormEventHandler getOnChange();

        @JsProperty
        void setOnChange(FormEventHandler onChange);

        @JsProperty
        Func.Run1<Double> getOnHeightChange();

        @JsProperty
        void setOnHeightChange(Func.Run1<Double> onHeightChange);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props value(final String value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props minHeight(final double minHeight) {
            setMinHeight(minHeight);
            return this;
        }

        @JsOverlay
        default Props maxHeight(final double maxHeight) {
            setMaxHeight(maxHeight);
            return this;
        }

        @JsOverlay
        default Props useCacheForDOMMeasurements(final boolean useCacheForDOMMeasurements) {
            setUseCacheForDOMMeasurements(useCacheForDOMMeasurements);
            return this;
        }

        @JsOverlay
        default Props rows(final double rows) {
            setRows(rows);
            return this;
        }

        @JsOverlay
        default Props minRows(final double minRows) {
            setMinRows(minRows);
            return this;
        }

        @JsOverlay
        default Props maxRows(final double maxRows) {
            setMaxRows(maxRows);
            return this;
        }

        @JsOverlay
        default Props onChange(final FormEventHandler onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onHeightChange(final Func.Run1<Double> onHeightChange) {
            setOnHeightChange(onHeightChange);
            return this;
        }


    }
}
