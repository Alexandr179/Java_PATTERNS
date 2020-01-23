package com.patterns.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();// скачиваем проект на GitHub и запускаем...
    }
    public void load(){
        System.out.println("Loading Project from" + url + " ...");
    }



    @Override
    public void ran() {
        System.out.println("Running Project. URL: " + url + " ...");
    }
}
