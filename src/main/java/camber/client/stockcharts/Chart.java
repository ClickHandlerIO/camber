package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * base chart for some charts
 */
public class Chart extends ExternalComponent<Chart.Props> {

    @Inject
    public Chart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        double id;
//        String transformDataAs; // appears needed if a transformer is applied to the chart
//        double height;
//        double width;
//        boolean xDomainUpdate;
//        boolean yDomainUpdate;
//        String yMousePointerDisplayLocation;
//        Object padding;
//        Object origin; // can be array or func, defaults as 2 item double array for coordinates, but can be function
//
//        Func.Run xScale;
//        Func.Run yScale;
//        Func.Run yMousePointerDisplayFormat;
//        MouseEventHandler onClick;


        @JsProperty
        double getId();

        @JsProperty
        void setId(double id);

        @JsProperty
        String getTransformDataAs();

        @JsProperty
        void setTransformDataAs(String transformDataAs);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        boolean isxDomainUpdate();

        @JsProperty
        void setxDomainUpdate(boolean xDomainUpdate);

        @JsProperty
        boolean isyDomainUpdate();

        @JsProperty
        void setyDomainUpdate(boolean yDomainUpdate);

        @JsProperty
        String getyMousePointerDisplayLocation();

        @JsProperty
        void setyMousePointerDisplayLocation(String yMousePointerDisplayLocation);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        Object getOrigin();

        @JsProperty
        void setOrigin(Object origin);

        @JsProperty
        Func.Run getxScale();

        @JsProperty
        void setxScale(Func.Run xScale);

        @JsProperty
        Func.Run getyScale();

        @JsProperty
        void setyScale(Func.Run yScale);

        @JsProperty
        Func.Run getyMousePointerDisplayFormat();

        @JsProperty
        void setyMousePointerDisplayFormat(Func.Run yMousePointerDisplayFormat);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props id(final double id) {
            setId(id);
            return this;
        }

        @JsOverlay
        default Props transformDataAs(final String transformDataAs) {
            setTransformDataAs(transformDataAs);
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
        default Props xDomainUpdate(final boolean xDomainUpdate) {
            setxDomainUpdate(xDomainUpdate);
            return this;
        }

        @JsOverlay
        default Props yDomainUpdate(final boolean yDomainUpdate) {
            setyDomainUpdate(yDomainUpdate);
            return this;
        }

        @JsOverlay
        default Props yMousePointerDisplayLocation(final String yMousePointerDisplayLocation) {
            setyMousePointerDisplayLocation(yMousePointerDisplayLocation);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props origin(final Object origin) {
            setOrigin(origin);
            return this;
        }

        @JsOverlay
        default Props xScale(final Func.Run xScale) {
            setxScale(xScale);
            return this;
        }

        @JsOverlay
        default Props yScale(final Func.Run yScale) {
            setyScale(yScale);
            return this;
        }

        @JsOverlay
        default Props yMousePointerDisplayFormat(final Func.Run yMousePointerDisplayFormat) {
            setyMousePointerDisplayFormat(yMousePointerDisplayFormat);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
