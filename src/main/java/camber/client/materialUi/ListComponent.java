package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
@Singleton
public class ListComponent extends ExternalComponent<ListComponent.Props> {

    @Inject
    public ListComponent() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.List;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isInsetSubheader();

        @JsProperty
        void setInsetSubheader(boolean insetSubheader);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        ReactElement getSubheader();

        @JsProperty
        void setSubheader(ReactElement subheader);

        @JsProperty
        Object getSubheaderStyle();

        @JsProperty
        void setSubheaderStyle(Object subheaderStyle);

        @JsProperty
        double getZDepth();

        @JsProperty
        void setZDepth(double zDepth);
    }
}
