package camber.client.reactSelect;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactSelectAsync extends ExternalComponent<ReactSelectAsync.Props> {
    @Inject
    public ReactSelectAsync() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ReactSelectAsync;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo
    }
}
