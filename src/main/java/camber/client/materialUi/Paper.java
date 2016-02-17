package camber.client.materialUi;

import jsinterop.annotations.JsType;

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
