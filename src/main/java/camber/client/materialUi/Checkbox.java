package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
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
 *
 */
@Singleton
public class Checkbox extends ExternalComponent<Checkbox.Props> {

    @Inject
    public Checkbox() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Checkbox;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean checked;
//        ReactElement checkedIcon; // SvgIcon to use when checked
//        ReactElement unCheckedIcon; // SvgIcon to use when un-checked
//        boolean defaultChecked;
//        boolean disabled;
//        CSSProps iconStyle;
//        String labelPosition; // enum 'left' 'right'
//        CSSProps labelStyle;
//        CSSProps style;
//        String valueLink;


        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        ReactElement getCheckedIcon();

        @JsProperty
        void setCheckedIcon(ReactElement checkedIcon);

        @JsProperty
        ReactElement getUnCheckedIcon();

        @JsProperty
        void setUnCheckedIcon(ReactElement unCheckedIcon);

        @JsProperty
        boolean isDefaultChecked();

        @JsProperty
        void setDefaultChecked(boolean defaultChecked);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getValueLink();

        @JsProperty
        void setValueLink(String valueLink);

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        Func.Run1<Boolean> getOnCheck();

        @JsProperty
        void setOnCheck(Func.Run1<Boolean> onCheck);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props checked(final boolean checked) {
            setChecked(checked);
            return this;
        }

        @JsOverlay
        default Props checkedIcon(final ReactElement checkedIcon) {
            setCheckedIcon(checkedIcon);
            return this;
        }

        @JsOverlay
        default Props unCheckedIcon(final ReactElement unCheckedIcon) {
            setUnCheckedIcon(unCheckedIcon);
            return this;
        }

        @JsOverlay
        default Props defaultChecked(final boolean defaultChecked) {
            setDefaultChecked(defaultChecked);
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
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props valueLink(final String valueLink) {
            setValueLink(valueLink);
            return this;
        }

        @JsOverlay
        default Props label(final String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run1<Boolean> onCheck) {
            setOnCheck(onCheck);
            return this;
        }
    }
}
