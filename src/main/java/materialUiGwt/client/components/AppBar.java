package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

public class AppBar {
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
        String propTypes_zDepth; // ? type = PropTypes.zDepth

        // functions
        Object onLeftIconButtonTouchTap; // func
        Object onRightIconButtonTouchTap; // func
        Object onTitleTouchTap; // func

    }
}
