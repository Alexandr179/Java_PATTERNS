package com.patterns.decorator;

public class JavaDeveloper implements Developer {

    public JavaDeveloper(String s, String[] skills) {
    }

    public JavaDeveloper() {

    }

    @Override
    public String makeJob() {
        return "Write Java Code. ";
    }
}
