package com.patterns.bridge;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankSystem development in progress");
        developer.writeCode();
    }
}
