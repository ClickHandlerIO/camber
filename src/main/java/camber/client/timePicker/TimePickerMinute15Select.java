package camber.client.timePicker;

import camber.client.camberSelect.AbstractEnumCamberSelect;
import camber.client.util.CamberEnumUtil;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePickerMinute15Select extends AbstractEnumCamberSelect<TimePickerMinute15, TimePickerMinute15Select.Props> {

    @Inject
    public TimePickerMinute15Select() {
    }

    @Override
    public String toString(TimePickerMinute15 value) {
        return CamberEnumUtil.toString(value);
    }

    @Override
    public TimePickerMinute15[] getValues() {
        return TimePickerMinute15.values();
    }

    @JsType(isNative = true)
    public interface Props extends AbstractEnumCamberSelect.CamberSelectProps<TimePickerMinute15> {
    }
}
