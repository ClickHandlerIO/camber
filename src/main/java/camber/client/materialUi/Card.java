package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *  Card_u consists of many different parts: for now they are separate classes
 *  1. Card_u
 *  2. CardActions
 *  3. CardHeader
 *  4. CardMedia
 *  5. CardTitle
 *  6. CardText
 */
@Singleton
public class Card extends ExternalComponent<Card.Props>{

    @Inject
    public Card() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Card;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        public boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

        @JsProperty
        boolean isExpandable();

        @JsProperty
        void setExpandable(boolean expandable);

        @JsProperty
        boolean isInitiallyExpanded();

        @JsProperty
        void setInitiallyExpanded(boolean initiallyExpanded);

        @JsProperty
        boolean isShowExpandableButton();

        @JsProperty
        void setShowExpandableButton(boolean showExpandableButton);

        @JsProperty
        Func.Run getOnExpandChange();

        @JsProperty
        void setOnExpandChange(Func.Run onExpandChange);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(boolean actAsExpander) {
            setActAsExpander(actAsExpander);
            return this;
        }

        @JsOverlay
        default Props expandable(boolean expandable) {
            setExpandable(expandable);
            return this;
        }

        @JsOverlay
        default Props initiallyExpanded(boolean initiallyExpanded) {
            setInitiallyExpanded(initiallyExpanded);
            return this;
        }

        @JsOverlay
        default Props showExpandableButton(boolean showExpandableButton) {
            setShowExpandableButton(showExpandableButton);
            return this;
        }

        @JsOverlay
        default Props onExpandChange(Func.Run onExpandChange) {
            setOnExpandChange(onExpandChange);
            return this;
        }

    }
}
