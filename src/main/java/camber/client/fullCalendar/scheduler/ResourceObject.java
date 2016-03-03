package camber.client.fullCalendar.scheduler;

import jsinterop.annotations.JsType;

@JsType
public class ResourceObject {
    String id; // EventObjects with a corresponding resourceId field will be linked to this event.
    String eventColor;
    String eventBackgroundColor;
    String eventBorderColor;
    String eventTextColor;
    String eventClassName;
    String parentId;


}
