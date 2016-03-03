package camber.client.sticky;

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
 *  https://github.com/captivationsoftware/react-sticky, currently 3.0 but looks like 4.0 may be out soon
 */
@Singleton
public class Sticky extends ExternalComponent<Sticky.Props> {

    @Inject
    public Sticky() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Sticky;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        public CSSProps stickyStyle;
//        public String stickyClass;
//        public double topOffset;
//        public double bottomOffset;
//        public String className;
//        public CSSProps style;
//        public Func.Run onStickyStateChange; // func
//        public MouseEventHandler onClick; // func


        @JsProperty
        CSSProps getStickyStyle();

        @JsProperty
        void setStickyStyle(CSSProps stickyStyle);

        @JsProperty
        String getStickyClass();

        @JsProperty
        void setStickyClass(String stickyClass);

        @JsProperty
        double getTopOffset();

        @JsProperty
        void setTopOffset(double topOffset);

        @JsProperty
        double getBottomOffset();

        @JsProperty
        void setBottomOffset(double bottomOffset);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        Func.Run getOnStickyStateChange();

        @JsProperty
        void setOnStickyStateChange(Func.Run onStickyStateChange);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props stickyStyle(final CSSProps stickyStyle) {
            setStickyStyle(stickyStyle);
            return this;
        }

        @JsOverlay
        default Props stickyClass(final String stickyClass) {
            setStickyClass(stickyClass);
            return this;
        }

        @JsOverlay
        default Props topOffset(final double topOffset) {
            setTopOffset(topOffset);
            return this;
        }

        @JsOverlay
        default Props bottomOffset(final double bottomOffset) {
            setBottomOffset(bottomOffset);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onStickyStateChange(final Func.Run onStickyStateChange) {
            setOnStickyStateChange(onStickyStateChange);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }



    }
}
