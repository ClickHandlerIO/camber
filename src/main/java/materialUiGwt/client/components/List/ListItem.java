package materialUiGwt.client.components.list;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *  many variables - http://www.material-ui.com/#/components/list
 */
public class ListItem {
    @JsType
    public static class Props {
        boolean autoGenerateNestedIndicator = true;
        boolean disableKeyboardFocus;
        boolean disabled;
        boolean initiallyOpen;
        String innerDivStyle; // ?
        boolean insetChildren;
        ReactElement leftAvatar;
        ReactElement leftCheckbox;
        ReactElement leftIcon;
        ReactElement[] nestedItems;
        String nestedListStyle; // ?
        ReactElement primaryText; // node - block element that contains the primary text, if a string passed in, a div tag will be rendered
        boolean primaryTogglesNestedList;
        ReactElement rightAvatar;
        ReactElement rightIcon;
        ReactElement rightButton;
        ReactElement rightToggle;
        ReactElement secondaryText; // node - contains secondary text, string becomes div element
        int secondaryTextLines; // enum can be 1 or 2 - number of lines before ellipsis (more) shows
        String style; // ?

        // functions
        Object onKeyboardFocus; // func
        Object onMouseEnter; // func
        Object onMouseLeave; // func
        Object onNestedListToggle; // func
        Object onTouchStart; // func
        Object onTouchTap; // func

        // automatically managed but available to modify if you want to risk it
        int nestedLevel;

    }
}
