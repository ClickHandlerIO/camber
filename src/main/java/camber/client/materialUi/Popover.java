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
import io.clickhandler.web.react.ReactElement;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class Popover extends ExternalComponent<Popover.Props> {

    @Inject
    public Popover() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.Popover;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        ReactElement anchorEl; // unlike most objects this shouldn't be a String, thiss is for the anchor element the popover belongs to
//        Origin anchorOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
//        Origin targetOrigin; // ? type = PropTypes.origin, default { vertical: 'top', horizontal: 'left', }
//        boolean animated = true;
//        boolean autoCloseWhenOffScreen = true;
//        boolean canAutoPosition = true;
//        String className;
//        boolean open;
//        CSSProps style; // ? default { overflowY: 'auto',}
//        boolean userLayerForClickAway;
//        double zDepth; // ? type = PropTypes.zDepth, default 1
//        Func.Run animation; // func
//        Func.Run onRequestClose; // func
//        MouseEventHandler onClick;


        @JsProperty
        ReactElement getAnchorEl();

        @JsProperty
        void setAnchorEl(ReactElement anchorEl);

        @JsProperty
        Origin getAnchorOrigin();

        @JsProperty
        void setAnchorOrigin(Origin anchorOrigin);

        @JsProperty
        Origin getTargetOrigin();

        @JsProperty
        void setTargetOrigin(Origin targetOrigin);

        @JsProperty
        boolean isAnimated();

        @JsProperty
        void setAnimated(boolean animated);

        @JsProperty
        boolean isAutoCloseWhenOffScreen();

        @JsProperty
        void setAutoCloseWhenOffScreen(boolean autoCloseWhenOffScreen);

        @JsProperty
        boolean isCanAutoPosition();

        @JsProperty
        void setCanAutoPosition(boolean canAutoPosition);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isOpen();

        @JsProperty
        void setOpen(boolean open);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        boolean isUserLayerForClickAway();

        @JsProperty
        void setUserLayerForClickAway(boolean userLayerForClickAway);

        @JsProperty
        double getzDepth();

        @JsProperty
        void setzDepth(double zDepth);

        @JsProperty
        Func.Run getAnimation();

        @JsProperty
        void setAnimation(Func.Run animation);

        @JsProperty
        Func.Run getOnRequestClose();

        @JsProperty
        void setOnRequestClose(Func.Run onRequestClose);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props anchorEl(final ReactElement anchorEl) {
            setAnchorEl(anchorEl);
            return this;
        }

        @JsOverlay
        default Props anchorOrigin(final Origin anchorOrigin) {
            setAnchorOrigin(anchorOrigin);
            return this;
        }

        @JsOverlay
        default Props targetOrigin(final Origin targetOrigin) {
            setTargetOrigin(targetOrigin);
            return this;
        }

        @JsOverlay
        default Props animated(final boolean animated) {
            setAnimated(animated);
            return this;
        }

        @JsOverlay
        default Props autoCloseWhenOffScreen(final boolean autoCloseWhenOffScreen) {
            setAutoCloseWhenOffScreen(autoCloseWhenOffScreen);
            return this;
        }

        @JsOverlay
        default Props canAutoPosition(final boolean canAutoPosition) {
            setCanAutoPosition(canAutoPosition);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props open(final boolean open) {
            setOpen(open);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props userLayerForClickAway(final boolean userLayerForClickAway) {
            setUserLayerForClickAway(userLayerForClickAway);
            return this;
        }

        @JsOverlay
        default Props zDepth(final double zDepth) {
            setzDepth(zDepth);
            return this;
        }

        @JsOverlay
        default Props animation(final Func.Run animation) {
            setAnimation(animation);
            return this;
        }

        @JsOverlay
        default Props onRequestClose(final Func.Run onRequestClose) {
            setOnRequestClose(onRequestClose);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }


    /**
     *
     */
    @JsType(isNative = true)
    public interface Origin {
        @JsProperty
        String getVertical();

        @JsProperty
        void setVertical(String vertical);

        @JsProperty
        String getHorizontal();

        @JsProperty
        void setHorizontal(String horizontal);

    }
}
