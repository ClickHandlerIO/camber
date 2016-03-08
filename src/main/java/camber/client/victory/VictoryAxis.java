package camber.client.victory;

import io.clickhandler.web.dom.CSSProps;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
/**
 * these libraries are in alpha and may be updated soon
 */
public class VictoryAxis extends ExternalComponent<VictoryAxis.Props> {

    @Inject
    public VictoryAxis() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.TextAreaAutosize;
    }-*/;

    @JsType(isNative = true)
    public class Props extends BaseProps {

        boolean crossAxis;
        boolean dependentAxis;
        double[] domain; // a 2 element array with the min and max expected values for your axis
        double height;
        double width;
        Object label; // can be a string or label component
        double labelPadding;
        double offsetX;
        double offsetY;
        String orientation; // one of 'top' 'bottom' 'left' 'right'
        Object padding; // can be a double or an object with top: left: etc. double values
        String scale; // can be something else but don't use it that way

        boolean standalone; // use false here to make them composable, ie. have an x and y axis
        double tickCount;
        String[] tickFormat;
        Object[] tickValues; // strings or numbers
        Object animate;
        Object style;

        // todo - handle style, it's more complex here
        /*
        from js code
         style: _react.PropTypes.shape({
        parent: _react.PropTypes.object,
        axis: _react.PropTypes.object,
        axisLabel: _react.PropTypes.object,
        grid: _react.PropTypes.object,
        ticks: _react.PropTypes.object,
        tickLabels: _react.PropTypes.object

        sample style
        style={{
          axis: {stroke: "black"},
          grid: {strokeWidth: 2},
          ticks: {stroke: "red"},
          tickLabels: {fontSize: 12},
          axisLabels: {fontsize: 16}
        }}
         */


    }
}
