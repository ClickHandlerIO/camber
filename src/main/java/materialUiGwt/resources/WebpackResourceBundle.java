package materialUiGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface WebpackResourceBundle extends ClientBundle {
    WebpackResourceBundle INSTANCE = GWT.create(WebpackResourceBundle.class);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // JS Resources
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @Source("js/webpack-output.js")
    TextResource WebpackOutput();

    @Source("js/react-router.min.js")
    TextResource ReactRouter();
}
