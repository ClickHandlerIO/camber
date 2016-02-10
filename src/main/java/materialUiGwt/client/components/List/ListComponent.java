package materialUiGwt.client.components.List;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *  material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
public class ListComponent {
    @JsType
    public static class Props {
        boolean insetSubheader;
        String style; // ?
        ReactElement subheader; // node
        String subheaderStyle; // ?
        String zDepth; // ? type = PropTypes.zDepth

    }
}
