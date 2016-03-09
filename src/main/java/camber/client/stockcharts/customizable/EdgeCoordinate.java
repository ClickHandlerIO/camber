package camber.client.stockcharts.customizable;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class EdgeCoordinate extends ExternalComponent<EdgeCoordinate.Props> {

    @Inject
    public EdgeCoordinate() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        String namespace;
//        String type; // vertical, horizontal
//        Object coordinate;
//        double x1;
//        double y1;
//        double x2;
//        double y2;
//        String orient; // top, bottom, left, right
//        double rectWidth;
//        boolean hideLine;
//        String fill;
//        String textFill;
//        String lineStroke;
//        double lineOpacity;
//        double opacity;
//        String fontFamily;
//        double fontSize;

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getNamespace();

        @JsProperty
        void setNamespace(String namespace);

        @JsProperty
        String getType();

        @JsProperty
        void setType(String type);

        @JsProperty
        Object getCoordinate();

        @JsProperty
        void setCoordinate(Object coordinate);

        @JsProperty
        double getX1();

        @JsProperty
        void setX1(double x1);

        @JsProperty
        double getY1();

        @JsProperty
        void setY1(double y1);

        @JsProperty
        double getX2();

        @JsProperty
        void setX2(double x2);

        @JsProperty
        double getY2();

        @JsProperty
        void setY2(double y2);

        @JsProperty
        String getOrient();

        @JsProperty
        void setOrient(String orient);

        @JsProperty
        double getRectWidth();

        @JsProperty
        void setRectWidth(double rectWidth);

        @JsProperty
        boolean isHideLine();

        @JsProperty
        void setHideLine(boolean hideLine);

        @JsProperty
        String getFill();

        @JsProperty
        void setFill(String fill);

        @JsProperty
        String getTextFill();

        @JsProperty
        void setTextFill(String textFill);

        @JsProperty
        String getLineStroke();

        @JsProperty
        void setLineStroke(String lineStroke);

        @JsProperty
        double getLineOpacity();

        @JsProperty
        void setLineOpacity(double lineOpacity);

        @JsProperty
        double getOpacity();

        @JsProperty
        void setOpacity(double opacity);

        @JsProperty
        String getFontFamily();

        @JsProperty
        void setFontFamily(String fontFamily);

        @JsProperty
        double getFontSize();

        @JsProperty
        void setFontSize(double fontSize);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props namespace(final String namespace) {
            setNamespace(namespace);
            return this;
        }

        @JsOverlay
        default Props type(final String type) {
            setType(type);
            return this;
        }

        @JsOverlay
        default Props coordinate(final Object coordinate) {
            setCoordinate(coordinate);
            return this;
        }

        @JsOverlay
        default Props x1(final double x1) {
            setX1(x1);
            return this;
        }

        @JsOverlay
        default Props y1(final double y1) {
            setY1(y1);
            return this;
        }

        @JsOverlay
        default Props x2(final double x2) {
            setX2(x2);
            return this;
        }

        @JsOverlay
        default Props y2(final double y2) {
            setY2(y2);
            return this;
        }

        @JsOverlay
        default Props orient(final String orient) {
            setOrient(orient);
            return this;
        }

        @JsOverlay
        default Props rectWidth(final double rectWidth) {
            setRectWidth(rectWidth);
            return this;
        }

        @JsOverlay
        default Props hideLine(final boolean hideLine) {
            setHideLine(hideLine);
            return this;
        }

        @JsOverlay
        default Props fill(final String fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props textFill(final String textFill) {
            setTextFill(textFill);
            return this;
        }

        @JsOverlay
        default Props lineStroke(final String lineStroke) {
            setLineStroke(lineStroke);
            return this;
        }

        @JsOverlay
        default Props lineOpacity(final double lineOpacity) {
            setLineOpacity(lineOpacity);
            return this;
        }

        @JsOverlay
        default Props opacity(final double opacity) {
            setOpacity(opacity);
            return this;
        }

        @JsOverlay
        default Props fontFamily(final String fontFamily) {
            setFontFamily(fontFamily);
            return this;
        }

        @JsOverlay
        default Props fontSize(final double fontSize) {
            setFontSize(fontSize);
            return this;
        }

    }



}
