package camber.client.chartjs;

import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import java.lang.reflect.Array;

/**
 *  need to install regular chart.js for this to work, use: npm install chart.js
 */
public class ChartJs extends ExternalComponent<ChartJs.Props> {

    @Inject
    public ChartJs() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.ChartJs ;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String chartType; // not in main class, but adding because it is called in some js methods
//        boolean animation;
//        double animationSteps;
//        String animationEasing; // various possible values... as below
//        // easeInOutQuart, linear, easeOutBounce, easeInBack, easeInOutQuad, easeOutQuart, easeOutQuad, easeInOutBounce, easeOutSine, easeInOutCubic,
//        //  easeInExpo, easeInOutBack, easeInCirc, easeInOutElastic, easeOutBack, easeInQuad, easeInOutExpo, easeInQuart, easeOutQuint, easeInOutCirc,
//        //  easeInSine, easeOutExpo, easeOutCirc, easeOutCubic, easeInQuint, easeInElastic, easeInOutSine, easeInOutQuint, easeInBounce,
//        //  easeOutElastic, easeInCubic
//        boolean showScale;
//        boolean scaleOverride;
//        /* the following 3 are only required if the scale override is true */
//        double scaleSteps;
//        double scaleStepWidth;
//        double scaleStartValue;
//
//        /* remaining scale props */
//        String scaleLineColor; // ex "rgba(0,0,0,.1)"
//        double scaleLineWidth; // pixel width of scale line, defaults to 1.
//        boolean scaleShowLabels;
//        Object scaleLabel; // Interpolated JS string - can access value, ie, a string like "<%=value%>"
//        boolean scaleIntegersOnly; //  defaults to true. is whether scale should stick to integers and not floats
//        boolean scaleBeginAtZero;
//        String scaleFontFamily;
//        double scaleFontSize;
//        String scaleFontStyle; // Scale label font weight style - ie. normal
//        String scaleFontColor; // Scale label font color - ie - "#444"
//        boolean responsive;
//        boolean maintainAspectRatio; // default true, whether to maintain aspect ration when responsive. if set false will take up entire container
//
//        boolean showTooltips; // default true, determines whether to draw tooltips on the canvas or not
//        boolean customTooltips;
//
//        String[] tooltipEvents; // array of string names to attach tooltip events, default ["mousemove", "touchstart", "touchmove"]
//        String tooltipFillColor; // default "rgba(0,0,0,0.8)"
//        String tooltipFontFamily; // default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
//        double tooltipFontSize;
//        String tooltipFontStyle; // default "normal"
//        String tooltipFontColor; // default "#fff"
//
//        String tooltipTitleFontFamily; // default is full String "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
//        double tooltipTitleFontSize;
//        String tooltipTitleFontStyle; // default "bold"
//        String tooltipTitleFontColor; // default "#fff"
//
//        double tooltipYPadding;
//        double tooltipXPadding;
//        double tooltipCaretSize;
//        double tooltipCornerRadius; // default 6
//        double tooltipXOffset;
//
//        String tooltipTemplate; // default, complex,  "<%if (label){%><%=label%>: <%}%><%= value %>"
//        String multiTooltipTemplate; // default "<%= value %>", Template string for multiple tooltips
//
//        Func.Run onAnimationProgress;
//        Func.Run onAnimationComplete;
//        MouseEventHandler onClick;


        @JsProperty
        String getChartType();

        @JsProperty
        void setChartType(String chartType);

        @JsProperty
        boolean isAnimation();

        @JsProperty
        void setAnimation(boolean animation);

        @JsProperty
        double getAnimationSteps();

        @JsProperty
        void setAnimationSteps(double animationSteps);

        @JsProperty
        String getAnimationEasing();

        @JsProperty
        void setAnimationEasing(String animationEasing);

        @JsProperty
        boolean isShowScale();

        @JsProperty
        void setShowScale(boolean showScale);

