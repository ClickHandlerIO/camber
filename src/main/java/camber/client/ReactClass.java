package camber.client;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ReactClass<P> {
    P getDefaultProps();
}
