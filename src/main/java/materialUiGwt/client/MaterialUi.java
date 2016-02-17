package materialUiGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import materialUiGwt.resources.MaterialUiBundle;

public class MaterialUi {
    public static void init() {
        ScriptInjector.fromString(MaterialUiBundle.INSTANCE.WebPackOutput().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    public static native Object raisedButton() /*-{
        return $wnd.WebPackOutput.RaisedButton;
    }-*/;
}
