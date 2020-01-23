package com.patterns.adapter;

public class JavaApplication {// не можем напрямую взаимодействовать с DataBase, нет таки именно методов
    public void saveObject(){
        System.out.println("Save JavaObject");
    }

    public void updateObject(){
        System.out.println("Update JavaObject");
    }

    public void loadObject(){
        System.out.println("Load JavaObject");
    }

    public void deleteObject(){
        System.out.println("Delete JavaObject");
    }
}
