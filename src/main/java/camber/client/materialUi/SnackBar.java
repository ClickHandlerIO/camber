package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
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
public class SnackBar extends ExternalComponent<SnackBar.Props> {

    @Inject
    public SnackBar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.SnackBar;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String action; // label for the action
//        int autoHideDuration; // in ms
//        CSSProps bodyStyle;
//        String className;
//        String message; //? node  - required
//        boolean open; // required
//        CSSProps style;
//        TouchEventHandler onActionTouchTap; // func
//        Func.Run onRequestClose; // func
//        MouseEventHandler onClick;


        @JsProperty
        String getAction();

        @JsProperty
        void setAction(String action);

        @JsProperty
        int getAutoHideDuration();

        @JsProperty
        void setAutoHideDuration(int autoHideDuration);

        @JsProperty
        CSSProps getBodyStyle();

        @JsProperty
        void setBodyStyle(CSSProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getMessage();

        @JsProperty
        void setMessage(String message);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        TouchEventHandler getOnActionTouchTap();

        @JsProperty
        void setOnActionTouchTap(TouchEventHandler onActionTouchTap);

        @JsProperty
        Func.Run getOnRequestClose();

        @JsProperty
        void setOnRequestClose(Func.Run onRequestClose);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props action(final String action) {
            setAction(action);
            return this;
        }

        @JsOverlay
        default Props autoHideDuration(final int autoHideDuration) {
            setAutoHideDuration(autoHideDuration);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(final CSSProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props message(final String message) {
            setMessage(message);
            return this;
        }

        @JsOverlay
        default Props open(final boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onActionTouchTap(final TouchEventHandler onActionTouchTap) {
            setOnActionTouchTap(onActionTouchTap);
            return this;
        }

        @JsOverlay
        default Props onRequestClose(final Func.Run onRequestClose) {
            setOnRequestClose(onRequestClose);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
