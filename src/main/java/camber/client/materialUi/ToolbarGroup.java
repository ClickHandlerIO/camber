package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class ToolbarGroup extends ExternalComponent<ToolbarGroup.Props> {

    @Inject
    public ToolbarGroup() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.ToolbarGroup;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        boolean firstChild; // for first child left gap
//        // invalid Variable name 'float' changed below
//        String floatGroup; // enum 'left' 'right'
//        boolean lastChild; // for last child right gap
//        CSSProps style;
//        // not sure we want on onClick for the whole group


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isFirstChild();

        @JsProperty
        void setFirstChild(boolean firstChild);

        @JsProperty
        String getFloatGroup();

        @JsProperty
        void setFloatGroup(String floatGroup);

        @JsProperty
        boolean isLastChild();

        @JsProperty
        void setLastChild(boolean lastChild);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props firstChild(final boolean firstChild) {
            setFirstChild(firstChild);
            return this;
        }

        @JsOverlay
        default Props floatGroup(final String floatGroup) {
            setFloatGroup(floatGroup);
            return this;
        }

        @JsOverlay
        default Props lastChild(final boolean lastChild) {
            setLastChild(lastChild);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }


    }
}
