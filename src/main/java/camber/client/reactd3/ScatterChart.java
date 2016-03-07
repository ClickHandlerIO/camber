package camber.client.reactd3;


import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class ScatterChart {

    @Inject
    public ScatterChart() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        Object legend; // usually a string, assuming like legend Template in chartjs, sometimes boolean
        String className;
        double circleRadius;
        ScatterData[] data;
        String width;
        String height;
        String title;
        double xAxisStrokeWidth;
        double yAxisStrokeWidth;
        String xAxisClassName;
        String yAxisClassName;
        boolean hoverAnimation;
        Object margins; // use an object for margins, can be created as another interface in here if needed

        MouseEventHandler onClick;




        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class ScatterData {
        String name;
        Values[] values;

    }

    @JsType(isNative = true)
    public class Values {
        double x;
        double y;

    }



}
