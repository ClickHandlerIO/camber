package camber.client.select2;

import camber.client.select2.events.Select2EventArgs;
import camber.client.select2.events.Select2EventParams;
import camber.client.select2.events.Select2NativeEvent;
import com.google.gwt.dom.client.NativeEvent;
import io.clickhandler.web.Func;
import jsinterop.annotations.JsType;

@JsType
public class Select2Events {
    public Func.Run1<NativeEvent> onChange;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onOpening;
    public Func.Run1<NativeEvent> onOpen;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onClosing;
    public Func.Run1<NativeEvent> onClose;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onSelecting;
    public Func.Run1<Select2NativeEvent<Select2EventArgs>> onSelect;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onUnselecting;
    public Func.Run1<Select2NativeEvent<Select2EventArgs>> onUnselect;
}
