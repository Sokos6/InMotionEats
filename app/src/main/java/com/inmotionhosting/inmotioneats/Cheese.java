package com.inmotionhosting.inmotioneats;

/**
 * Created by Will S on 5/16/2017.
 */

public class Cheese implements Filling {

    @Override
    public String name() {
        return "American";
    }

    @Override
    public String calories() {
        return " : 50 kcal";
    }
}
