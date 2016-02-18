package camber.client;

import io.clickhandler.web.Func;
import io.clickhandler.web.Reflection;
import io.clickhandler.web.dom.DOM;
import io.clickhandler.web.react.ChildCounter;
import io.clickhandler.web.react.React;
import io.clickhandler.web.react.ReactElement;

public abstract class ExternalComponent<P> {

    public ExternalComponent() {
    }

    protected abstract ReactClass<P> reactClass();

    protected P defaultProps() {
        P props = reactClass().getDefaultProps();

        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", ChildCounter.get().newKey());
        }

        return props;
    }

    public ReactElement $() {
        return React.createElement(reactClass(), defaultProps());
    }

    public ReactElement $(Object... children) {
        return React.createElement(reactClass(), defaultProps(), children);
    }

    public ReactElement $(Func.Run1<P> propsCallback) {
        P props = defaultProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(reactClass(), props);
    }

    public ReactElement $(Func.Run1<P> propsCallback, Func.Run1<DOM.ChildList> childCallback) {
        P props = defaultProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }

        DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }

        return React.createElement(reactClass(), props, childList.toArray());
    }

    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        P props = defaultProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(reactClass(), props, children);
    }

    public ReactElement $$(Func.Run1<DOM.ChildList> childCallback) {
        P props = defaultProps();
        DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }
        return React.createElement(reactClass(), props, childList.toArray());
    }
}