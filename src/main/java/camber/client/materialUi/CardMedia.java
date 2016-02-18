package camber.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

/**
 *  Card_u consists of many different parts that share property names:
 *  for now they are separate classes
 *  1. Card_u
 *  2. CardActions
 *  3. CardHeader
 *  4. CardMedia
 *  5. CardTitle
 *  6. CardText
 */
public class CardMedia {
    @JsType
    public static class Props {
        boolean actAsExpander;
        boolean expandable;
        String mediaStyle; // ?
        ReactElement overlay; // node
        String overlayContainerStyle; // ?
        String overlayContentStyle; // ?
        String overlayStyle; // ?
        String style; // ?

    }
}
