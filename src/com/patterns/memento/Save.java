package com.patterns.memento;

import java.util.Date;

public class Save {
    private final String version;// сохраням и не собираемся менять, нужен Только доступ к чтению
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }
    public Date getDate() {
        return date;
    }


}
