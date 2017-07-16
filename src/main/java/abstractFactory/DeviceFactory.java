package abstractFactory;

public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
