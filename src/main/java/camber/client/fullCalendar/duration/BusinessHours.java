package camber.client.fullCalendar.duration;

import jsinterop.annotations.JsType;

/**
 *  likely to be removed as generic Object is currently in place for options
 */
@JsType
public class BusinessHours {
    String start;
    String end;
    double[] dow; // days of week as an array of ints from 0-6

}
