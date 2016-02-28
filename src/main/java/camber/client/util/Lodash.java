package camber.client.util;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "Camber")
public class Lodash {
    public static native Object assign(Object object, Object ... sources);

    public static native boolean isEqual(Object o1, Object o2);
}
