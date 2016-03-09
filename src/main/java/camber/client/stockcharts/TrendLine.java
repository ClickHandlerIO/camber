package camber.client.stockcharts;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.KeyboardEventHandler;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * used on charts
 */
public class TrendLine extends ExternalComponent<TrendLine.Props> {

    @Inject
    public TrendLine() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean snap;
//        boolean enabled;
//        String chartCanvasType;
//        Object chartData;
//        Object[] plotData;
//        Object interactive;
//        String currentPositionStroke;
//        double currentPositionStrokeWidth;
//        double currentPositionOpacity;
//        double currentPositionRadius;
//        String stroke;
//        double opacity;
//        Func.Run1<KeyboardEventHandler> shouldDisableSnap;
//        MouseEventHandler onClick;


        @JsProperty
        boolean isSnap();

        @JsProperty
        void setSnap(boolean snap);

        @JsProperty
        boolean isEnabled();

        @JsProperty
        void setEnabled(boolean enabled);

        @JsProperty
        String getChartCanvasType();

        @JsProperty
        void setChartCanvasType(String chartCanvasType);

        @JsProperty
        Object getChartData();

        @JsProperty
        void setChartData(Object chartData);

        @JsProperty
        Object[] getPlotData();

        @JsProperty
        void setPlotData(Object[] plotData);

        @JsProperty
        Object getInteractive();

        @JsProperty
        void setInteractive(Object interactive);

        @JsProperty
        String getCurrentPositionStroke();

        @JsProperty
        void setCurrentPositionStroke(String currentPositionStroke);

        @JsProperty
        double getCurrentPositionStrokeWidth();

        @JsProperty
        void setCurrentPositionStrokeWidth(double currentPositionStrokeWidth);

        @JsProperty
        double getCurrentPositionOpacity();

        @JsProperty
        void setCurrentPositionOpacity(double currentPositionOpacity);

        @JsProperty
        double getCurrentPositionRadius();

        @JsProperty
        void setCurrentPositionRadius(double currentPositionRadius);

        @JsProperty
        String getStroke();

        @JsProperty
        void setStroke(String stroke);

        @JsProperty
        double getOpacity();

        @JsProperty
        void setOpacity(double opacity);

        @JsProperty
        Func.Run1<KeyboardEventHandler> getShouldDisableSnap();

        @JsProperty
        void setShouldDisableSnap(Func.Run1<KeyboardEventHandler> shouldDisableSnap);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props snap(final boolean snap) {
            setSnap(snap);
            return this;
        }

        @JsOverlay
        default Props enabled(final boolean enabled) {
            setEnabled(enabled);
            return this;
        }

        @JsOverlay
        default Props chartCanvasType(final String chartCanvasType) {
            setChartCanvasType(chartCanvasType);
            return this;
        }

        @JsOverlay
        default Props chartData(final Object chartData) {
            setChartData(chartData);
            return this;
        }

        @JsOverlay
        default Props plotData(final Object[] plotData) {
            setPlotData(plotData);
            return this;
        }

        @JsOverlay
        default Props interactive(final Object interactive) {
            setInteractive(interactive);
            return this;
        }

        @JsOverlay
        default Props currentPositionStroke(final String currentPositionStroke) {
            setCurrentPositionStroke(currentPositionStroke);
            return this;
        }

        @JsOverlay
        default Props currentPositionStrokeWidth(final double currentPositionStrokeWidth) {
            setCurrentPositionStrokeWidth(currentPositionStrokeWidth);
            return this;
        }

        @JsOverlay
        default Props currentPositionOpacity(final double currentPositionOpacity) {
            setCurrentPositionOpacity(currentPositionOpacity);
            return this;
        }

        @JsOverlay
        default Props currentPositionRadius(final double currentPositionRadius) {
            setCurrentPositionRadius(currentPositionRadius);
            return this;
        }

        @JsOverlay
        default Props stroke(final String stroke) {
            setStroke(stroke);
            return this;
        }

        @JsOverlay
        default Props opacity(final double opacity) {
            setOpacity(opacity);
            return this;
        }

        @JsOverlay
        default Props shouldDisableSnap(final Func.Run1<KeyboardEventHandler> shouldDisableSnap) {
            setShouldDisableSnap(shouldDisableSnap);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
