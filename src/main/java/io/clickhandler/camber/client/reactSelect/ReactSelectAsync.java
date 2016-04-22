package io.clickhandler.camber.client.reactSelect;

import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.ExternalComponent;
import io.clickhandler.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactSelectAsync extends ExternalComponent<ReactSelectAsync.Props> {
    @Inject
    public ReactSelectAsync() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.Camber.ReactSelectAsync;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // todo
    }
}
