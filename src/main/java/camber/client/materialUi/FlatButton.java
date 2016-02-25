package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FlatButton extends ExternalComponent<FlatButton.Props> {

    @Inject
    public FlatButton() {
    }

    @Override
    protected native ReactClass<FlatButton.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.FlatButton;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getBackgroundColor();

        @JsProperty
        void setBackgroundColor(String backgroundColor);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        String getHref();

        @JsProperty
        void setHref(String href);

        @JsProperty
        ReactElement getIcon();

        @JsProperty
        void setIcon(ReactElement icon);

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        boolean isLinkButton();

        @JsProperty
        void setLinkButton(boolean linkButton);

        @JsProperty
        KeyboardEventHandler getOnKeyboardFocus();

        @JsProperty
        void setOnKeyboardFocus(KeyboardEventHandler onKeyboardFocus);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        boolean isKeyboardFocused();

        @JsProperty
        void setKeyboardFocused(boolean keyboardFocused);

        @JsProperty
        boolean isFocused();

        @JsProperty
        void setFocused(boolean focused);

        @JsProperty
        Func.Run getOnTouchStart();

        @JsProperty
        void setOnTouchStart(Func.Run onTouchStart);

        @JsProperty
        boolean isPrimary();

        @JsProperty
        void setPrimary(boolean primary);

        @JsProperty
        String getRippleColor();

        @JsProperty
        void setRippleColor(String rippleColor);

        @JsProperty
        boolean isSecondary();

        @JsProperty
        void setSecondary(boolean secondary);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsProperty
        default Props backgroundColor(String backgroundColor){
            setBackgroundColor(backgroundColor);
            return this;
        }

        @JsProperty
        default Props disabled(boolean disabled){
            setDisabled(disabled);
            return this;
        }

        @JsProperty
        default Props hoverColor(String hoverColor){
            setHoverColor(hoverColor);
            return this;
        }

        @JsProperty
        default Props href(String href){
            setHref(href);
            return this;
        }

        @JsProperty
        default Props icon(ReactElement icon){
            setIcon(icon);
            return this;
        }

        @JsProperty
        default Props label(String label){
            setLabel(label);
            return this;
        }

        @JsProperty
        default Props labelPosition(String labelPosition){
            setLabelPosition(labelPosition);
            return this;
        }

        @JsProperty
        default Props labelStyle(CSSProps labelStyle){
            setLabelStyle(labelStyle);
            return this;
        }

        @JsProperty
        default Props linkButton(boolean linkButton){
            setLinkButton(linkButton);
            return this;
        }

        @JsProperty
        default Props onKeyboardFocus(KeyboardEventHandler onKeyboardFocus){
            setOnKeyboardFocus(onKeyboardFocus);
            return this;
        }

        @JsProperty
        default Props onMouseEnter(MouseEventHandler onMouseEnter){
            setOnMouseEnter(onMouseEnter);
            return this;
        }

        @JsProperty
        default Props onMouseLeave(MouseEventHandler onMouseLeave){
            setOnMouseLeave(onMouseLeave);
            return this;
        }

        @JsProperty
        default Props onClick(MouseEventHandler onClick){
            setOnClick(onClick);
            return this;
        }

        @JsProperty
        default Props keyboardFocused(boolean keyboardFocused){
            setKeyboardFocused(keyboardFocused);
            return this;
        }

        @JsProperty
        default Props focused(boolean focused){
            setFocused(focused);
            return this;
        }

        @JsProperty
        default Props touchStart(Func.Run onTouchStart){
            setOnTouchStart(onTouchStart);
            return this;
        }

        @JsProperty
        default Props primary(boolean primary){
            setPrimary(primary);
            return this;
        }

        @JsProperty
        default Props rippleColor(String rippleColor){
            setRippleColor(rippleColor);
            return this;
        }

        @JsProperty
        default Props secondary(boolean secondary){
            setSecondary(secondary);
            return this;
        }

        @JsProperty
        default Props style(CSSProps style){
            setStyle(style);
            return this;
        }
    }
}
