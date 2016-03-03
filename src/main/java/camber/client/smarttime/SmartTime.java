package camber.client.smarttime;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *  has dependencies Moment, react, react-autoupdate-time, react-time
 */
@Singleton
public class SmartTime extends ExternalComponent<SmartTime.Props> {

    @Inject
    public SmartTime() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.SmartTime;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        // seems like the only prop for the component
//        public Object value; // can be Date, Moment or String

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);


        ///////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props value(final Object value) {
            setValue(value);
            return this;
        }


    }
}
