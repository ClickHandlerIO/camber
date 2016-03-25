package camber.client.reactAddons;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactTransitionGroup extends ExternalComponent<ReactTransitionGroup.Props> {
    @Inject
    public ReactTransitionGroup() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ReactAddons.ReactTransitionGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement getComponent();

        @JsProperty
        void setComponent(ReactElement component);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);
    }
}
