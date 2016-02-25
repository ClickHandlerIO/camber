package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
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
public class CardTitle extends ExternalComponent<CardTitle.Props> {

    @Inject
    public CardTitle() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.CardTitle;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean actAsExpander;
//        boolean expandable;
//        boolean showExpandableButton;
//        CSSProps style; // ?
//        ReactElement subtitle; // node
//        String subtitleColor;
//        CSSProps subtitleStyle; // ?
//        ReactElement title; // node
//        String titleColor;
//        CSSProps titleStyle; // ?


        @JsProperty
        boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

        @JsProperty
        boolean isExpandable();

        @JsProperty
        void setExpandable(boolean expandable);

        @JsProperty
        boolean isShowExpandableButton();

        @JsProperty
        void setShowExpandableButton(boolean showExpandableButton);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        ReactElement getSubtitle();

        @JsProperty
        void setSubtitle(ReactElement subtitle);

        @JsProperty
        String getSubtitleColor();

        @JsProperty
        void setSubtitleColor(String subtitleColor);

        @JsProperty
        CSSProps getSubtitleStyle();

        @JsProperty
        void setSubtitleStyle(CSSProps subtitleStyle);

        @JsProperty
        ReactElement getTitle();

        @JsProperty
        void setTitle(ReactElement title);

        @JsProperty
        String getTitleColor();

        @JsProperty
        void setTitleColor(String titleColor);

        @JsProperty
        CSSProps getTitleStyle();

        @JsProperty
        void setTitleStyle(CSSProps titleStyle);

        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(final boolean actAsExpander) {
            setActAsExpander(actAsExpander);
            return this;
        }

        @JsOverlay
        default Props expandable(final boolean expandable) {
            setExpandable(expandable);
            return this;
        }

        @JsOverlay
        default Props showExpandableButton(final boolean showExpandableButton) {
            setShowExpandableButton(showExpandableButton);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props subtitle(final ReactElement subtitle) {
            setSubtitle(subtitle);
            return this;
        }

        @JsOverlay
        default Props subtitleColor(final String subtitleColor) {
            setSubtitleColor(subtitleColor);
            return this;
        }

        @JsOverlay
        default Props subtitleStyle(final CSSProps subtitleStyle) {
            setSubtitleStyle(subtitleStyle);
            return this;
        }

        @JsOverlay
        default Props title(final ReactElement title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleColor(final String titleColor) {
            setTitleColor(titleColor);
            return this;
        }

        @JsOverlay
        default Props titleStyle(final CSSProps titleStyle) {
            setTitleStyle(titleStyle);
            return this;
        }


    }
}
