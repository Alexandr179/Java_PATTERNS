package com.patterns.bridge;

public class StockExchange extends Program{// фондовая биржа
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange development in progress");
        developer.writeCode();
    }
}
