package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class MenuItem extends ExternalComponent<MenuItem.Props> {
    @Inject
    public MenuItem() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.MenuItem;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        boolean isDesktop();

        @JsProperty
        void setDesktop(boolean desktop);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        String getFocusState();

        @JsProperty
        void setFocusState(String focusState);

        @JsProperty
        CSSProps getInnerDivStyle();

        @JsProperty
        void setInnerDivStyle(CSSProps innerDivStyle);

        @JsProperty
        boolean isInsetChildren();

        @JsProperty
        void setInsetChildren(boolean insetChildren);

        @JsProperty
        ReactElement getLeftIcon();

        @JsProperty
        void setLeftIcon(ReactElement leftIcon);

        @JsProperty
        ReactElement getMenuItems();

        @JsProperty
        void setMenuItems(ReactElement menuItems);

        @JsProperty
        TouchEventHandler getOnTouchTap();

        @JsProperty
        void setOnTouchTap(TouchEventHandler onTouchTap);

        @JsProperty
        ReactElement getRightIcon();

        @JsProperty
        void setRightIcon(ReactElement rightIcon);

        @JsProperty
        ReactElement getSecondaryText();

        @JsProperty
        void setSecondaryText(ReactElement secondaryText);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);
    }
}
