package camber.client.materialUi;

import camber.client.ExternalComponent;
import camber.client.ReactClass;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import elemental.json.JsonObject;
import io.clickhandler.web.Func;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.event.TouchEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsType;

import javax.inject.Inject;


public class ListItem extends ExternalComponent<ListItem.Props> {

    @Inject
    public ListItem() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.ListItem;
    }-*/;

    @JsType
    public static class Props extends BaseProps {
        public boolean autoGenerateNestedIndicator;
        public boolean disableKeyboardFocus;
        public boolean disabled;
        public boolean initiallyOpen;
        public Object innerDivStyle;
        public boolean insetChildren;
        public ReactElement leftAvatar;
        public ReactElement leftCheckbox;
        public ReactElement leftIcon;
        public ReactElement[] nestedItems;
        public int nestedLevel; // managed prop, modify at own risk
        public Object nestedListStyle;
        public KeyboardEventHandler onKeyboardFocus; // func
        public MouseEventHandler onMouseEnter; // func
        public MouseEventHandler onMouseLeave; // func
        public Func.Run onNestedListToggle; // func
        public TouchEventHandler onTouchStart; // func
        public TouchEventHandler onTouchTap; // func
        public ReactElement primaryText; // node - block element that contains the primary text, if a string passed in, a div tag will be rendered
        public boolean primaryTogglesNestedList;
        public ReactElement rightAvatar;
        public ReactElement rightIcon;
        public ReactElement rightButton;
        public ReactElement rightToggle;
        public ReactElement secondaryText; // node - contains secondary text, string becomes div element
        public int secondaryTextLines; // enum can be 1 or 2 - number of lines before ellipsis (more) shows
        public JavaScriptObject style;
    }
}
