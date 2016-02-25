package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.*;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
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
public class GridTile extends ExternalComponent<GridTile.Props> {

    @Inject
    public GridTile() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.GridTile;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        ReactElement actionIcon;
//        String actionPosition; // enum 'left' 'right'
//        double cols; // 1
//        ReactComponent rootClass; // union type: default 'div' - per documentation... either a string used as a tag name for the tile root element, or a ReactComponent
//        double rows;  // 1
//        CSSProps style; // ?
//        ReactElement title;
//        ReactElement subtitle;
//        String titleBackground; // default 'rgba(0, 0, 0, 0.4)' - white
//        String titlePosition; // enum 'top' 'bottom'


        @JsProperty
        ReactElement getActionIcon();

        @JsProperty
        void setActionIcon(ReactElement actionIcon);

        @JsProperty
        String getActionPosition();

        @JsProperty
        void setActionPosition(String actionPosition);

        @JsProperty
        double getCols();

        @JsProperty
        void setCols(double cols);

        @JsProperty
        ReactComponent getRootClass();

        @JsProperty
        void setRootClass(ReactComponent rootClass);

        @JsProperty
        double getRows();

        @JsProperty
        void setRows(double rows);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        ReactElement getTitle();

        @JsProperty
        void setTitle(ReactElement title);

        @JsProperty
        ReactElement getSubtitle();

        @JsProperty
        void setSubtitle(ReactElement subtitle);

        @JsProperty
        String getTitleBackground();

        @JsProperty
        void setTitleBackground(String titleBackground);

        @JsProperty
        String getTitlePosition();

        @JsProperty
        void setTitlePosition(String titlePosition);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actionIcon(final ReactElement actionIcon) {
            setActionIcon(actionIcon);
            return this;
        }

        @JsOverlay
        default Props actionPosition(final String actionPosition) {
            setActionPosition(actionPosition);
            return this;
        }

        @JsOverlay
        default Props cols(final double cols) {
            setCols(cols);
            return this;
        }

        @JsOverlay
        default Props rootClass(final ReactComponent rootClass) {
            setRootClass(rootClass);
            return this;
        }

        @JsOverlay
        default Props rows(final double rows) {
            setRows(rows);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props title(final ReactElement title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props subtitle(final ReactElement subtitle) {
            setSubtitle(subtitle);
            return this;
        }

        @JsOverlay
        default Props titleBackground(final String titleBackground) {
            setTitleBackground(titleBackground);
            return this;
        }

        @JsOverlay
        default Props titlePosition(final String titlePosition) {
            setTitlePosition(titlePosition);
            return this;
        }


    }
}
