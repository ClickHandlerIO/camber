package camber.client.chartjs;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class ChartJs extends ExternalComponent<ChartJs.Props> {

    @Inject
    public ChartJs() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo
    }
}
