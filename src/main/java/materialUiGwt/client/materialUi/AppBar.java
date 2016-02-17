package materialUiGwt.client.materialUi;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;
import materialUiGwt.client.ExternalComponent;

import javax.inject.Inject;

public class AppBar extends ExternalComponent<AppBar.Props> {

    @Inject
    public AppBar() {
    }

    @Override
    protected native Object reactClass() /*-{
        return $wnd.WebpackOutput.AppBar;
    }-*/;

    @Override
    protected native Props defaultProps() /*-{
        return $wnd.WebpackOutput.AppBar.getDefaultProps();
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
