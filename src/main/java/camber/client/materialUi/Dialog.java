package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Dialog extends ExternalComponent<Dialog.Props> {

    @Inject
    public Dialog() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Dialog;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement[] getActions();

        @JsProperty
        void setActions(ReactElement[] actions);

        @JsProperty
        String getActionsContainerClassName();

        @JsProperty
        void setActionsContainerClassName(String actionsContainerClassName);

        @JsProperty
        CSSProps getActionsContainerStyle();

        @JsProperty
        void setActionsContainerStyle(CSSProps actionsContainerStyle);

        @JsProperty
        boolean isAutoDetectWindowHeight();

        @JsProperty
        void setAutoDetectWindowHeight(boolean autoDetectWindowHeight);

        @JsProperty
        boolean isAutoScrollBodyContent();

        @JsProperty
        void setAutoScrollBodyContent(boolean autoScrollBodyContent);

        @JsProperty
        String getBodyClassName();

        @JsProperty
        void setBodyClassName(String bodyClassName);

        @JsProperty
        CSSProps getBodyStyle();

        @JsProperty
        void setBodyStyle(CSSProps bodyStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getContentClassName();

        @JsProperty
        void setContentClassName(String contentClassName);

        @JsProperty
        CSSProps getContentStyle();

        @JsProperty
        void setContentStyle(CSSProps contentStyle);

        @JsProperty
        boolean isModal();

        @JsProperty
        void setModal(boolean modal);

        @JsProperty
        Func.Run1<Boolean> getOnRequestClose();

        @JsProperty
        void setOnRequestClose(Func.Run1<Boolean> onRequestClose);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        String getOverlayClassName();

        @JsProperty
        void setOverlayClassName(String overlayClassName);

        @JsProperty
        CSSProps getOverlayStyle();

        @JsProperty
        void setOverlayStyle(CSSProps overlayStyle);

        @JsProperty
        boolean isRepositionOnUpdate();

        @JsProperty
        void setRepositionOnUpdate(boolean repositionOnUpdate);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        String getTitleClassName();

        @JsProperty
        void setTitleClassName(String titleClassName);

        @JsProperty
        CSSProps getTitleStyle();

        @JsProperty
        void setTitleStyle(CSSProps titleStyle);


        ////////////////////
        // fluent setters
        ////////////////////


        @JsOverlay
        default Props actions(ReactElement[] actions) {
            setActions(actions);
            return this;
        }

        @JsOverlay
        default Props actionsContainerClassName(String actionsContainerClassName) {
            setActionsContainerClassName(actionsContainerClassName);
            return this;
        }

        @JsOverlay
        default Props actionsContainerStyle(CSSProps actionsContainerStyle) {
            setActionsContainerStyle(actionsContainerStyle);
            return this;
        }

        @JsOverlay
        default Props autoDetectWindowHeight(boolean autoDetectWindowHeight) {
            setAutoDetectWindowHeight(autoDetectWindowHeight);
            return this;
        }

        @JsOverlay
        default Props autoScrollBodyContent(boolean autoScrollBodyContent) {
            setAutoScrollBodyContent(autoScrollBodyContent);
            return this;
        }

        @JsOverlay
        default Props bodyClassName(String bodyClassName) {
            setBodyClassName(bodyClassName);
            return this;
        }

        @JsOverlay
        default Props bodyStyle(CSSProps bodyStyle) {
            setBodyStyle(bodyStyle);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props contentClassName(String contentClassName) {
            setContentClassName(contentClassName);
            return this;
        }

        @JsOverlay
        default Props contentStyle(CSSProps contentStyle) {
            setContentStyle(contentStyle);
            return this;
        }

        @JsOverlay
        default Props modal(boolean modal) {
            setModal(modal);
            return this;
        }

        @JsOverlay
        default Props onRequestClose(Func.Run1<Boolean> onRequestClose) {
            setOnRequestClose(onRequestClose);
            return this;
        }

        @JsOverlay
        default Props open(boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props overlayClassName(String overlayClassName) {
            setOverlayClassName(overlayClassName);
            return this;
        }

        @JsOverlay
        default Props overlayStyle(CSSProps overlayStyle) {
            setOverlayStyle(overlayStyle);
            return this;
        }

        @JsOverlay
        default Props repositionOnUpdate(boolean repositionOnUpdate) {
            setRepositionOnUpdate(repositionOnUpdate);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props title(String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props titleClassName(String titleClassName) {
            setTitleClassName(titleClassName);
            return this;
        }

        @JsOverlay
        default Props titleStyle(CSSProps titleStyle) {
            setTitleStyle(titleStyle);
            return this;
        }



    }
}