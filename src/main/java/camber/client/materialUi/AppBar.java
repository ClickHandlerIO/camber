package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppBar extends ExternalComponent<AppBar.Props> {
    @Inject
    public AppBar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.AppBar;
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
        String getIconClassNameLeft();

        @JsProperty
        void setIconClassNameLeft(String iconClassNameLeft);

        @JsProperty
        String getIconClassNameRight();

        @JsProperty
        void setIconClassNameRight(String iconClassNameRight);

        @JsProperty
        ReactElement getIconElementLeft();

        @JsProperty
        void setIconElementLeft(ReactElement iconElementLeft);

        @JsProperty
        ReactElement getIconElementRight();

        @JsProperty
        void setIconElementRight(ReactElement iconElementRight);

        @JsProperty
        Object getIconStyleRight();

        @JsProperty
        void setIconStyleRight(Object iconStyleRight);

        @JsProperty
        MouseEventHandler getOnLeftIconButtonTouchTap();

        @JsProperty
        void setOnLeftIconButtonTouchTap(MouseEventHandler onLeftIconButtonTouchTap);

        @JsProperty
        MouseEventHandler getOnRightIconButtonTouchTap();

        @JsProperty
        void setOnRightIconButtonTouchTap(MouseEventHandler onRightIconButtonTouchTap);

        @JsProperty
        TouchEventHandler getOnTitleTouchTap();

        @JsProperty
        void setOnTitleTouchTap(TouchEventHandler onTitleTouchTap);

        @JsProperty
        boolean isShowMenuIconButton();

        @JsProperty
        void setShowMenuIconButton(boolean showMenuIconButton);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        Object getTitleStyle();

        @JsProperty
        void setTitleStyle(Object titleStyle);

        @JsProperty
        int getZDepth();

        @JsProperty
        void setZDepth(int zDepth);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        // Fluent setters

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props iconClassNameLeft(String iconClassNameLeft) {
            setIconClassNameLeft(iconClassNameLeft);
            return this;
        }

        @JsOverlay
        default Props iconClassNameRight(String iconClassNameRight) {
            setIconClassNameRight(iconClassNameRight);
            return this;
        }

        @JsOverlay
        default Props iconElementLeft(ReactElement iconElementLeft) {
            setIconElementLeft(iconElementLeft);
            return this;
        }

        @JsOverlay
        default Props iconElementRight(ReactElement iconElementRight) {
            setIconElementRight(iconElementRight);
            return this;
        }

        @JsOverlay
        default Props iconStyleRight(Object iconStyleRight) {
            setIconStyleRight(iconStyleRight);
            return this;
        }

        @JsOverlay
        default Props onLeftIconButtonTouchTap(MouseEventHandler onLeftIconButtonTouchTap) {
            setOnLeftIconButtonTouchTap(onLeftIconButtonTouchTap);
            return this;
        }

        @JsOverlay
        default Props onRightIconButtonTouchTap(MouseEventHandler onRightIconButtonTouchTap) {
            setOnRightIconButtonTouchTap(onRightIconButtonTouchTap);
            return this;
        }

        @JsOverlay
        default Props onTitleTouchTap(TouchEventHandler onTitleTouchTap) {
            setOnTitleTouchTap(onTitleTouchTap);
            return this;
        }

        @JsOverlay
        default Props showMenuIconButton(boolean showMenuIconButton) {
            setShowMenuIconButton(showMenuIconButton);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props title(String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleStyle(Object titleStyle) {
            setTitleStyle(titleStyle);
            return this;
        }

        @JsOverlay
        default Props zDepth(int zDepth) {
            setZDepth(zDepth);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
