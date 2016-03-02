package camber.client.fullCalendar.buttons;

import io.clickhandler.web.event.MouseEventHandler;
import jsinterop.annotations.JsType;

@JsType
public class CustomButtons {
    public String text;
    public MouseEventHandler click;
    ButtonIcons icon;
    ThemeButtonIcons themeIcon;

}
