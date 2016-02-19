package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

import javax.inject.Inject;

public class Avatar extends ExternalComponent<Avatar.Props> {

    @Inject
    public Avatar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Avatar;
    }-*/;

    @JsType
    public static class Props extends BaseProps{
       public String backgroundColor;
       public String className;
       public String color;
       public ReactElement icon;
       public int size;
       public String src;
       public CSSProps style;
    }
}
