package materialUiGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import materialUiGwt.resources.MaterialUiBundle;

public class MaterialUi {
    public static void init() {
        ScriptInjector.fromString(MaterialUiBundle.INSTANCE.compiledJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        loadRequire();
    }


    private static native void loadRequire() /*-{
        var require = $wnd.require;
        require.config({
            baseUrl: 'js'
        });

        $wnd.MaterialUi = {};

        $wnd.require(['material-ui/lib/raised-button'], function (raisedButon) {
            $wnd.MaterialUi.RaisedButton = raisedButon;
        });

        //$wnd.MaterialUi.RaisedButton = $wnd.require('./material-ui/lib/raised-button');
    }-*/;

    public static native Object raisedButton() /*-{
        return $wnd.MaterialUi.RaisedButton;
    }-*/;
}
