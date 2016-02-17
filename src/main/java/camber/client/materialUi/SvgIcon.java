package camber.client.materialUi;

import jsinterop.annotations.JsType;

/**
 *  SvgIcon component takes an SVG path element as its child, and converts it to a React component which displays the path and allows the icon to be styled and respond to mouse events
 */
public class SvgIcon {
    @JsType
    public static class Props {
//        String className;
        String color;
        String hoverColor;
        String style; // ?
        String viewBox; // default '0 0 24 24' coordinates, 0 0 being top left

        // functions
        Object onMouseEnter; // func
        Object onMouseLeave; // func

    }
}
