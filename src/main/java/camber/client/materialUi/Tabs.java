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
       public String className;
       public String contentContainerClassName;
       public String contentContainerStyle;
       public int initialSelectedIndex;
       public CSSProps inkBarStyle;
       public Func.Run onChange;
       public CSSProps style;
       public CSSProps tabItemContainerStyle;
       public Object tabTemplate; // from docs: Override the default tab template used to wrap the content of each tab element.
       public Object value;
    }
}
