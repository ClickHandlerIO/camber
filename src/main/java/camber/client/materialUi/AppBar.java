package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
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
    }
}
