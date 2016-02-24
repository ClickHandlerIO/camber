package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SvgIcon extends ExternalComponent<SvgIcon.Props> {

    @Inject
    public SvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.SvgIcon;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        String getHoverColor();

        @JsProperty
        void setHoverColor(String hoverColor);

        @JsProperty
        MouseEventHandler getOnMouseEnter();

        @JsProperty
        void setOnMouseEnter(MouseEventHandler onMouseEnter);

        @JsProperty
        MouseEventHandler getOnMouseLeave();

        @JsProperty
        void setOnMouseLeave(MouseEventHandler onMouseLeave);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getViewBox();

        @JsProperty
        void setViewBox(String viewBox);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props hoverColor(String hoverColor) {
            setHoverColor(hoverColor);
            return this;
        }

        @JsOverlay
        default Props onMouseEnter(MouseEventHandler onMouseEnter) {
            setOnMouseEnter(onMouseEnter);
            return this;
        }

        @JsOverlay
        default Props onMouseLeave(MouseEventHandler onMouseLeave) {
            setOnMouseLeave(onMouseLeave);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props viewBox(String viewBox) {
            setViewBox(viewBox);
            return this;
        }


    }
}
