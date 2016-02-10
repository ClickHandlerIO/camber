package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *  paper is a basic container that can give depth to the page
 */
public class Paper {
    @JsType
    public static class Props {
        boolean circle;
        boolean rounded = true;
        String style; // ?
        boolean transitionEnabled;
        String zDepth; // ? type = PropTypes.zDepth, default 1

    }
}
