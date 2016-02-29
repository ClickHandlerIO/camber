package camber.client.chartjs;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
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
    public static class Props {
        String chartType;
        boolean animation;
        double animationSteps;
        String animationEasing; // various possible values... as below
        // easeInOutQuart, linear, easeOutBounce, easeInBack, easeInOutQuad, easeOutQuart, easeOutQuad, easeInOutBounce, easeOutSine, easeInOutCubic,
        //  easeInExpo, easeInOutBack, easeInCirc, easeInOutElastic, easeOutBack, easeInQuad, easeInOutExpo, easeInQuart, easeOutQuint, easeInOutCirc,
        //  easeInSine, easeOutExpo, easeOutCirc, easeOutCubic, easeInQuint, easeInElastic, easeInOutSine, easeInOutQuint, easeInBounce,
        //  easeOutElastic, easeInCubic
        boolean showScale;
        boolean scaleOverride;
        /* the following 3 are only required if the scale override is true */
        double scaleSteps;
        double scaleStepWidth;
        double scaleStartValue;

        String scaleLineColor; // ex "rgba(0,0,0,.1)"
        double scaleLineWidth; // pixel width of scale line, defaults to 1.
        boolean scaleShowLabels;
        Object scaleLabel; // Interpolated JS string - can access value, ie, a string like "<%=value%>"
        boolean scaleIntegersOnly; //  defaults to true. is whether scale should stick to integers and not floats
        boolean scaleBeginAtZero;
        String scaleFontFamily;
        double scaleFontSize;
        String scaleFontStyle; // Scale label font weight style - ie. normal
        String scaleFontColor; // Scale label font color - ie - "#444"
        boolean responsive;
        boolean maintainAspectRatio; // default true, whether to maintain aspect ration when responsive. if set false will take up entire container

        boolean showTooltips; // default true, determines whether to draw tooltips on the canvas or not
        boolean customTooltips;
        String[] tooltipEvents; // array of string names to attach tooltip events, default ["mousemove", "touchstart", "touchmove"]
        String tooltipFillColor; // default "rgba(0,0,0,0.8)"
        String tooltipFontFamily; // default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
        double tooltipFontSize;
        String tooltipFontStyle; // default "normal"
        String tooltipFontColor; // default "#fff"

        String tooltipTitleFontFamily; // default is full String "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
        double tooltipTitleFontSize;
        String tooltipTitleFontStyle; // default "bold"
        String tooltipTitleFontColor; // default "#fff"

        double tooltipYPadding;
        double tooltipXPadding;
        double tooltipCaretSize;
        double tooltipCornerRadius; // default 6
        double tooltipXOffset;

        String tooltipTemplate; // default, complex,  "<%if (label){%><%=label%>: <%}%><%= value %>"
        String multiTooltipTemplate; // default "<%= value %>", Template string for multiple tooltips

        Func.Run onAnimationProgress;
        Func.Run onAnimationComplete;







    }
}
