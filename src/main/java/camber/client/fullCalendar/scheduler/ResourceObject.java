package camber.client.fullCalendar.scheduler;

import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

@JsType
public class ResourceObject {
    public String id; // EventObjects with a corresponding resourceId field will be linked to this event.
    public String eventColor;
    public String eventBackgroundColor;
    public String eventBorderColor;
    public String eventTextColor;
    public String eventClassName;
    public String parentId;

    // scheduler stuff
    public String resourceGroupField;
    public String resourceOrder;
    public Object resourceRender; // can be a function

    // only when resourceGroupField is specified
    Func.Run1<String> resourceGroupText; // specifies text displayed in resources group divider
    Func.Run1<ResourceObject> resourceText; // text displayed on each resource

}
