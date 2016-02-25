package camber.client.materialUi;

import io.clickhandler.web.Func;
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
public class RadioButtonGroup extends ExternalComponent<RadioButtonGroup.Props> {

    @Inject
    public RadioButtonGroup() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.RadioButtonGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        String defaultSelected;
//        String labelPosition; // enum 'left' 'right'
//        String name; //
//        CSSProps style;
//        String valueSelected;
//        Func.Run onChange; // func


        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getDefaultSelected();

        @JsProperty
        void setDefaultSelected(String defaultSelected);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        String getName();

        @JsProperty
        void setName(String name);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getValueSelected();

        @JsProperty
        void setValueSelected(String valueSelected);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props defaultSelected(final String defaultSelected) {
            setDefaultSelected(defaultSelected);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props name(final String name) {
            setName(name);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props valueSelected(final String valueSelected) {
            setValueSelected(valueSelected);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }


    }
}
