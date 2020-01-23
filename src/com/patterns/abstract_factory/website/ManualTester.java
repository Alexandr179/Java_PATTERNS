package com.patterns.abstract_factory.website;

import com.patterns.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
