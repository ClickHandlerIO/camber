package materialUiGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import materialUiGwt.resources.WebpackResourceBundle;

public class JsDependencies {
    public static void inject() {
        ScriptInjector.fromString(WebpackResourceBundle.INSTANCE.WebpackOutput().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        exposePackedJs();
        ScriptInjector.fromString(WebpackResourceBundle.INSTANCE.ReactRouter().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        tapEventPlugin();
    }

    private static native void exposePackedJs() /*-{
        $wnd.React = $wnd.WebpackOutput.React;
        $wnd.ReactDOM = $wnd.WebpackOutput.ReactDOM;
    }-*/;

    private static native void tapEventPlugin() /*-{
        $wnd.WebpackOutput.InjectTapEventPlugin();
    }-*/;
}
