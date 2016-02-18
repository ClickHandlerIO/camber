package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class Divider extends ExternalComponent<Divider.Props> {

    @Inject
    public Divider() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Divider;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
       public String className;
       public boolean inset; // inset parameter allows the divider to to align with inset content, such as inset List_u components
       public Object muiTheme;
       public CSSProps style;
    }
}