package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Treemap extends ExternalComponent<Treemap.Props> {

    @Inject
    public Treemap() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ReactD3.Treemap;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        TreemapData[] data;
//        String title;
//        Object fontSize; // can be String or double
//        String textColor;
//        double width;
//        double height;
//        boolean hoverAnimation;
//        Object margins; // can be created as another interface in here if needed
//
//        Func.Run colors;
//        Func.Run2<Object, Object> colorAccessor;
//        MouseEventHandler onClick;


        @JsProperty
        TreemapData[] getData();

        @JsProperty
        void setData(TreemapData[] data);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        Object getFontSize();

        @JsProperty
        void setFontSize(Object fontSize);

        @JsProperty
        String getTextColor();

        @JsProperty
        void setTextColor(String textColor);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        boolean isHoverAnimation();

        @JsProperty
        void setHoverAnimation(boolean hoverAnimation);

        @JsProperty
        Object getMargins();

        @JsProperty
        void setMargins(Object margins);

        @JsProperty
        Func.Run getColors();

        @JsProperty
        void setColors(Func.Run colors);

        @JsProperty
        Func.Run2<Object, Object> getColorAccessor();

        @JsProperty
        void setColorAccessor(Func.Run2<Object, Object> colorAccessor);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final TreemapData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props fontSize(final Object fontSize) {
            setFontSize(fontSize);
            return this;
        }

        @JsOverlay
        default Props textColor(final String textColor) {
            setTextColor(textColor);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props hoverAnimation(final boolean hoverAnimation) {
            setHoverAnimation(hoverAnimation);
            return this;
        }

        @JsOverlay
        default Props margins(final Object margins) {
            setMargins(margins);
            return this;
        }

        @JsOverlay
        default Props colors(final Func.Run colors) {
            setColors(colors);
            return this;
        }

        @JsOverlay
        default Props colorAccessor(final Func.Run2<Object, Object> colorAccessor) {
            setColorAccessor(colorAccessor);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }


    @JsType(isNative = true)
    public interface TreemapData {
//        String label;
//        double value;

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);

        @JsOverlay
        default TreemapData label(final String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default TreemapData value(final double value) {
            setValue(value);
            return this;
        }

    }


}
