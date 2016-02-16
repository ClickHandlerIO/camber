package materialUiGwt.client.components;

import jsinterop.annotations.JsType;
import io.clickhandler.web.react.ReactElement;

public class Dialog {
    @JsType
    public static class Props {
        ReactElement actions; // node - this prop can be JSON object (depracated), a react element, or an array of react elements
        String actionsContainerClassName;
        String actionsContainerStyle; // ?
        boolean autoDetectWindowHeight = true;
        boolean autoScrollBodyContent;
        String bodyClassName;
        String bodyStyle; // ?
        String className;
        String contentClassName;
        String contentStyle; // ?
        boolean modal;
        boolean open;
        String overlayClassName;
        String overlayStyle; // ?
        boolean repositionOnUpdate = true;
        String style; // ?
        ReactElement title; // node
        String titleClassName;
        String titleStyle; // ?

        // functions
        Object onRequestClose; // func

        // deprecated
        String actionFocus;
        String width; // any

    }
}