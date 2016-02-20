package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FontIcon {
    @JsType
    public static class Props {
        String className; // used to enter icon className, probably will work with our current icon enums
        String color;
        String hoverColor;
        String style; // ?

        // functions
        Object onMouseEnter; // func
        Object onMouseLeave; // func

        @Inject
        public Props() {
        }
    }
}
