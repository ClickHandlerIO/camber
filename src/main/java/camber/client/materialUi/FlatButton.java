package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class FlatButton extends ExternalComponent<FlatButton.Props> {

    @Inject
    public FlatButton() {
    }

    @Override
    protected native ReactClass<FlatButton.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.FlatButton;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public String backgroundColor;
        public boolean disabled;
        public String hoverColor;
        public String href;
        public ReactElement icon;
        public String label;
        public String labelPosition; // "before" or "after"
        public CSSProps labelStyle;
        public boolean linkButton;
        public KeyboardEventHandler onKeyboardFocus;
        public MouseEventHandler onMouseEnter;
        public MouseEventHandler onMouseLeave;
        public MouseEventHandler onClick;
        public Func.Run onTouchStart;
        public boolean primary;
        public String rippleColor;
        public boolean secondary;
        public CSSProps style;

        @Inject
        public Props() {
        }
    }
}
