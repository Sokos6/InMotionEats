package com.inmotionhosting.inmotioneats;

/**
 * Created by Will S on 5/16/2017.
 */

public class BreadFactory extends AbstractFactory {

    @Override
    Bread getBread(String bread) {
        if (bread == null) {
            return null;
        }
        if (bread == "BAG") {
            return new Baguette();
        } else if (bread == "BRI") {
            return new Brioche();
        }

        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }
}
