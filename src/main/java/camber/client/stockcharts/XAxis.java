package camber.client.stockcharts;

import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * used by charts for their x axis
 */
public class XAxis extends ExternalComponent<XAxis.Props> {

    @Inject
    public XAxis() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String axisAt; // top, middle, bottom
//        String orient; // top, bottom
//        Object range;
//        double ticks;
//        double innerTickSize;
//        double outerTickSize;
//        Object tickFormat;
//        Object tickPadding;
//        Object tickSize;
//        Object[] tickValues;


        @JsProperty
        String getAxisAt();

        @JsProperty
        void setAxisAt(String axisAt);

        @JsProperty
        String getOrient();

        @JsProperty
        void setOrient(String orient);

        @JsProperty
        Object getRange();

        @JsProperty
        void setRange(Object range);

        @JsProperty
        double getTicks();

        @JsProperty
        void setTicks(double ticks);

        @JsProperty
        double getInnerTickSize();

        @JsProperty
        void setInnerTickSize(double innerTickSize);

        @JsProperty
        double getOuterTickSize();

        @JsProperty
        void setOuterTickSize(double outerTickSize);

        @JsProperty
        Object getTickFormat();

        @JsProperty
        void setTickFormat(Object tickFormat);

        @JsProperty
        Object getTickPadding();

        @JsProperty
        void setTickPadding(Object tickPadding);

        @JsProperty
        Object getTickSize();

        @JsProperty
        void setTickSize(Object tickSize);

        @JsProperty
        Object[] getTickValues();

        @JsProperty
        void setTickValues(Object[] tickValues);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props axisAt(final String axisAt) {
            setAxisAt(axisAt);
            return this;
        }

        @JsOverlay
        default Props orient(final String orient) {
            setOrient(orient);
            return this;
        }

        @JsOverlay
        default Props range(final Object range) {
            setRange(range);
            return this;
        }

        @JsOverlay
        default Props ticks(final double ticks) {
            setTicks(ticks);
            return this;
        }

        @JsOverlay
        default Props innerTickSize(final double innerTickSize) {
            setInnerTickSize(innerTickSize);
            return this;
        }

        @JsOverlay
        default Props outerTickSize(final double outerTickSize) {
            setOuterTickSize(outerTickSize);
            return this;
        }

        @JsOverlay
        default Props tickFormat(final Object tickFormat) {
            setTickFormat(tickFormat);
            return this;
        }

        @JsOverlay
        default Props tickPadding(final Object tickPadding) {
            setTickPadding(tickPadding);
            return this;
        }

        @JsOverlay
        default Props tickSize(final Object tickSize) {
            setTickSize(tickSize);
            return this;
        }

        @JsOverlay
        default Props tickValues(final Object[] tickValues) {
            setTickValues(tickValues);
            return this;
        }

    }
}
