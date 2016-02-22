package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RaisedButton extends ExternalComponent<RaisedButton.Props> {

    @Inject
    public RaisedButton() {
    }

    @Override
    protected native ReactClass<RaisedButton.Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.RaisedButton;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public String backgroundColor;
        public String className;
        public boolean disabled;
        public String disabledBackgroundColor;
        public String disabledLabelColor;
        public boolean fullWidth;
        public String href;
        public String icon;
        public String label;
        public String labelColor;
        public String labelPosition;
        public Object labelStyle;
        public boolean linkButton;
        public MouseEventHandler onClick;
        public MouseEventHandler onMouseDown;
        public MouseEventHandler onMouseEnter;
        public MouseEventHandler onMouseLeave;
        public MouseEventHandler onMouseUp;
        public MouseEventHandler onTouchEnd;
        public MouseEventHandler onTouchStart;
        public boolean primary;
        public boolean secondary;
        public CSSProps style;

        @Inject
        public Props() {
        }
    }
}
