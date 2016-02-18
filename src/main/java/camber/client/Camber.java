package camber.client;

import camber.resources.CamberResourceBundle;
import com.google.gwt.core.client.ScriptInjector;

public class Camber {
    public static void inject() {
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.WebpackOutput().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        exposePackedJs();
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.ReactRouter().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        tapEventPlugin();
    }

    private static native void exposePackedJs() /*-{
        $wnd.React = $wnd.Camber.React;
        $wnd.ReactDOM = $wnd.Camber.ReactDOM;
    }-*/;

    private static native void tapEventPlugin() /*-{
        $wnd.Camber.InjectTapEventPlugin();
    }-*/;
}
