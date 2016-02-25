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
public class DropDownMenu extends ExternalComponent<DropDownMenu.Props> {

    @Inject
    public DropDownMenu() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.DropDownMenu;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean autoWidth;
//        String className;
//        boolean disabled;
//        CSSProps iconStyle;
//        CSSProps labelStyle;
//        double maxHeight = 500;
//        CSSProps menuStyle;
//        boolean openImmediately;
//        CSSProps style;
//        CSSProps underlineStyle;
//        Object value;
//        Func.Run onChange; // func

        @JsProperty
        boolean isAutoWidth();

        @JsProperty
        void setAutoWidth(boolean autoWidth);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        double getMaxHeight();

        @JsProperty
        void setMaxHeight(double maxHeight);

        @JsProperty
        CSSProps getMenuStyle();

        @JsProperty
        void setMenuStyle(CSSProps menuStyle);

        @JsProperty
        boolean isOpenImmediately();

        @JsProperty
        void setOpenImmediately(boolean openImmediately);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        CSSProps getUnderlineStyle();

        @JsProperty
        void setUnderlineStyle(CSSProps underlineStyle);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props autoWidth(final boolean autoWidth) {
            setAutoWidth(autoWidth);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final CSSProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props maxHeight(final double maxHeight) {
            setMaxHeight(maxHeight);
            return this;
        }

        @JsOverlay
        default Props menuStyle(final CSSProps menuStyle) {
            setMenuStyle(menuStyle);
            return this;
        }

        @JsOverlay
        default Props openImmediately(final boolean openImmediately) {
            setOpenImmediately(openImmediately);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props underlineStyle(final CSSProps underlineStyle) {
            setUnderlineStyle(underlineStyle);
            return this;
        }

        @JsOverlay
        default Props value(final Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onChange(final Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }
        

    }
}
