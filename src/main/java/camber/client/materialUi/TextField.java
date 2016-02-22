package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.FormEventHandler;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class TextField extends ExternalComponent<TextField.Props> {

    @Inject
    public TextField() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.TextField;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public String className;
        public String defaultValue;
        public boolean disabled;
        public CSSProps errorStyle;
        public String errorText;
        public CSSProps floatingLabelStyle;
        public String floatingLabelText;
        public boolean fullWidth;
        public CSSProps hintStyle;
        public String hintText;
        public String id;
        public CSSProps inputStyle;
        public boolean multiLine;
        public Func.Run onBlur;
        public FormEventHandler onChange;
        public KeyboardEventHandler onEnterKeyDown;
        public Func.Run onFocus;
        public KeyboardEventHandler onKeyDown;
        public int rows;
        public int rowsMax;
        public CSSProps style;
        public String type; // ie "text" or "password"
        public CSSProps underlineDisabledStyle;
        public CSSProps underlineFocusStyle;
        public boolean underlineShow;
        public CSSProps underlineStyle;
        public String value;

        @Inject
        public Props() {
        }
    }
}
