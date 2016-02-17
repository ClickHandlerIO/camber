package materialUiGwt.client;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.DOM;
import io.clickhandler.web.react.React;
import io.clickhandler.web.react.ReactElement;

public abstract class ExternalComponent<P> {

    public ExternalComponent() {
    }

    protected abstract Object reactClass();

    protected abstract P defaultProps();

    public ReactElement $() {
        return React.createElement(reactClass(), defaultProps());
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
