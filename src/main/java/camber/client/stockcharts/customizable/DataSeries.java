package camber.client.stockcharts.customizable;

import io.clickhandler.web.Func;
import io.clickhandler.web.react.BaseProps;
import io.clickhandler.web.react.ExternalComponent;
import io.clickhandler.web.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 *   Component can be customized in most graphs
 */
public class DataSeries extends ExternalComponent<DataSeries.Props> {

    @Inject
    public DataSeries() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.Camber.StockCharts;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String namespace;
//        String stroke;
//        String fill;
//        Object options;
//        Func.Run indicator;
//        Func.Run yAccessor;
//        Func.Run1<Object> compareBase;


        @JsProperty
        String getNamespace();

        @JsProperty
        void setNamespace(String namespace);

        @JsProperty
        String getStroke();

        @JsProperty
        void setStroke(String stroke);

        @JsProperty
        String getFill();

        @JsProperty
        void setFill(String fill);

        @JsProperty
        Object getOptions();

        @JsProperty
        void setOptions(Object options);

        @JsProperty
        Func.Run getIndicator();

        @JsProperty
        void setIndicator(Func.Run indicator);

        @JsProperty
        Func.Run getyAccessor();

        @JsProperty
        void setyAccessor(Func.Run yAccessor);

        @JsProperty
        Func.Run1<Object> getCompareBase();

        @JsProperty
        void setCompareBase(Func.Run1<Object> compareBase);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props namespace(final String namespace) {
            setNamespace(namespace);
            return this;
        }

        @JsOverlay
        default Props stroke(final String stroke) {
            setStroke(stroke);
            return this;
        }

        @JsOverlay
        default Props fill(final String fill) {
            setFill(fill);
            return this;
        }

        @JsOverlay
        default Props options(final Object options) {
            setOptions(options);
            return this;
        }

        @JsOverlay
        default Props indicator(final Func.Run indicator) {
            setIndicator(indicator);
            return this;
        }

        @JsOverlay
        default Props yAccessor(final Func.Run yAccessor) {
            setyAccessor(yAccessor);
            return this;
        }

        @JsOverlay
        default Props compareBase(final Func.Run1<Object> compareBase) {
            setCompareBase(compareBase);
            return this;
        }


    }
}
