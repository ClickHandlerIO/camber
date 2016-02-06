package materialUiGwt.client;


import com.google.gwt.core.client.ScriptInjector;
import materialUiGwt.resources.MaterialUiBundle;

public class MaterialUi {
    public static void init() {
        final MaterialUiBundle bundle = MaterialUiBundle.INSTANCE;

        /* Order Matters */

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        // JS
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        ScriptInjector.fromString(bundle.appBar().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(bundle.appCanvas().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(bundle.autoComplete().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(bundle.leftNav().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(bundle.raisedButton().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
