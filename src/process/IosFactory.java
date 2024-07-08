package process;

import enums.BrandType;
import process.products.ApplePhone;

public class IosFactory implements OsFactory{
    @Override
    public Phone build(BrandType brand) {
        switch (brand){
            case APPLE:
                return new ApplePhone();
            default:
                return null;
        }
    }
}
