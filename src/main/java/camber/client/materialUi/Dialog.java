package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ReactElement;
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

    @JsType
    public static class Props extends BaseProps {
       public ReactElement[] actions;
       public String actionsContainerClassName;
       public CSSProps actionsContainerStyle;
       public boolean autoDetectWindowHeight;
       public boolean autoScrollBodyContent;
       public String bodyClassName;
       public CSSProps bodyStyle;
       public String className;
       public String contentClassName;
       public CSSProps contentStyle;
       public boolean modal;
       public Func.Run1<Boolean> onRequestClose;
       public boolean open;
       public String overlayClassName;
       public CSSProps overlayStyle;
       public boolean repositionOnUpdate;
       public CSSProps style;
       public String title;
       public String titleClassName;
       public CSSProps titleStyle;

        @Inject
        public Props() {
        }
    }
}