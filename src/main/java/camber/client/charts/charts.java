package camber.client.charts;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class charts extends ExternalComponent<charts.Props> {

    @Inject
    public charts() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.TextAreaAutosize;
    }-*/;

    @JsType(isNative = true)
    public interface Props {
        // todo
    }
}
