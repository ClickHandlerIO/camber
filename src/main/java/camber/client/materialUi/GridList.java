package camber.client.materialUi;

import jsinterop.annotations.JsType;

/**
 *  Grid_u consists of:
 *  1. GridList
 *  2. GridTile
 *  ... for now they are separate classes
 */
public class GridList {
    @JsType
    public static class Props {
        int cellHeight; // default 180
        int cols; // 2
        int padding;
        String style; // ?

    }
}
