package com.patterns.factory;

public class PhpDeveloper implements Developer {
    @Override
    public void createCode() {
        System.out.println("PhpDeveloper created Php Code...");
    }
}
