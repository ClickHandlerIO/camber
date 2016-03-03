package camber.client.treeview;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * Created by admin on 3/1/16.
 */
public class TreeView extends ExternalComponent<TreeView.Props> {

    @Inject
    public TreeView() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.TreeView;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean collapsed;
//        boolean defaultCollapsed;
//        String nodeLabel;
//        String className;
//        String itemClassName;
//        MouseEventHandler onClick; // func

        @JsProperty
        boolean isCollapsed();

        @JsProperty
        void setCollapsed(boolean collapsed);

        @JsProperty
        boolean isDefaultCollapsed();

        @JsProperty
        void setDefaultCollapsed(boolean defaultCollapsed);

        @JsProperty
        String getNodeLabel();

        @JsProperty
        void setNodeLabel(String nodeLabel);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getItemClassName();

        @JsProperty
        void setItemClassName(String itemClassName);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props collapsed(final boolean collapsed) {
            setCollapsed(collapsed);
            return this;
        }

        @JsOverlay
        default Props defaultCollapsed(final boolean defaultCollapsed) {
            setDefaultCollapsed(defaultCollapsed);
            return this;
        }

        @JsOverlay
        default Props nodeLabel(final String nodeLabel) {
            setNodeLabel(nodeLabel);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props itemClassName(final String itemClassName) {
            setItemClassName(itemClassName);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
