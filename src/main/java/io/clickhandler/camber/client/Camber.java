package io.clickhandler.camber.client;

public class Camber {
//    public static void inject() {

    // jquery and jquery plugins
//

    // WebPack
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.WebpackOutput().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        exposePackedJs();

    // Inject React Router
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.ReactRouter().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        tapEventPlugin();
}

/*    private static native void exposePackedJs() *//*-{
        $wnd.React = $wnd.Camber.React;
        $wnd.ReactDOM = $wnd.Camber.ReactDOM;
    }-*//*;

    private static native void tapEventPlugin() *//*-{
        $wnd.Camber.InjectTapEventPlugin();
    }-*//*;*/
//}
