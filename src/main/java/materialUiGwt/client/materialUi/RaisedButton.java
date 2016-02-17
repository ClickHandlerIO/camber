package materialUiGwt.client.materialUi;

import io.clickhandler.web.event.MouseEventHandler;
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
    public static class Props {
        String backgroundColor;
        String className;
        boolean disabled;
        String disabledBackgroundColor;
        String disabledLabelColor;
        String label;
        String labelStyle; // ?
        boolean linkButton;
        MouseEventHandler onMouseDown;
    }
}
