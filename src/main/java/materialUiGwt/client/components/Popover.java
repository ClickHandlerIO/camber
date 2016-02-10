package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *
 */
public class Popover {
    @JsType
    public static class Props {
        ReactElement anchorEl; // unlike most objects this shouldn't be a String, thiss is for the anchor element the popover belongs to
        String anchorOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
        String targetOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
        boolean animated = true;
        boolean autoCloseWhenOffScreen = true;
        boolean canAutoPosition = true;
        String className;
        boolean open;
        String style; // ? default { overflowY: 'auto',}
        boolean userLayerForClickAway;
        String zDepth; // ? type = PropTypes.zDepth, default 1

        // function
        Object animation; // func
        Object onRequestClose; // func

    }
}
