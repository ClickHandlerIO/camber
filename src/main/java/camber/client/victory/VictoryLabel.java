package camber.client.victory;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * this is an enhanced label, can be part of another chart
 */
public class VictoryLabel extends ExternalComponent<VictoryLabel.Props> {

    @Inject
    public VictoryLabel() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryLabel;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        Object capHeight;
//        Object data;
//        double lineHeight;
//        Object style;
//        Object textAnchor;
//        Object verticalAnchor;
//        Object transform;
//        double x;
//        double y;
//        Object dx;
//        Object dy;

        @JsProperty
        Object getCapHeight();

        @JsProperty
        void setCapHeight(Object capHeight);

        @JsProperty
        Object getData();

        @JsProperty
        void setData(Object data);

        @JsProperty
        double getLineHeight();

        @JsProperty
        void setLineHeight(double lineHeight);

        @JsProperty
        Object getStyle();

        @JsProperty
        void setStyle(Object style);

        @JsProperty
        Object getTextAnchor();

        @JsProperty
        void setTextAnchor(Object textAnchor);

        @JsProperty
        Object getVerticalAnchor();

        @JsProperty
        void setVerticalAnchor(Object verticalAnchor);

        @JsProperty
        Object getTransform();

        @JsProperty
        void setTransform(Object transform);

        @JsProperty
        double getX();

        @JsProperty
        void setX(double x);

        @JsProperty
        double getY();

        @JsProperty
        void setY(double y);

        @JsProperty
        Object getDx();

        @JsProperty
        void setDx(Object dx);

        @JsProperty
        Object getDy();

        @JsProperty
        void setDy(Object dy);



        ////////////////////
        // fluent setters
        ////////////////////


        @JsOverlay
        default Props capHeight(final Object capHeight) {
            setCapHeight(capHeight);
            return this;
        }

        @JsOverlay
        default Props data(final Object data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props lineHeight(final double lineHeight) {
            setLineHeight(lineHeight);
            return this;
        }

        @JsOverlay
        default Props style(final Object style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props textAnchor(final Object textAnchor) {
            setTextAnchor(textAnchor);
            return this;
        }

        @JsOverlay
        default Props verticalAnchor(final Object verticalAnchor) {
            setVerticalAnchor(verticalAnchor);
            return this;
        }

        @JsOverlay
        default Props transform(final Object transform) {
            setTransform(transform);
            return this;
        }

        @JsOverlay
        default Props x(final double x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default Props y(final double y) {
            setY(y);
            return this;
        }

        @JsOverlay
        default Props dx(final Object dx) {
            setDx(dx);
            return this;
        }

        @JsOverlay
        default Props dy(final Object dy) {
            setDy(dy);
            return this;
        }


    }
}
