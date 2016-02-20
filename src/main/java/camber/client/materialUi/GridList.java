package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *  Grid_u consists of:
 *  1. GridList
 *  2. GridTile
 *  ... for now they are separate classes
 */
@Singleton
public class GridList {
    @JsType
    public static class Props {
        int cellHeight; // default 180
        int cols; // 2
        int padding;
        String style; // ?

        @Inject
        public Props() {
        }
    }
}
