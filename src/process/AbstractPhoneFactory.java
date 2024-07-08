package process;

import enums.OsType;

public abstract class AbstractPhoneFactory {
    public static OsFactory getFactory(OsType type){
        switch (type){
            case ANDROID:
                return new AndroidFactory();
            case IOS:
                return new IosFactory();
            default:
                return null;
        }
    }
}
