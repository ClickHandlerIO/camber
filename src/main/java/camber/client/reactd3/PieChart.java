package camber.client.reactd3;


import io.clickhandler.web.Func;
import io.clickhandler.web.event.MouseEventHandler;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PieChart extends ExternalComponent<PieChart.Props> {

    @Inject
    public PieChart() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.PieChart;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        PieData[] data;
//        String title;
//        double radius;
//        double innerRadius;
//        double cx;
//        double cy;
//        double width;
//        double height;
//        String labelTextFill;
//        String valueTextFill;
//        boolean showInnerLabels;
//        boolean showOuterLabels;
//        String sectorBorderColor;
//        boolean hoverAnimation;
//        Func.Run colors;
//        Func.Run2<Object, Object> colorAccessor;
//        Func.Run1<Object> valueTextFormatter;
//        MouseEventHandler onClick;


        @JsProperty
        PieData[] getData();

        @JsProperty
        void setData(PieData[] data);

        @JsProperty
        String getTitle();

        @JsProperty
        void setTitle(String title);

        @JsProperty
        double getRadius();

        @JsProperty
        void setRadius(double radius);

        @JsProperty
        double getInnerRadius();

        @JsProperty
        void setInnerRadius(double innerRadius);

        @JsProperty
        double getCx();

        @JsProperty
        void setCx(double cx);

        @JsProperty
        double getCy();

        @JsProperty
        void setCy(double cy);

        @JsProperty
        double getWidth();

        @JsProperty
        void setWidth(double width);

        @JsProperty
        double getHeight();

        @JsProperty
        void setHeight(double height);

        @JsProperty
        String getLabelTextFill();

        @JsProperty
        void setLabelTextFill(String labelTextFill);

        @JsProperty
        String getValueTextFill();

        @JsProperty
        void setValueTextFill(String valueTextFill);

        @JsProperty
        boolean isShowInnerLabels();

        @JsProperty
        void setShowInnerLabels(boolean showInnerLabels);

        @JsProperty
        boolean isShowOuterLabels();

        @JsProperty
        void setShowOuterLabels(boolean showOuterLabels);

        @JsProperty
        String getSectorBorderColor();

        @JsProperty
        void setSectorBorderColor(String sectorBorderColor);

        @JsProperty
        boolean isHoverAnimation();

        @JsProperty
        void setHoverAnimation(boolean hoverAnimation);

        @JsProperty
        Func.Run getColors();

        @JsProperty
        void setColors(Func.Run colors);

        @JsProperty
        Func.Run2<Object, Object> getColorAccessor();

        @JsProperty
        void setColorAccessor(Func.Run2<Object, Object> colorAccessor);

        @JsProperty
        Func.Run1<Object> getValueTextFormatter();

        @JsProperty
        void setValueTextFormatter(Func.Run1<Object> valueTextFormatter);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props data(final PieData[] data) {
            setData(data);
            return this;
        }

        @JsOverlay
        default Props title(final String title) {
            setTitle(title);
            return this;
        }

        @JsOverlay
        default Props radius(final double radius) {
            setRadius(radius);
            return this;
        }

        @JsOverlay
        default Props innerRadius(final double innerRadius) {
            setInnerRadius(innerRadius);
            return this;
        }

        @JsOverlay
        default Props cx(final double cx) {
            setCx(cx);
            return this;
        }

        @JsOverlay
        default Props cy(final double cy) {
            setCy(cy);
            return this;
        }

        @JsOverlay
        default Props width(final double width) {
            setWidth(width);
            return this;
        }

        @JsOverlay
        default Props height(final double height) {
            setHeight(height);
            return this;
        }

        @JsOverlay
        default Props labelTextFill(final String labelTextFill) {
            setLabelTextFill(labelTextFill);
            return this;
        }

        @JsOverlay
        default Props valueTextFill(final String valueTextFill) {
            setValueTextFill(valueTextFill);
            return this;
        }

        @JsOverlay
        default Props showInnerLabels(final boolean showInnerLabels) {
            setShowInnerLabels(showInnerLabels);
            return this;
        }

        @JsOverlay
        default Props showOuterLabels(final boolean showOuterLabels) {
            setShowOuterLabels(showOuterLabels);
            return this;
        }

        @JsOverlay
        default Props sectorBorderColor(final String sectorBorderColor) {
            setSectorBorderColor(sectorBorderColor);
            return this;
        }

        @JsOverlay
        default Props hoverAnimation(final boolean hoverAnimation) {
            setHoverAnimation(hoverAnimation);
            return this;
        }

        @JsOverlay
        default Props colors(final Func.Run colors) {
            setColors(colors);
            return this;
        }

        @JsOverlay
        default Props colorAccessor(final Func.Run2<Object, Object> colorAccessor) {
            setColorAccessor(colorAccessor);
            return this;
        }

        @JsOverlay
        default Props valueTextFormatter(final Func.Run1<Object> valueTextFormatter) {
            setValueTextFormatter(valueTextFormatter);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }


    @JsType(isNative = true)
    public interface PieData {
//        String label;
//        double value;

        @JsProperty
        String getLabel();

        @JsProperty
        void setLabel(String label);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);

        @JsOverlay
        default PieData label(final String label) {
            setLabel(label);
            return this;
        }

        @JsOverlay
        default PieData value(final double value) {
            setValue(value);
            return this;
        }


    }


}
