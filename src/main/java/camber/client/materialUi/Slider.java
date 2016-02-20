package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class Slider {
    @JsType
    public static class Props {

        double defaultValue; // type valueInRangePropType
        double min; // must be between 0 and 1 inclusive, cannot equal max
        double max; // must be between 0 and 1 inclusive, cannot equal min
        double value; // the value of the slider
        String description;
        boolean disableFocusRipple;
        boolean disabled;
        String error;
        String name;
        boolean required;
        double step = 0.01; // the granularity slider can step through values
        String style;

        // functions
        Object onBlur; // func
        Object onChange; // func
        Object onDragStart; // func
        Object onDragStop; // func
        Object onFocus; // func

        @Inject
        public Props() {
        }

    }
}
