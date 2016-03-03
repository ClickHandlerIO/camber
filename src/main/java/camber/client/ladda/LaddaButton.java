package camber.client.ladda;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class LaddaButton extends ExternalComponent<LaddaButton.Props> {

    @Inject
    public LaddaButton() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Ladda;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // some of these could potentially be enums in the future
//        public ReactElement icon;
//        public String text;
//        public String status;
//        public Object loading; // bool or Object
//        public Object progress; // double or Object
//        public String buttonColor;
//        public String buttonSize;
//        public String buttonStyle;
//        public Object spinnerSize; // double or Object
//        public String spinnerColor;
//        public MouseEventHandler onClick;

        @JsProperty
        ReactElement getIcon();

        @JsProperty
        void setIcon(ReactElement icon);

        @JsProperty
        String getText();

        @JsProperty
        void setText(String text);

        @JsProperty
        String getStatus();

        @JsProperty
        void setStatus(String status);

        @JsProperty
        Object getLoading();

        @JsProperty
        void setLoading(Object loading);

        @JsProperty
        Object getProgress();

        @JsProperty
        void setProgress(Object progress);

        @JsProperty
        String getButtonColor();

        @JsProperty
        void setButtonColor(String buttonColor);

        @JsProperty
        String getButtonSize();

        @JsProperty
        void setButtonSize(String buttonSize);

        @JsProperty
        String getButtonStyle();

        @JsProperty
        void setButtonStyle(String buttonStyle);

        @JsProperty
        Object getSpinnerSize();

        @JsProperty
        void setSpinnerSize(Object spinnerSize);

        @JsProperty
        String getSpinnerColor();

        @JsProperty
        void setSpinnerColor(String spinnerColor);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ///////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props icon(final ReactElement icon) {
            setIcon(icon);
            return this;
        }

        @JsOverlay
        default Props text(final String text) {
            setText(text);
            return this;
        }

        @JsOverlay
        default Props status(final String status) {
            setStatus(status);
            return this;
        }

        @JsOverlay
        default Props loading(final Object loading) {
            setLoading(loading);
            return this;
        }

        @JsOverlay
        default Props progress(final Object progress) {
            setProgress(progress);
            return this;
        }

        @JsOverlay
        default Props buttonColor(final String buttonColor) {
            setButtonColor(buttonColor);
            return this;
        }

        @JsOverlay
        default Props buttonSize(final String buttonSize) {
            setButtonSize(buttonSize);
            return this;
        }

        @JsOverlay
        default Props buttonStyle(final String buttonStyle) {
            setButtonStyle(buttonStyle);
            return this;
        }

        @JsOverlay
        default Props spinnerSize(final Object spinnerSize) {
            setSpinnerSize(spinnerSize);
            return this;
        }

        @JsOverlay
        default Props spinnerColor(final String spinnerColor) {
            setSpinnerColor(spinnerColor);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
