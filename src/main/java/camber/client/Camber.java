package camber.client;

import camber.resources.CamberResourceBundle;
import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.momentGwt.client.Moment;

public class Camber {
    public static void inject() {

        // moment js (needs to be before FullCalendar)
        Moment.injectJavascript();

        // jquery and jquery plugins
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.jQuery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.Select2().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.FullCalendar().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // WebPack
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.WebpackOutput().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        exposePackedJs();

        // Inject React Router
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
