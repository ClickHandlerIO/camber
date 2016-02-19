package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


public class SvgIcon extends ExternalComponent<SvgIcon.Props> {

    @Inject
    public SvgIcon() {
    }

    @Override
    protected native ReactClass<SvgIcon.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.SvgIcon;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
       public String color;
       public String hoverColor;
       public MouseEventHandler onMouseEnter;
       public MouseEventHandler onMouseLeave;
       public CSSProps style;
       public String viewBox;
    }
}
