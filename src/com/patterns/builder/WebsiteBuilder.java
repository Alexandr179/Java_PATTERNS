package com.patterns.builder;

public abstract class WebsiteBuilder {// любая реализация абстрактного класса
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
