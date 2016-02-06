package materialUiGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface MaterialUiBundle extends ClientBundle {
    MaterialUiBundle INSTANCE = GWT.create(MaterialUiBundle.class);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // JS Resources
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @Source("materialUiLib/app-bar.js")
    TextResource appBar();

    @Source("materialUiLib/app-canvas.js")
    TextResource appCanvas();

    @Source("materialUiLib/auto-complete.js")
    TextResource autoComplete();

    @Source("materialUiLib/left-nav.js")
    TextResource leftNav();

    @Source("materialUiLib/raised-button.js")
    TextResource raisedButton();
}
