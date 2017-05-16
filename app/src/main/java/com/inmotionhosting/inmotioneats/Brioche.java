package com.inmotionhosting.inmotioneats;

public class Brioche implements Bread {

    @Override
    public String name() {
        return "Brioche";
    }

    public String calories() {
        return " : 85 kcal";
    }
}
