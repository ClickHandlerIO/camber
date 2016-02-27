package camber.client.materialUi;

import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RaisedButton extends ExternalComponent<RaisedButton.Props> {

    @Inject
    public RaisedButton() {
    }

    @Override
    protected native ReactClass<RaisedButton.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.RaisedButton;
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
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getDisabledBackgroundColor();

        @JsProperty
        void setDisabledBackgroundColor(String disabledBackgroundColor);

        @JsProperty
        String getDisabledLabelColor();

        @JsProperty
        void setDisabledLabelColor(String disabledLabelColor);

        @JsProperty
        boolean isFullWidth();

        @JsProperty
        void setFullWidth(boolean fullWidth);

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
        String getLabelColor();

        @JsProperty
        void setLabelColor(String labelColor);

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
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);

        @JsProperty
        MouseEventHandler getOnMouseDown();

        @JsProperty
        void setOnMouseDown(MouseEventHandler onMouseDown);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        MouseEventHandler getOnMouseUp();

        @JsProperty
        void setOnMouseUp(MouseEventHandler onMouseUp);

        @JsProperty
        TouchEventHandler getOnTouchEnd();

        @JsProperty
        void setOnTouchEnd(TouchEventHandler onTouchEnd);

        @JsProperty
        TouchEventHandler getOnTouchStart();

        @JsProperty
        void setOnTouchStart(TouchEventHandler onTouchStart);

        @JsProperty
        boolean isPrimary();

        @JsProperty
        void setPrimary(boolean primary);

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

        @JsOverlay
        default Props backgroundColor(String backgroundColor) {
            setBackgroundColor(backgroundColor);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props disabled(boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props disabledBackgroundColor(String disabledBackgroundColor) {
            setDisabledBackgroundColor(disabledBackgroundColor);
            return this;
        }

        @JsOverlay
        default Props disabledLabelColor(String disabledLabelColor) {
            setDisabledLabelColor(disabledLabelColor);
            return this;
        }

        @JsOverlay
        default Props fullWidth(boolean fullWidth) {
            setFullWidth(fullWidth);
            return this;
        }

        @JsOverlay
        default Props href(String href) {
            setHref(href);
            return this;
        }

        @JsOverlay
        default Props icon(ReactElement icon) {
            setIcon(icon);
            return this;
        }

        @JsOverlay
        default Props label(String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props labelColor(String labelColor) {
            setLabelColor(labelColor);
            return this;
        }

        @JsOverlay
        default Props labelPosition(String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props linkButton(boolean linkButton) {
            setLinkButton(linkButton);
            return this;
        }

        @JsOverlay
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

        @JsOverlay
        default Props onMouseDown(MouseEventHandler onMouseDown) {
            setOnMouseDown(onMouseDown);
            return this;
        }

        @JsOverlay
        default Props onMouseEnter(MouseEventHandler onMouseEnter) {
            ;
            return this;
        }

        @JsOverlay
        default Props onMouseLeave(MouseEventHandler onMouseLeave) {
            setOnMouseLeave(onMouseLeave);
            return this;
        }

        @JsOverlay
        default Props onMouseUp(MouseEventHandler onMouseUp) {
            setOnMouseUp(onMouseUp);
            return this;
        }

        @JsOverlay
        default Props onTouchEnd(TouchEventHandler onTouchEnd) {
            setOnTouchEnd(onTouchEnd);
            return this;
        }

        @JsOverlay
        default Props onTouchStart(TouchEventHandler onTouchStart) {
            setOnTouchStart(onTouchStart);
            return this;
        }

        @JsOverlay
        default Props primary(boolean primary) {
            setPrimary(primary);
            return this;
        }

        @JsOverlay
        default Props secondary(boolean secondary) {
            setSecondary(secondary);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }
    }
}
