package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Tabs extends ExternalComponent<Tabs.Props> {

    @Inject
    public Tabs() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Tabs;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getContentContainerClassName();

        @JsProperty
        void setContentContainerClassName(String contentContainerClassName);

        @JsProperty
        String getContentContainerStyle();

        @JsProperty
        void setContentContainerStyle(String contentContainerStyle);

        @JsProperty
        double getInitialSelectedIndex();

        @JsProperty
        void setInitialSelectedIndex(double initialSelectedIndex);

        @JsProperty
        CSSProps getInkBarStyle();

        @JsProperty
        void setInkBarStyle(CSSProps inkBarStyle);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        CSSProps getTabItemContainerStyle();

        @JsProperty
        void setTabItemContainerStyle(CSSProps tabItemContainerStyle);

        @JsProperty
        Object getTabTemplate();

        @JsProperty
        void setTabTemplate(Object tabTemplate);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props contentContainerClassName(String contentContainerClassName) {
            setContentContainerClassName(contentContainerClassName);
            return this;
        }

        @JsOverlay
        default Props contentContainerStyle(String contentContainerStyle) {
            setContentContainerStyle(contentContainerStyle);
            return this;
        }

        @JsOverlay
        default Props initialSelectedIndex(double initialSelectedIndex) {
            setInitialSelectedIndex(initialSelectedIndex);
            return this;
        }

        @JsOverlay
        default Props inkBarStyle(CSSProps inkBarStyle) {
            setInkBarStyle(inkBarStyle);
            return this;
        }

        @JsOverlay
        default Props onChange(Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props tabItemContainerStyle(CSSProps tabItemContainerStyle) {
            setTabItemContainerStyle(tabItemContainerStyle);
            return this;
        }

        @JsOverlay
        default Props tabTemplate(Object tabTemplate) {
            setTabTemplate(tabTemplate);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }

    }
}
