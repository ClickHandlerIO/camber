package camber.client.materialUi;

import jsinterop.annotations.JsType;

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
public class CardActions {
    @JsType
    public static class Props {
        boolean actAsExpander;
        boolean expandable;
        boolean showExpandableButton;
        String style; // ?

    }
}
