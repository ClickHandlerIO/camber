package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FormEventHandler;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class TextField extends ExternalComponent<TextField.Props> {

    @Inject
    public TextField() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.TextField;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        Object getDefaultValue();

        @JsProperty
        void setDefaultValue(Object defaultValue);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getErrorStyle();

        @JsProperty
        void setErrorStyle(CSSProps errorStyle);

        @JsProperty
        String getErrorText();

        @JsProperty
        void setErrorText(String errorText);

        @JsProperty
        CSSProps getFloatingLabelStyle();

        @JsProperty
        void setFloatingLabelStyle(CSSProps floatingLabelStyle);

        @JsProperty
        String getFloatingLabelText();

        @JsProperty
        void setFloatingLabelText(String floatingLabelText);

        @JsProperty
        boolean isFullWidth();

        @JsProperty
        void setFullWidth(boolean fullWidth);

        @JsProperty
        CSSProps getHintStyle();

        @JsProperty
        void setHintStyle(CSSProps hintStyle);

        @JsProperty
        String getHintText();

        @JsProperty
        void setHintText(String hintText);

        @JsProperty
        String getId();

        @JsProperty
        void setId(String id);

        @JsProperty
        CSSProps getInputStyle();

        @JsProperty
        void setInputStyle(CSSProps inputStyle);

        @JsProperty
        boolean isMultiLine();

        @JsProperty
        void setMultiLine(boolean multiLine);

        @JsProperty
        Func.Run getOnBlur();

        @JsProperty
        void setOnBlur(Func.Run onBlur);

        @JsProperty
        FormEventHandler getOnChange();

        @JsProperty
        void setOnChange(FormEventHandler onChange);

        @JsProperty
        KeyboardEventHandler getOnEnterKeyDown();

        @JsProperty
        void setOnEnterKeyDown(KeyboardEventHandler onEnterKeyDown);

        @JsProperty
        Func.Run getOnFocus();

        @JsProperty
        void setOnFocus(Func.Run onFocus);

        @JsProperty
        KeyboardEventHandler getOnKeyDown();

        @JsProperty
        void setOnKeyDown(KeyboardEventHandler onKeyDown);

        @JsProperty
        double getRows();

        @JsProperty
        void setRows(double rows);

        @JsProperty
        double getRowsMax();

        @JsProperty
        void setRowsMax(double rowsMax);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);

        @JsProperty
        CSSProps getUnderlineDisabledStyle();

        @JsProperty
        void setUnderlineDisabledStyle(CSSProps underlineDisabledStyle);

        @JsProperty
        CSSProps getUnderlineFocusStyle();

        @JsProperty
        void setUnderlineFocusStyle(CSSProps underlineFocusStyle);

        @JsProperty
        boolean isUnderlineShow();

        @JsProperty
        void setUnderlineShow(boolean underlineShow);

        @JsProperty
        CSSProps getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(CSSProps underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);
    }
}
