package com.inmotionhosting.inmotioneats;

/**
 * Created by Will S on 5/16/2017.
 */

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        }

        if (factory == "BRE") {
            return new BreadFactory();
        } else if(factory == "FIL") {
            return new FillingFactory();
        }

        return null;
    }
}
