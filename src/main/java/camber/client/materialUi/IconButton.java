package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FocusEventHandler;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class IconButton extends ExternalComponent<IconButton.Props> {

    @Inject
    public IconButton() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.IconButton;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
       public String className;
       public boolean disabled;
       public String iconClassName;
       public CSSProps iconStyle;
       public FocusEventHandler onBlur;
       public FocusEventHandler onFocus;
       public KeyboardEventHandler onKeyboardFocus;
       public MouseEventHandler onMouseEnter;
       public MouseEventHandler onMouseLeave;
       public MouseEventHandler onClick;
       public CSSProps style;
       public String tooltip;
       public String tooltipPosition; // "bottom-center", "top-center", "bottom-right", "top-right", "bottom-left" and "top-left"
       public CSSProps tooltipStyles;
       public boolean touch; // prop to make tooltip larger for mobile, defaults to false
    }
}
