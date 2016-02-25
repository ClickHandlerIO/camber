package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
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
public class Toggle extends ExternalComponent<Toggle.Props> {

    @Inject
    public Toggle() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Toggle;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean defaultToggled;
//        boolean disabled;
//        CSSProps elementStyle;
//        CSSProps iconStyle;
//        String labelPosition; // enum 'left' 'right' default left
//        CSSProps labelStyle;
//        CSSProps rippleStyle;
//        CSSProps style;
//        String thumbStyle;
//        boolean toggled; // toggled if set to true
//        CSSProps trackStyle;
//        String valueLink;
//        Func.Run onToggle; // func
//        MouseEventHandler onClick; // func added


        @JsProperty
        boolean isDefaultToggled();

        @JsProperty
        void setDefaultToggled(boolean defaultToggled);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getElementStyle();

        @JsProperty
        void setElementStyle(CSSProps elementStyle);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        CSSProps getRippleStyle();

        @JsProperty
        void setRippleStyle(CSSProps rippleStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getThumbStyle();

        @JsProperty
        void setThumbStyle(String thumbStyle);

        @JsProperty
        boolean isToggled();

        @JsProperty
        void setToggled(boolean toggled);

        @JsProperty
        CSSProps getTrackStyle();

        @JsProperty
        void setTrackStyle(CSSProps trackStyle);

        @JsProperty
        String getValueLink();

        @JsProperty
        void setValueLink(String valueLink);

        @JsProperty
        Func.Run getOnToggle();

        @JsProperty
        void setOnToggle(Func.Run onToggle);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props defaultToggled(final boolean defaultToggled) {
            setDefaultToggled(defaultToggled);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props elementStyle(final CSSProps elementStyle) {
            setElementStyle(elementStyle);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final CSSProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props rippleStyle(final CSSProps rippleStyle) {
            setRippleStyle(rippleStyle);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props thumbStyle(final String thumbStyle) {
            setThumbStyle(thumbStyle);
            return this;
        }

        @JsOverlay
        default Props toggled(final boolean toggled) {
            setToggled(toggled);
            return this;
        }

        @JsOverlay
        default Props trackStyle(final CSSProps trackStyle) {
            setTrackStyle(trackStyle);
            return this;
        }

        @JsOverlay
        default Props valueLink(final String valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props onToggle(final Func.Run onToggle) {
            setOnToggle(onToggle);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
