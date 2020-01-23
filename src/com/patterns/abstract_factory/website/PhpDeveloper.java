package com.patterns.abstract_factory.website;

import com.patterns.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writs Php Code");
    }
}
