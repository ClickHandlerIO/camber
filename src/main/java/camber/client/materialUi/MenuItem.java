package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
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

    @JsType
    public static class Props extends BaseProps {
        public boolean checked;
        public boolean desktop;
        public boolean disabled;
        public String focusState; // 'none', 'focused', 'keyboard-focused'
        public CSSProps innerDivStyle;
        public boolean insetChildren;
        public ReactElement leftIcon;
        public ReactElement menuItems; // nested MenuItems for this menu item, for nested menus
        public TouchEventHandler onTouchTap;
        public ReactElement rightIcon;
        public ReactElement secondaryText;
        public CSSProps style;
        public Object value;

        @Inject
        public Props() {
        }
    }
}
