package io.clickhandler.camber.client.textareaAutosize;

import io.clickhandler.reactGwt.client.react.ExternalComponent;
import io.clickhandler.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class TextareaAutosize extends ExternalComponent<TextareaAutosize.Props> {

    @Inject
    public TextareaAutosize() {
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
