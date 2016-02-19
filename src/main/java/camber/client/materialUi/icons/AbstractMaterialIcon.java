package camber.client.materialUi.icons;

import camber.client.ExternalComponent;
import camber.client.materialUi.SvgIcon;
import jsinterop.annotations.JsType;

public abstract class AbstractMaterialIcon extends ExternalComponent<AbstractMaterialIcon.Props> {

    @Override
    protected Props defaultProps() {
        Props props = new Props();
        props.viewBox = "0 0 24 24";
        applyKey(props);
        return props;
    }

    @JsType
    public static class Props extends SvgIcon.Props {
    }
}