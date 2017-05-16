package com.inmotionhosting.inmotioneats;

/**
 * Created by Will S on 5/16/2017.
 */

public abstract class AbstractFactory {

    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filling);
}
