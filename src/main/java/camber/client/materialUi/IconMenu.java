package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class IconMenu extends ExternalComponent<IconMenu.Props> {

    @Inject
    public IconMenu() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.IconMenu;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        Origin getAnchorOrigin();

        @JsProperty
        void setAnchorOrigin(Origin anchorOrigin);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isCloseOnItemTouchTap();

        @JsProperty
        void setCloseOnItemTouchTap(boolean closeOnItemTouchTap);

        @JsProperty
        ReactElement getIconButtonElement();

        @JsProperty
        void setIconButtonElement(ReactElement iconButtonElement);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        CSSProps getMenuStyle();

        @JsProperty
        void setMenuStyle(CSSProps menuStyle);

        @JsProperty
        TouchEventHandler getOnItemTouchTap();

        @JsProperty
        void setOnItemTouchTap(TouchEventHandler onItemTouchTap);

        @JsProperty
        KeyboardEventHandler getOnKeyboardFocus();

        @JsProperty
        void setOnKeyboardFocus(KeyboardEventHandler onKeyboardFocus);

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
        Func.Run getOnRequestChange();

        @JsProperty
        void setOnRequestChange(Func.Run onRequestChange);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        Origin getTargetOrigin();

        @JsProperty
        void setTargetOrigin(Origin targetOrigin);

        @JsProperty
        double getTouchTapCloseDelay();

        @JsProperty
        void setTouchTapCloseDelay(double touchTapCloseDelay);
    }

    /**
     *
     */
    @JsType(isNative = true)
    public interface Origin {
        @JsProperty
        String getVertical();

        @JsProperty
        void setVertical(String vertical);

        @JsProperty
        String getHorizontal();

        @JsProperty
        void setHorizontal(String horizontal);
    }
}
