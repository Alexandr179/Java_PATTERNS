package com.patterns.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();// конфигурация
        Developer developer = new Developer();//...

        developer.setActivity(activity);// инициализация

        for (int i = 0; i < 10; i++){
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
