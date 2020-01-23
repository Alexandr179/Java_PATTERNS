package com.patterns.abstract_factory.banking;

import com.patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes JavaCode");
    }
}
