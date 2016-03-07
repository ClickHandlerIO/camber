package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class BarChart {

    @Inject
    public BarChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        String chartClassName;
        String xAxisClassName;
        String yAxisClassName;
        BarData[] data;
        String title;
        double yAxisTickCount;
        String yAxisLabel;
        String xAxisLabel;
        String stackOffset; // one of 4 values
        Object width; // string or double
        double height;
        double rangeRoundBandsPadding;
        Object margins; // can be created as another interface in here if needed
        String fill; // seems to be fill color

        Func.Run1<Object> valuesAccessor;
        MouseEventHandler onClick;




        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class BarData {
        String name;
        Values[] values;

    }

    @JsType(isNative = true)
    public class Values {
        double x;
        double y;
    }


}
