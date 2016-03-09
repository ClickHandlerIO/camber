package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class CrossHair extends ExternalComponent<CrossHair.Props> {

    @Inject
    public CrossHair() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String namespace;
//        double yAxisPad;
//        double height;
//        double width;
//        Object[] mouseXY;
//        String xDisplayValue;
//        Object[] edges;


        @JsProperty
        String getNamespace();

        @JsProperty
        void setNamespace(String namespace);

        @JsProperty
        double getyAxisPad();

        @JsProperty
        void setyAxisPad(double yAxisPad);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        Object[] getMouseXY();

        @JsProperty
        void setMouseXY(Object[] mouseXY);

        @JsProperty
        String getxDisplayValue();

        @JsProperty
        void setxDisplayValue(String xDisplayValue);

        @JsProperty
        Object[] getEdges();

        @JsProperty
        void setEdges(Object[] edges);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props namespace(final String namespace) {
            setNamespace(namespace);
            return this;
        }

        @JsOverlay
        default Props yAxisPad(final double yAxisPad) {
            setyAxisPad(yAxisPad);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props mouseXY(final Object[] mouseXY) {
            setMouseXY(mouseXY);
            return this;
        }

        @JsOverlay
        default Props xDisplayValue(final String xDisplayValue) {
            setxDisplayValue(xDisplayValue);
            return this;
        }

        @JsOverlay
        default Props edges(final Object[] edges) {
            setEdges(edges);
            return this;
        }


    }
}
