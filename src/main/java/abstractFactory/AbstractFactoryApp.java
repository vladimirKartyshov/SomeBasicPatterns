package abstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10,25);

    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        if (lang.equals("RU")) {
            return new RuDeviceFactory();
        } else if (lang.equals("EN")) {
            return new EnDeviceFactory();
        } else {
            throw new RuntimeException("Unsupported Country Code : " + lang);
        }
        }
    }

