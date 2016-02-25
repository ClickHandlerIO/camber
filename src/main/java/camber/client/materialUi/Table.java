package camber.client.materialUi;

import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Table extends ExternalComponent<Table.Props> {

    @Inject
    public Table() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Table;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean allRowsSelected;
//        CSSProps bodyStyle;
//        String className;
//        boolean fixedFooter = true;
//        boolean fixedHeader = true;
//        CSSProps footerStyle;
//        CSSProps headerStyle;
//        String height; // defaults to inherit
//        boolean multiSelectable;
//        boolean selectable;
//        CSSProps style;
//        CSSProps wrapperStyle;
//        MouseEventHandler onCellClick; // func - works in place of onClick
//        MouseEventHandler onCellHover; // func
//        MouseEventHandler onCellHoverExit; // func
//        MouseEventHandler onRowHover; // func
//        MouseEventHandler onRowHoverExit; // func
//        Func.Run onRowSelection; // func


        @JsProperty
        boolean isAllRowsSelected();

        @JsProperty
        void setAllRowsSelected(boolean allRowsSelected);

        @JsProperty
        CSSProps getBodyStyle();

        @JsProperty
        void setBodyStyle(CSSProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isFixedFooter();

        @JsProperty
        void setFixedFooter(boolean fixedFooter);

        @JsProperty
        boolean isFixedHeader();

        @JsProperty
        void setFixedHeader(boolean fixedHeader);

        @JsProperty
        CSSProps getFooterStyle();

        @JsProperty
        void setFooterStyle(CSSProps footerStyle);

        @JsProperty
        CSSProps getHeaderStyle();

        @JsProperty
        void setHeaderStyle(CSSProps headerStyle);

        @JsProperty
        String getHeight();

        @JsProperty
        void setHeight(String height);

        @JsProperty
        boolean isMultiSelectable();

        @JsProperty
        void setMultiSelectable(boolean multiSelectable);

        @JsProperty
        boolean isSelectable();

        @JsProperty
        void setSelectable(boolean selectable);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        CSSProps getWrapperStyle();

        @JsProperty
        void setWrapperStyle(CSSProps wrapperStyle);

        @JsProperty
        MouseEventHandler getOnCellClick();

        @JsProperty
        void setOnCellClick(MouseEventHandler onCellClick);

        @JsProperty
        MouseEventHandler getOnCellHover();

        @JsProperty
        void setOnCellHover(MouseEventHandler onCellHover);

        @JsProperty
        MouseEventHandler getOnCellHoverExit();

        @JsProperty
        void setOnCellHoverExit(MouseEventHandler onCellHoverExit);

        @JsProperty
        MouseEventHandler getOnRowHover();

        @JsProperty
        void setOnRowHover(MouseEventHandler onRowHover);

        @JsProperty
        MouseEventHandler getOnRowHoverExit();

        @JsProperty
        void setOnRowHoverExit(MouseEventHandler onRowHoverExit);

        @JsProperty
        Func.Run getOnRowSelection();

        @JsProperty
        void setOnRowSelection(Func.Run onRowSelection);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props allRowsSelected(final boolean allRowsSelected) {
            setAllRowsSelected(allRowsSelected);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(final CSSProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props fixedFooter(final boolean fixedFooter) {
            setFixedFooter(fixedFooter);
            return this;
        }

        @JsOverlay
        default Props fixedHeader(final boolean fixedHeader) {
            setFixedHeader(fixedHeader);
            return this;
        }

        @JsOverlay
        default Props footerStyle(final CSSProps footerStyle) {
            setFooterStyle(footerStyle);
            return this;
        }

        @JsOverlay
        default Props headerStyle(final CSSProps headerStyle) {
            setHeaderStyle(headerStyle);
            return this;
        }

        @JsOverlay
        default Props height(final String height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props multiSelectable(final boolean multiSelectable) {
            setMultiSelectable(multiSelectable);
            return this;
        }

        @JsOverlay
        default Props selectable(final boolean selectable) {
            setSelectable(selectable);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props wrapperStyle(final CSSProps wrapperStyle) {
            setWrapperStyle(wrapperStyle);
            return this;
        }

        @JsOverlay
        default Props onCellClick(final MouseEventHandler onCellClick) {
            setOnCellClick(onCellClick);
            return this;
        }

        @JsOverlay
        default Props onCellHover(final MouseEventHandler onCellHover) {
            setOnCellHover(onCellHover);
            return this;
        }

        @JsOverlay
        default Props onCellHoverExit(final MouseEventHandler onCellHoverExit) {
            setOnCellHoverExit(onCellHoverExit);
            return this;
        }

        @JsOverlay
        default Props onRowHover(final MouseEventHandler onRowHover) {
            setOnRowHover(onRowHover);
            return this;
        }

        @JsOverlay
        default Props onRowHoverExit(final MouseEventHandler onRowHoverExit) {
            setOnRowHoverExit(onRowHoverExit);
            return this;
        }

        @JsOverlay
        default Props onRowSelection(final Func.Run onRowSelection) {
            setOnRowSelection(onRowSelection);
            return this;
        }


    }
}
