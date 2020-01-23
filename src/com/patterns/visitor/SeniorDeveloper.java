package com.patterns.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing class after Junior developer...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing DataBase....");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable Test...");
    }
}
