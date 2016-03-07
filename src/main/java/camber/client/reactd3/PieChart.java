package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class PieChart {

    @Inject
    public PieChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        PieData[] data;
        String title;
        double radius;
        double innerRadius;
        double cx;
        double cy;
        double width;
        double height;
        String labelTextFill;
        String valueTextFill;
        boolean showInnerLabels;
        boolean showOuterLabels;
        String sectorBorderColor;
        boolean hoverAnimation;

        Func.Run colors;
        Func.Run2<Object, Object> colorAccessor;
        Func.Run1<Object> valueTextFormatter;
        MouseEventHandler onClick;
        



        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class PieData {
        String label;
        double value;

    }


}
