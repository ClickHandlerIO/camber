package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class DropDownMenu {
    @JsType
    public static class Props {
        boolean autoWidth;
        String className;
        boolean disabled;
        String iconStyle;
        String labelStyle;
        int maxHeight = 500;
        String menuStyle;
        boolean openImmediately;
        String style;
        String underlineStyle;
        Object value;

        // functions
        Object onChange; // func

        // deprecated - avoid
        String displayMember;
        String labelMember;
        String[] menuItems;
        int selectedIndex;
        String valueLink;
        String valueMember;

        @Inject
        public Props() {
        }
    }
}
