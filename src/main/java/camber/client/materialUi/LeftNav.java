package camber.client.materialUi;

import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.Func;
import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LeftNav extends ExternalComponent<LeftNav.Props> {

    @Inject
    public LeftNav() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.LeftNav;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isDisableSwipeToOpen();

        @JsProperty
        void setDisableSwipeToOpen(boolean disableSwipeToOpen);

        @JsProperty
        boolean isDocked();

        @JsProperty
        void setDocked(boolean docked);

        @JsProperty
        Boolean getOpen();

        @JsProperty
        void setOpen(Boolean open);

        @JsProperty
        boolean isOpenRight();

        @JsProperty
        void setOpenRight(boolean openRight);

        @JsProperty
        String getOverlayClassName();

        @JsProperty
        void setOverlayClassName(String overlayClassName);

        @JsProperty
        Object getOverlayStyle();

        @JsProperty
        void setOverlayStyle(Object overlayStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        double getSwipeAreaWidth();

        @JsProperty
        void setSwipeAreaWidth(double swipeAreaWidth);

        @JsProperty
        Double getWidth();

        @JsProperty
        void setWidth(Double width);

        @JsProperty
        Func.Run2<Boolean, Object> getOnRequestChange();

        @JsProperty
        void setOnRequestChange(Func.Run2<Boolean, Object> onRequestChange);
    }
}
