package camber.client.materialUi.utils;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "Camber.MaterialUi.Utils")
public class ColorManipulator {
    @JsMethod
    public static native String fade(String color, double amount);

    @JsMethod
    public static native String lighten(String color, double amount);

    @JsMethod
    public static native String darken(String color, double amount);
}
