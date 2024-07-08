package process;

import enums.BrandType;
import enums.OsType;

public class Initializer {
    public static void main(String[] args) {
        OsFactory factory = AbstractPhoneFactory.getFactory(OsType.ANDROID);
        Phone phone = factory.build(BrandType.HTC);
        phone.print();

        Phone phone2 = AbstractPhoneFactory.getFactory(OsType.IOS).build(BrandType.APPLE);
        phone2.print();

    }
}
