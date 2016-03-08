package camber.client.victory;

import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import io.clickhandler.web.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * these libraries are in alpha and may be updated soon
 */
public class VictoryBar extends ExternalComponent<VictoryBar.Props> {

    @Inject
    public VictoryBar() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.Victory.VictoryBar;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        VictoryAnimation animate;
//        Object[] data;
//        Object dataAttributes;
//        Object[] categories; // double or String array - like tick values
//        Object colorScale; // string, or array of css colors
//        Object domain; // object with a min and max, examples [-1, 1], {x: [0, 100], y: [0, 1]}
//        Object domainPadding;
//        boolean grouped;
//        boolean horizontal;
//        double height;
//        double width;
//        Object[] labels; // string or element
//        ReactElement labelComponent;
//        Object padding; // can be a double or an object with top: left: etc. double values
//        String scale; // can be something else but don't use it that way
//        boolean stacked;
//        boolean standalone;
//        Object x;
//        Object y;
//        // handle style a better way? is more complex here
//        Object style;
//
//        MouseEventHandler onClick;


        @JsProperty
        VictoryAnimation getAnimate();

        @JsProperty
        void setAnimate(VictoryAnimation animate);

        @JsProperty
        Object[] getData();

        @JsProperty
        void setData(Object[] data);

        @JsProperty
        Object getDataAttributes();

        @JsProperty
        void setDataAttributes(Object dataAttributes);

        @JsProperty
        Object[] getCategories();

        @JsProperty
        void setCategories(Object[] categories);

        @JsProperty
        Object getColorScale();

        @JsProperty
        void setColorScale(Object colorScale);

        @JsProperty
        Object getDomain();

        @JsProperty
        void setDomain(Object domain);

        @JsProperty
        Object getDomainPadding();

        @JsProperty
        void setDomainPadding(Object domainPadding);

        @JsProperty
        boolean isGrouped();

        @JsProperty
        void setGrouped(boolean grouped);

        @JsProperty
        boolean isHorizontal();

        @JsProperty
        void setHorizontal(boolean horizontal);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        Object[] getLabels();

        @JsProperty
        void setLabels(Object[] labels);

        @JsProperty
        ReactElement getLabelComponent();

        @JsProperty
        void setLabelComponent(ReactElement labelComponent);

        @JsProperty
        Object getPadding();

        @JsProperty
        void setPadding(Object padding);

        @JsProperty
        String getScale();

        @JsProperty
        void setScale(String scale);

        @JsProperty
        boolean isStacked();

        @JsProperty
        void setStacked(boolean stacked);

        @JsProperty
        boolean isStandalone();

        @JsProperty
        void setStandalone(boolean standalone);

        @JsProperty
        Object getX();

        @JsProperty
        void setX(Object x);

        @JsProperty
        Object getY();

        @JsProperty
        void setY(Object y);

        @JsProperty
        Object getStyle();

        @JsProperty
        void setStyle(Object style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props animate(final VictoryAnimation animate) {
            setAnimate(animate);
            return this;
        }

        @JsOverlay
        default Props data(final Object[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props dataAttributes(final Object dataAttributes) {
            setDataAttributes(dataAttributes);
            return this;
        }

        @JsOverlay
        default Props categories(final Object[] categories) {
            setCategories(categories);
            return this;
        }

        @JsOverlay
        default Props colorScale(final Object colorScale) {
            setColorScale(colorScale);
            return this;
        }

        @JsOverlay
        default Props domain(final Object domain) {
            setDomain(domain);
            return this;
        }

        @JsOverlay
        default Props domainPadding(final Object domainPadding) {
            setDomainPadding(domainPadding);
            return this;
        }

        @JsOverlay
        default Props grouped(final boolean grouped) {
            setGrouped(grouped);
            return this;
        }

        @JsOverlay
        default Props horizontal(final boolean horizontal) {
            setHorizontal(horizontal);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props labels(final Object[] labels) {
            setLabels(labels);
            return this;
        }

        @JsOverlay
        default Props labelComponent(final ReactElement labelComponent) {
            setLabelComponent(labelComponent);
            return this;
        }

        @JsOverlay
        default Props padding(final Object padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props scale(final String scale) {
            setScale(scale);
            return this;
        }

        @JsOverlay
        default Props stacked(final boolean stacked) {
            setStacked(stacked);
            return this;
        }

        @JsOverlay
        default Props standalone(final boolean standalone) {
            setStandalone(standalone);
            return this;
        }

        @JsOverlay
        default Props x(final Object x) {
            setX(x);
            return this;
        }

        @JsOverlay
        default Props y(final Object y) {
            setY(y);
            return this;
        }

        @JsOverlay
        default Props style(final Object style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