        @JsProperty
        boolean isScaleOverride();

        @JsProperty
        void setScaleOverride(boolean scaleOverride);

        @JsProperty
        double getScaleSteps();

        @JsProperty
        void setScaleSteps(double scaleSteps);

        @JsProperty
        double getScaleStepWidth();

        @JsProperty
        void setScaleStepWidth(double scaleStepWidth);

        @JsProperty
        double getScaleStartValue();

        @JsProperty
        void setScaleStartValue(double scaleStartValue);

        @JsProperty
        String getScaleLineColor();

        @JsProperty
        void setScaleLineColor(String scaleLineColor);

        @JsProperty
        double getScaleLineWidth();

        @JsProperty
        void setScaleLineWidth(double scaleLineWidth);

        @JsProperty
        boolean isScaleShowLabels();

        @JsProperty
        void setScaleShowLabels(boolean scaleShowLabels);

        @JsProperty
        Object getScaleLabel();

        @JsProperty
        void setScaleLabel(Object scaleLabel);

        @JsProperty
        boolean isScaleIntegersOnly();

        @JsProperty
        void setScaleIntegersOnly(boolean scaleIntegersOnly);

        @JsProperty
        boolean isScaleBeginAtZero();

        @JsProperty
        void setScaleBeginAtZero(boolean scaleBeginAtZero);

        @JsProperty
        String getScaleFontFamily();

        @JsProperty
        void setScaleFontFamily(String scaleFontFamily);

        @JsProperty
        double getScaleFontSize();

        @JsProperty
        void setScaleFontSize(double scaleFontSize);

        @JsProperty
        String getScaleFontStyle();

        @JsProperty
        void setScaleFontStyle(String scaleFontStyle);

        @JsProperty
        String getScaleFontColor();

        @JsProperty
        void setScaleFontColor(String scaleFontColor);

        @JsProperty
        boolean isResponsive();

        @JsProperty
        void setResponsive(boolean responsive);

        @JsProperty
        boolean isMaintainAspectRatio();

        @JsProperty
        void setMaintainAspectRatio(boolean maintainAspectRatio);

        @JsProperty
        boolean isShowTooltips();

        @JsProperty
        void setShowTooltips(boolean showTooltips);

        @JsProperty
        boolean isCustomTooltips();

        @JsProperty
        void setCustomTooltips(boolean customTooltips);

        @JsProperty
        String[] getTooltipEvents();

        @JsProperty
        void setTooltipEvents(String[] tooltipEvents);

        @JsProperty
        String getTooltipFillColor();

        @JsProperty
        void setTooltipFillColor(String tooltipFillColor);

        @JsProperty
        String getTooltipFontFamily();

        @JsProperty
        void setTooltipFontFamily(String tooltipFontFamily);

        @JsProperty
        double getTooltipFontSize();

        @JsProperty
        void setTooltipFontSize(double tooltipFontSize);

        @JsProperty
        String getTooltipFontStyle();

        @JsProperty
        void setTooltipFontStyle(String tooltipFontStyle);

        @JsProperty
        String getTooltipFontColor();

        @JsProperty
        void setTooltipFontColor(String tooltipFontColor);

        @JsProperty
        String getTooltipTitleFontFamily();

        @JsProperty
        void setTooltipTitleFontFamily(String tooltipTitleFontFamily);

        @JsProperty
        double getTooltipTitleFontSize();

        @JsProperty
        void setTooltipTitleFontSize(double tooltipTitleFontSize);

        @JsProperty
        String getTooltipTitleFontStyle();

        @JsProperty
        void setTooltipTitleFontStyle(String tooltipTitleFontStyle);

        @JsProperty
        String getTooltipTitleFontColor();

        @JsProperty
        void setTooltipTitleFontColor(String tooltipTitleFontColor);

        @JsProperty
        double getTooltipYPadding();

        @JsProperty
        void setTooltipYPadding(double tooltipYPadding);

