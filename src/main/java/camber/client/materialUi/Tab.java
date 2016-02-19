package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *
 */
public class Tab extends ExternalComponent<Tab.Props> {

    @Inject
    public Tab() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Tab;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
       public String className;
       public ReactElement icon;
       public ReactElement label;
       public Func.Run onActive;
       public TouchEventHandler onTouchTap;
       public boolean selected;
       public CSSProps style;
       public Object value;
       public String width;
    }
}
