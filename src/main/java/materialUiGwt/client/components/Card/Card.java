package materialUiGwt.client.components.Card;

import jsinterop.annotations.JsType;
import webmattr.react.ReactElement;

/**
 *  Card consists of many different parts: for now they are separate classes
 *  1. Card
 *  2. CardActions
 *  3. CardHeader
 *  4. CardMedia
 *  5. CardTitle
 *  6. CardText
 */
public class Card {
    @JsType
    public static class Props {
        boolean actAsExpander;
        boolean expandable;
        boolean initiallyExpanded;
        boolean showExpandableButton;

        // functions
        Object onExpandChange; // func

    }
}