        @JsProperty
        double getTooltipXPadding();

        @JsProperty
        void setTooltipXPadding(double tooltipXPadding);

        @JsProperty
        double getTooltipCaretSize();

        @JsProperty
        void setTooltipCaretSize(double tooltipCaretSize);

        @JsProperty
        double getTooltipCornerRadius();

        @JsProperty
        void setTooltipCornerRadius(double tooltipCornerRadius);

        @JsProperty
        double getTooltipXOffset();

        @JsProperty
        void setTooltipXOffset(double tooltipXOffset);

        @JsProperty
        String getTooltipTemplate();

        @JsProperty
        void setTooltipTemplate(String tooltipTemplate);

        @JsProperty
        String getMultiTooltipTemplate();

        @JsProperty
        void setMultiTooltipTemplate(String multiTooltipTemplate);

        @JsProperty
        Func.Run getOnAnimationProgress();

        @JsProperty
        void setOnAnimationProgress(Func.Run onAnimationProgress);

        @JsProperty
        Func.Run getOnAnimationComplete();

        @JsProperty
        void setOnAnimationComplete(Func.Run onAnimationComplete);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props chartType(final String chartType) {
            setChartType(chartType);
            return this;
        }

        @JsOverlay
        default Props animation(final boolean animation) {
            setAnimation(animation);
            return this;
        }

        @JsOverlay
        default Props animationSteps(final double animationSteps) {
            setAnimationSteps(animationSteps);
            return this;
        }

        @JsOverlay
        default Props animationEasing(final String animationEasing) {
            setAnimationEasing(animationEasing);
            return this;
        }

        @JsOverlay
        default Props showScale(final boolean showScale) {
            setShowScale(showScale);
            return this;
        }

        @JsOverlay
        default Props scaleOverride(final boolean scaleOverride) {
            setScaleOverride(scaleOverride);
            return this;
        }

        @JsOverlay
        default Props scaleSteps(final double scaleSteps) {
            setScaleSteps(scaleSteps);
            return this;
        }

        @JsOverlay
        default Props scaleStepWidth(final double scaleStepWidth) {
            setScaleStepWidth(scaleStepWidth);
            return this;
        }

        @JsOverlay
        default Props scaleStartValue(final double scaleStartValue) {
            setScaleStartValue(scaleStartValue);
            return this;
        }

        @JsOverlay
        default Props scaleLineColor(final String scaleLineColor) {
            setScaleLineColor(scaleLineColor);
            return this;
        }

        @JsOverlay
        default Props scaleLineWidth(final double scaleLineWidth) {
            setScaleLineWidth(scaleLineWidth);
            return this;
        }

        @JsOverlay
        default Props scaleShowLabels(final boolean scaleShowLabels) {
            setScaleShowLabels(scaleShowLabels);
            return this;
        }

        @JsOverlay
        default Props scaleLabel(final Object scaleLabel) {
            setScaleLabel(scaleLabel);
            return this;
        }

        @JsOverlay
        default Props scaleIntegersOnly(final boolean scaleIntegersOnly) {
            setScaleIntegersOnly(scaleIntegersOnly);
            return this;
        }

        @JsOverlay
        default Props scaleBeginAtZero(final boolean scaleBeginAtZero) {
            setScaleBeginAtZero(scaleBeginAtZero);
            return this;
        }

        @JsOverlay
        default Props scaleFontFamily(final String scaleFontFamily) {
            setScaleFontFamily(scaleFontFamily);
            return this;
        }

        @JsOverlay
        default Props scaleFontSize(final double scaleFontSize) {
            setScaleFontSize(scaleFontSize);
            return this;
        }

        @JsOverlay
        default Props scaleFontStyle(final String scaleFontStyle) {
            setScaleFontStyle(scaleFontStyle);
            return this;
        }

        @JsOverlay
        default Props scaleFontColor(final String scaleFontColor) {
            setScaleFontColor(scaleFontColor);
            return this;
        }

