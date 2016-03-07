package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class CandlestickChart {

    @Inject
    public CandlestickChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        String className;
        String xAxisClassName;
        String yAxisClassName;
        OhlcData[] data;
        Object width; // can be string or double
        double height;
        String title;
        Object xAxisTickInterval; // change to an interface in here?
        double[] xAxisTickValues;
        double[] yAxisTickValues;
        double yAxisTickCount;
        double yAxisOffset;
        boolean hoverAnimation;
        double legendOffset;
        Object margins; // use an object for margins, can be created as another interface in here if needed

        // internal functions
        Func.Run1<Object> fillUp;
        Func.Run2<Object, Object> fillUpAccessor;
        Func.Run fillDown;
        Func.Run2<Object, Object> fillDownAccessor;
        Func.Run xAccesor;
        Func.Run xAxisFormatter;
        Func.Run yAccesor;
        Func.Run yAxisFormatter;

        MouseEventHandler onClick;




        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class OhlcData {
        String name;
        Values[] values;

    }

    @JsType(isNative = true)
    public class Values {
        Object x; // can be different things like string or date
        double open;
        double close;
        double high;
        double low;

    }

//    @JsType(isNative = true)
//    public class XAxisTickInterval {
//        String unit;
//        double interval;
//
//    }



}
