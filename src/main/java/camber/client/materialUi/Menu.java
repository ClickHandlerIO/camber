package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
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
public class Menu extends ExternalComponent<Menu.Props> {
    @Inject
    public Menu() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Menu;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isAnimated();

        @JsProperty
        void setAnimated(boolean animated);

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        boolean isDesktop();

        @JsProperty
        void setDesktop(boolean desktop);

        @JsProperty
        boolean isInitiallyKeyboardFocused();

        @JsProperty
        void setInitiallyKeyboardFocused(boolean initiallyKeyboardFocused);

        @JsProperty
        CSSProps getListStyle();

        @JsProperty
        void setListStyle(CSSProps listStyle);

        @JsProperty
        Integer getMaxHeight();

        @JsProperty
        void setMaxHeight(Integer maxHeight);

        @JsProperty
        boolean isMultiple();

        @JsProperty
        void setMultiple(boolean multiple);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        KeyboardEventHandler getOnEscKeyDown();

        @JsProperty
        void setOnEscKeyDown(KeyboardEventHandler onEscKeyDown);

        @JsProperty
        TouchEventHandler getOnItemTouchTap();

        @JsProperty
        void setOnItemTouchTap(TouchEventHandler onItemTouchTap);

        @JsProperty
        KeyboardEventHandler getOnKeyDown();

        @JsProperty
        void setOnKeyDown(KeyboardEventHandler onKeyDown);

        @JsProperty
        String getOpenDirection();

        @JsProperty
        void setOpenDirection(String openDirection);

        @JsProperty
        CSSProps getSelectedMenuItemStyle();

        @JsProperty
        void setSelectedMenuItemStyle(CSSProps selectedMenuItemStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        Object getValueLink();

        @JsProperty
        void setValueLink(Object valueLink);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getZDepth();

        @JsProperty
        void setZDepth(double zDepth);



        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props animated(boolean animated) {
            setAnimated(animated);
            return this;
        }

        @JsOverlay
        default Props autoWidth(boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props desktop(boolean desktop) {
            setDesktop(desktop);
            return this;
        }

        @JsOverlay
        default Props initiallyKeyboardFocused(boolean initiallyKeyboardFocused) {
            setInitiallyKeyboardFocused(initiallyKeyboardFocused);
            return this;
        }

        @JsOverlay
        default Props listStyle(CSSProps listStyle) {
            setListStyle(listStyle);
            return this;
        }

        @JsOverlay
        default Props maxHeight(Integer maxHeight) {
            setMaxHeight(maxHeight);
            return this;
        }

        @JsOverlay
        default Props multiple(boolean multiple) {
            setMultiple(multiple);
            return this;
        }

        @JsOverlay
        default Props onChange(Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props onEscKeyDown(KeyboardEventHandler onEscKeyDown) {
            setOnEscKeyDown(onEscKeyDown);
            return this;
        }

        @JsOverlay
        default Props onItemTouchTap(TouchEventHandler onItemTouchTap) {
            setOnItemTouchTap(onItemTouchTap);
            return this;
        }

        @JsOverlay
        default Props onKeyDown(KeyboardEventHandler onKeyDown) {
            setOnKeyDown(onKeyDown);
            return this;
        }

        @JsOverlay
        default Props openDirection(String openDirection) {
            setOpenDirection(openDirection);
            return this;
        }

        @JsOverlay
        default Props selectedMenuItemStyle(CSSProps selectedMenuItemStyle) {
            setSelectedMenuItemStyle(selectedMenuItemStyle);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props valueLink(Object valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props width(double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props zDepth(double zDepth) {
            setZDepth(zDepth);
            return this;
        }
    }
}
