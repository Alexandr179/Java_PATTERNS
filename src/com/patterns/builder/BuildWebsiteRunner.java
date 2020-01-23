package com.patterns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitcartWwebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