        @JsOverlay
        default Props responsive(final boolean responsive) {
            setResponsive(responsive);
            return this;
        }

        @JsOverlay
        default Props maintainAspectRatio(final boolean maintainAspectRatio) {
            setMaintainAspectRatio(maintainAspectRatio);
            return this;
        }

        @JsOverlay
        default Props showTooltips(final boolean showTooltips) {
            setShowTooltips(showTooltips);
            return this;
        }

        @JsOverlay
        default Props customTooltips(final boolean customTooltips) {
            setCustomTooltips(customTooltips);
            return this;
        }

        @JsOverlay
        default Props tooltipEvents(final String[] tooltipEvents) {
            setTooltipEvents(tooltipEvents);
            return this;
        }

        @JsOverlay
        default Props tooltipFillColor(final String tooltipFillColor) {
            setTooltipFillColor(tooltipFillColor);
            return this;
        }

        @JsOverlay
        default Props tooltipFontFamily(final String tooltipFontFamily) {
            setTooltipFontFamily(tooltipFontFamily);
            return this;
        }

        @JsOverlay
        default Props tooltipFontSize(final double tooltipFontSize) {
            setTooltipFontSize(tooltipFontSize);
            return this;
        }

        @JsOverlay
        default Props tooltipFontStyle(final String tooltipFontStyle) {
            setTooltipFontStyle(tooltipFontStyle);
            return this;
        }

        @JsOverlay
        default Props tooltipFontColor(final String tooltipFontColor) {
            setTooltipFontColor(tooltipFontColor);
            return this;
        }

        @JsOverlay
        default Props tooltipTitleFontFamily(final String tooltipTitleFontFamily) {
            setTooltipTitleFontFamily(tooltipTitleFontFamily);
            return this;
        }

        @JsOverlay
        default Props tooltipTitleFontSize(final double tooltipTitleFontSize) {
            setTooltipTitleFontSize(tooltipTitleFontSize);
            return this;
        }

        @JsOverlay
        default Props tooltipTitleFontStyle(final String tooltipTitleFontStyle) {
            setTooltipTitleFontStyle(tooltipTitleFontStyle);
            return this;
        }

        @JsOverlay
        default Props tooltipTitleFontColor(final String tooltipTitleFontColor) {
            setTooltipTitleFontColor(tooltipTitleFontColor);
            return this;
        }

        @JsOverlay
        default Props tooltipYPadding(final double tooltipYPadding) {
            setTooltipYPadding(tooltipYPadding);
            return this;
        }

        @JsOverlay
        default Props tooltipXPadding(final double tooltipXPadding) {
            setTooltipXPadding(tooltipXPadding);
            return this;
        }

        @JsOverlay
        default Props tooltipCaretSize(final double tooltipCaretSize) {
            setTooltipCaretSize(tooltipCaretSize);
            return this;
        }

        @JsOverlay
        default Props tooltipCornerRadius(final double tooltipCornerRadius) {
            setTooltipCornerRadius(tooltipCornerRadius);
            return this;
        }

        @JsOverlay
        default Props tooltipXOffset(final double tooltipXOffset) {
            setTooltipXOffset(tooltipXOffset);
            return this;
        }

        @JsOverlay
        default Props tooltipTemplate(final String tooltipTemplate) {
            setTooltipTemplate(tooltipTemplate);
            return this;
        }

        @JsOverlay
        default Props multiTooltipTemplate(final String multiTooltipTemplate) {
            setMultiTooltipTemplate(multiTooltipTemplate);
            return this;
        }

        @JsOverlay
        default Props onAnimationProgress(final Func.Run onAnimationProgress) {
            setOnAnimationProgress(onAnimationProgress);
            return this;
        }

        @JsOverlay
        default Props onAnimationComplete(final Func.Run onAnimationComplete) {
            setOnAnimationComplete(onAnimationComplete);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
