package materialUiGwt.client.materialUi;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
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
    public static class Props {
        String className;
        String iconClassNameLeft;
        String iconClassNameRight;
        ReactElement iconElementLeft;
        ReactElement iconElementRight;
        String iconStyleRight; // ?
        boolean showMenuIconButton = true;
        String style; // ?
        ReactElement title; // default = '',  The title to display on the app bar
        String titleStyle; // ?
        String zDepth; // ? type = PropTypes.zDepth
        MouseEventHandler onLeftIconButtonTouchTap;
        MouseEventHandler onRightIconButtonTouchTap;
        TouchEventHandler onTitleTouchTap;
    }
}
