package camber.client.materialUi;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

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
@Singleton
public class CardHeader {
    @JsType
    public static class Props {
        boolean actAsExpander;
        ReactElement avatar;
        boolean expandable;
        boolean showExpandableButton;
        String style; // ?
        ReactElement subtitle; // node
        String subtitleColor;
        String subtitleStyle; // ?
        String textStyle; // ?
        ReactElement title; // node
        String titleColor;
        String titleStyle; // ?

        @Inject
        public Props() {
        }
    }
}
