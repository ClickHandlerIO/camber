package camber.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class Badge {
    @JsType
    public static class Props {

        String className;
        ReactElement badgeContent;
        String badgeStyle; // ?
        boolean primary;
        boolean secondary;
        String style; // ?

    }
}
