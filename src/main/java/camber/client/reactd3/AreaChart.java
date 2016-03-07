package camber.client.reactd3;


import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class AreaChart {

    @Inject
    public AreaChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        String className;
        AreaData[] data;
        String width;
        String height;
        ViewBoxObject viewBoxObject;
        String title;
        Object xAxisTickInterval; // can have string unit; double: interval
        String yAxisTickCounty;
        boolean interpolate;
        Object interpolationType;
        boolean hoverAnimation;
        Object margins; // can be created as another interface in here if needed

        MouseEventHandler onClick;




        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class AreaData {
        String name;
        Values[] values;

    }

    @JsType(isNative = true)
    public class Values {
        Object x; // can be different things like string or date
        double y;
    }

    @JsType(isNative = true)
    public class ViewBoxObject {
        double x;
        double y;
        double width;
        double height;

    }


}
