package com.patterns.observer;

public class JobSeach {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position...");
        jobSite.addVacancy("Second Java position...");

        Observer firstSubscriber = new Subscriber("Alexandr_A");
        Observer secondSubscriber = new Subscriber("Pit_A");

        jobSite.subscribers.add(firstSubscriber);
        jobSite.subscribers.add(secondSubscriber);

        jobSite.addVacancy("Thead Java Position...");

        jobSite.removeVacancy("Second Java position...");
    }
}
