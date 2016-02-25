package camber.client.materialUi;

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

@Singleton
public class FontIcon extends ExternalComponent<FontIcon.Props> {

    @Inject
    public FontIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.FontIcon;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className; // used to enter icon className, probably will work with our current icon enums
//        String color;
//        String hoverColor;
//        CSSProps style; // ?
//        MouseEventHandler onMouseEnter; // func
//        MouseEventHandler onMouseLeave; // func


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props hoverColor(final String hoverColor) {
            setHoverColor(hoverColor);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onMouseEnter(final MouseEventHandler onMouseEnter) {
            setOnMouseEnter(onMouseEnter);
            return this;
        }

        @JsOverlay
        default Props onMouseLeave(final MouseEventHandler onMouseLeave) {
            setOnMouseLeave(onMouseLeave);
            return this;
        }


    }
}
