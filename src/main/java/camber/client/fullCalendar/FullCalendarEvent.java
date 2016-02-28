package camber.client.fullCalendar;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType
public class FullCalendarEvent {
    public String id;
    public String title;
    public boolean allDay;
    public String start;
    public String end;
    public String url;
    public String className;
    public boolean editable;
    public boolean startEditable;
    public boolean durationEditable;
    public String rendering;
    public boolean overlap;
    public Object constraint;
    public Object source; // automatically populated EventSource object
    public String color;
    public String backgroundColor;
    public String borderColor;
    public String textColor;

    @JsOverlay
    public FullCalendarEvent allDay(final boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent id(final String id) {
        this.id = id;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent title(final String title) {
        this.title = title;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent start(final String start) {
        this.start = start;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent end(final String end) {
        this.end = end;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent url(final String url) {
        this.url = url;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent className(final String className) {
        this.className = className;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent editable(final boolean editable) {
        this.editable = editable;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent startEditable(final boolean startEditable) {
        this.startEditable = startEditable;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent durationEditable(final boolean durationEditable) {
        this.durationEditable = durationEditable;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent rendering(final String rendering) {
        this.rendering = rendering;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent overlap(final boolean overlap) {
        this.overlap = overlap;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent constraint(final Object constraint) {
        this.constraint = constraint;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent source(final Object source) {
        this.source = source;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent color(final String color) {
        this.color = color;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent backgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    @JsOverlay
    public FullCalendarEvent textColor(final String textColor) {
        this.textColor = textColor;
        return this;
    }
}
