package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class Treemap {

    @Inject
    public Treemap() {
    }



    @JsType(isNative = true)
    public class Props extends BaseProps {
        TreemapData[] data;
        String title;
        Object fontSize; // can be String or double
        String textColor;
        double width;
        double height;
        boolean hoverAnimation;
        Object margins; // can be created as another interface in here if needed

        Func.Run colors;
        Func.Run2<Object, Object> colorAccessor;
        MouseEventHandler onClick;
        



        ////////////////////
        // fluent setters
        ////////////////////



    }


    @JsType(isNative = true)
    public class TreemapData {
        String label;
        double value;

    }


}
