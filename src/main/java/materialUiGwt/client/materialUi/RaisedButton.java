package materialUiGwt.client.materialUi;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;
import materialUiGwt.client.ExternalComponent;

import javax.inject.Inject;

public class RaisedButton extends ExternalComponent<RaisedButton.Props> {

    @Inject
    public RaisedButton() {
    }

    @Override
    protected native Object reactClass() /*-{
        return $wnd.WebpackOutput.RaisedButton;
    }-*/;

    @Override
    protected native Props defaultProps() /*-{
        return $wnd.WebpackOutput.RaisedButton.getDefaultProps();
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
        public MouseEventHandler onMouseDown;
        public MouseEventHandler onMouseEnter;
        public MouseEventHandler onMouseLeave;
        public MouseEventHandler onMouseUp;
        public MouseEventHandler onTouchEnd;
        public MouseEventHandler onTouchStart;
        public boolean primary;
        public boolean secondary;
        public Object style;
    }
}
