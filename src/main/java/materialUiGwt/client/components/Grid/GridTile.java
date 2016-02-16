package materialUiGwt.client.components.grid;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactComponent;
import io.clickhandler.web.react.ReactElement;

/**
 *  Grid consists of:
 *  1. GridList
 *  2. GridTile
 *  ... for now they are separate classes
 */
public class GridTile {
    @JsType
    public static class Props {
        ReactElement actionIcon;
        String actionPosition; // enum 'left' 'right'
        int cols; // 1
        ReactComponent rootClass; // union type: default 'div' - per documentation... either a string used as a tag name for the tile root element, or a ReactComponent
        int rows;  // 1
        String style; // ?
        ReactElement title;
        ReactElement subtitle;
        String titleBackground; // default 'rgba(0, 0, 0, 0.4)' - white
        String titlePosition; // enum 'top' 'bottom'

    }
}
