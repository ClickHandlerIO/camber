package camber.client.reactd3;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * Created by admin on 3/1/16.
 */
public class ReactD3 extends ExternalComponent<ReactD3.Props> {

    @Inject
    public ReactD3() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.ReactD3;
    }-*/;


    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo -  various chart type classes need to be implemented as well

    }
}
