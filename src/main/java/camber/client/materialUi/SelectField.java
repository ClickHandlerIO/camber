package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FocusEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class SelectField extends ExternalComponent<SelectField.Props> {

    @Inject
    public SelectField() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.SelectField;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean autoWidth;
//        boolean disabled;
//        CSSProps errorStyle;
//        ReactElement errorText; // node
//        CSSProps floatingLabelStyle;
//        ReactElement floatingLabelText;
//        boolean fullWidth;
//        CSSProps hintStyle;
//        ReactElement hintText;
//        CSSProps iconStyle;
//        CSSProps labelStyle;
//        String selectFieldRoot; // ?
//        CSSProps style;
//        String underlineDisabledStyle;
//        String underlineFocusStyle;
//        String underlineStyle;
//        Object value; // any
//        FocusEventHandler onBlur; // func
//        Func.Run onChange; // func
//        FocusEventHandler onFocus; // func
//        MouseEventHandler onClick; // func - added here, may not be used

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getErrorStyle();

        @JsProperty
        void setErrorStyle(CSSProps errorStyle);

        @JsProperty
        ReactElement getErrorText();

        @JsProperty
        void setErrorText(ReactElement errorText);

        @JsProperty
        CSSProps getFloatingLabelStyle();

        @JsProperty
        void setFloatingLabelStyle(CSSProps floatingLabelStyle);

        @JsProperty
        ReactElement getFloatingLabelText();

        @JsProperty
        void setFloatingLabelText(ReactElement floatingLabelText);

        @JsProperty
        boolean isFullWidth();

        @JsProperty
        void setFullWidth(boolean fullWidth);

        @JsProperty
        CSSProps getHintStyle();

        @JsProperty
        void setHintStyle(CSSProps hintStyle);

        @JsProperty
        ReactElement getHintText();

        @JsProperty
        void setHintText(ReactElement hintText);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        String getSelectFieldRoot();

        @JsProperty
        void setSelectFieldRoot(String selectFieldRoot);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getUnderlineDisabledStyle();

        @JsProperty
        void setUnderlineDisabledStyle(String underlineDisabledStyle);

        @JsProperty
        String getUnderlineFocusStyle();

        @JsProperty
        void setUnderlineFocusStyle(String underlineFocusStyle);

        @JsProperty
        String getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(String underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        FocusEventHandler getOnBlur();

        @JsProperty
        void setOnBlur(FocusEventHandler onBlur);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        FocusEventHandler getOnFocus();

        @JsProperty
        void setOnFocus(FocusEventHandler onFocus);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoWidth(final boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props errorStyle(final CSSProps errorStyle) {
            setErrorStyle(errorStyle);
            return this;
        }

        @JsOverlay
        default Props errorText(final ReactElement errorText) {
            setErrorText(errorText);
            return this;
        }

        @JsOverlay
        default Props floatingLabelStyle(final CSSProps floatingLabelStyle) {
            setFloatingLabelStyle(floatingLabelStyle);
            return this;
        }

        @JsOverlay
        default Props floatingLabelText(final ReactElement floatingLabelText) {
            setFloatingLabelText(floatingLabelText);
            return this;
        }

        @JsOverlay
        default Props fullWidth(final boolean fullWidth) {
            setFullWidth(fullWidth);
            return this;
        }

        @JsOverlay
        default Props hintStyle(final CSSProps hintStyle) {
            setHintStyle(hintStyle);
            return this;
        }

        @JsOverlay
        default Props hintText(final ReactElement hintText) {
            setHintText(hintText);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final CSSProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props selectFieldRoot(final String selectFieldRoot) {
            setSelectFieldRoot(selectFieldRoot);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props underlineDisabledStyle(final String underlineDisabledStyle) {
            setUnderlineDisabledStyle(underlineDisabledStyle);
            return this;
        }

        @JsOverlay
        default Props underlineFocusStyle(final String underlineFocusStyle) {
            setUnderlineFocusStyle(underlineFocusStyle);
            return this;
        }

        @JsOverlay
        default Props underlineStyle(final String underlineStyle) {
            setUnderlineStyle(underlineStyle);
            return this;
        }

        @JsOverlay
        default Props value(final Object value) {
            setValue(value);
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
        default Props onFocus(final FocusEventHandler onFocus) {
            setOnFocus(onFocus);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
