package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Toggle {

    @Inject
    public Toggle() {
    }



    @JsType(isNative = true)
    public static class Props {
        boolean defaultToggled;
        boolean disabled;
        CSSProps elementStyle;
        CSSProps iconStyle;
        String labelPosition; // enum 'left' 'right' default left
        CSSProps labelStyle;
        CSSProps rippleStyle;
        CSSProps style;
        String thumbStyle;
        boolean toggled; // toggled if set to true
        CSSProps trackStyle;
        String valueLink;
        Func.Run onToggle; // func


    }
}
