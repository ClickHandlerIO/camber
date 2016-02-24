package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
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
    }
}