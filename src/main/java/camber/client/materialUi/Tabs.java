package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class Tabs extends ExternalComponent<Tabs.Props> {

    @Inject
    public Tabs() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Tabs;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        String className;
        String contentContainerClassName;
        String contentContainerStyle;
        int initialSelectedIndex;
        CSSProps inkBarStyle;
        Func.Run onChange;
        CSSProps style;
        CSSProps tabItemContainerStyle;
        Object tabTemplate; // from docs: Override the default tab template used to wrap the content of each tab element.
        Object value;
    }
}
