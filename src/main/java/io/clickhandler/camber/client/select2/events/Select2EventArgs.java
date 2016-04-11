package io.clickhandler.camber.client.select2.events;

import io.clickhandler.camber.client.select2.Select2Data;
import com.google.gwt.dom.client.NativeEvent;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Select2EventArgs {
    @JsProperty
    Select2Data getData();

    @JsProperty
    NativeEvent getOriginalEvent();
}
