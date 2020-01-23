package com.patterns.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterToDataBase();//изначально null

        dataBase.select();// методы интерфейсные, а реализация - через адаптер!
        dataBase.insert();
        dataBase.delete();
        dataBase.update();
    }
}
