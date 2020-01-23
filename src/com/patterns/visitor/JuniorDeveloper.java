package com.patterns.visitor;

public class JuniorDeveloper implements Developer{

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop DataBase....");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable Test...");
    }
}
