package camber.client.materialUi;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;
import camber.client.ExternalComponent;
import camber.client.ReactClass;

import javax.inject.Inject;

public class AppBar extends ExternalComponent<AppBar.Props> {

    @Inject
    public AppBar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.AppBar;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public String className;
        public String iconClassNameLeft;
        public String iconClassNameRight;
        public ReactElement iconElementLeft;
        public ReactElement iconElementRight;
        public Object iconStyleRight;
        public MouseEventHandler onLeftIconButtonTouchTap;
        public MouseEventHandler onRightIconButtonTouchTap;
        public TouchEventHandler onTitleTouchTap;
        public boolean showMenuIconButton;
        public Object style;
        public String title;
        public Object titleStyle;
        public int zDepth;
    }
}
