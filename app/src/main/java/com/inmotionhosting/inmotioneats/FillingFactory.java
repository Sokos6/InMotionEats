package com.inmotionhosting.inmotioneats;

/**
 * Created by Will S on 5/16/2017.
 */

public class FillingFactory extends AbstractFactory {

    @Override
    Filling getFilling(String filling) {
        if(filling == null) {
            return null;
        }
        if (filling == "CHE") {
            return new Cheese();
        } else if (filling == "TOM") {
            return new Tomato();
        }
        return null;
    }
    @Override
    Bread getBread(String bread) {
        return null;
    }
}
