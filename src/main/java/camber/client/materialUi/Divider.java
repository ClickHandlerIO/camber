package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.Reflection;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ChildCounter;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class Divider {

    // todo need to get MuiTheme passed in

    @Inject
    public Divider() {
    }

    public ReactElement $() {
        return createElement(defaultProps());
    }

    public ReactElement $(Func.Run1<Props> propsCallback) {
        Props props = defaultProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return createElement(props);
    }

    protected native ReactElement createElement(Props props) /*-{
        return $wnd.Camber.MaterialUi.Divider(props);
    }-*/;

    protected Props defaultProps() {
        Props props = new Props();
        props.inset = false;

        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", ChildCounter.get().newKey());
        }

        return props;
    }

    @JsType
    public static class Props extends BaseProps {
        public String className;
        public boolean inset; // inset parameter allows the divider to to align with inset content, such as inset List_u components
        public Object muiTheme;
        public CSSProps style;
    }
}