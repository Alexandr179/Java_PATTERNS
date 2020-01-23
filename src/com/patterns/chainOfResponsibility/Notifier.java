package com.patterns.chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;// содержит экз.следующий уведомитель

    public Notifier(int priority) {
        this.priority = priority;
    }
    public void setNextNotifier(Notifier nextNotifier) {// сеттер для сделующего Уведомителя
        this.nextNotifier = nextNotifier;
    }



    public void notifyManage(String message, int level){// сообщение, что хотим сообщить менеджеру и уровень приоритета..
        if(level >= priority){
            write(message);
        }

        if(nextNotifier != null){
            nextNotifier.notifyManage(message,level);
        }
    }

    public abstract void write(String message);
}
