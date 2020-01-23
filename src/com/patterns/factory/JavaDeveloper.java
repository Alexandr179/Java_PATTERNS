package com.patterns.factory;


public class JavaDeveloper implements Developer {
    @Override
    public void createCode() {
        System.out.println("JavaDeveloper created Java Code...");
    }
}
