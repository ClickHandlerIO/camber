package camber.client.materialUi;

import io.clickhandler.web.dom.CSSProps;
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
public class CircularProgress extends ExternalComponent<CircularProgress.Props> {

    @Inject
    public CircularProgress() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.MaterialUi.CircularProgress;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String color;
//        CSSProps innerStyle;
//        double max = 100; // only works in determinate mode
//        double min = 0; // only works in determinate mode
//        String mode = "indeterminate"; // enum 'determinate' 'indeterminate'(default)
//        double size = 1; // size of progress
//        CSSProps style;
//        double value = 0; // only works in determinate mode

        @JsProperty
        public String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        CSSProps getInnerStyle();

        @JsProperty
        void setInnerStyle(CSSProps innerStyle);

        @JsProperty
        double getMax();

        @JsProperty
        void setMax(double max);

        @JsProperty
        double getMin();

        @JsProperty
        void setMin(double min);

        @JsProperty
        String getMode();

        @JsProperty
        void setMode(String mode);

        @JsProperty
        double getSize();

        @JsProperty
        void setSize(double size);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);


        ///////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props innerStyle(final CSSProps innerStyle) {
            setInnerStyle(innerStyle);
            return this;
        }

        @JsOverlay
        default Props max(final double max) {
            setMax(max);
            return this;
        }

        @JsOverlay
        default Props min(final double min) {
            setMin(min);
            return this;
        }

        @JsOverlay
        default Props mode(final String mode) {
            setMode(mode);
            return this;
        }

        @JsOverlay
        default Props size(final double size) {
            setSize(size);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(final double value) {
            setValue(value);
            return this;
        }


    }
}
