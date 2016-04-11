package io.clickhandler.camber.client.timePicker;

import io.clickhandler.camber.client.camberSelect.AbstractEnumCamberSelect;
import io.clickhandler.camber.client.util.CamberEnumUtil;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TimePickerMeridianSelect extends AbstractEnumCamberSelect<TimePickerMeridian, TimePickerMeridianSelect.Props> {

    @Inject
    public TimePickerMeridianSelect() {
    }

    @Override
    public String toString(TimePickerMeridian value) {
        return CamberEnumUtil.toString(value);
    }

    @Override
    public TimePickerMeridian[] getValues() {
        return TimePickerMeridian.values();
    }

    @JsType(isNative = true)
    public interface Props extends AbstractEnumCamberSelect.CamberSelectProps<TimePickerMeridian> {
    }
}
