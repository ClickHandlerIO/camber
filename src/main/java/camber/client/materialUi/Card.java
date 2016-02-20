package camber.client.materialUi;

import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *  Card_u consists of many different parts: for now they are separate classes
 *  1. Card_u
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

        @Inject
        public Props() {
        }
    }
}
