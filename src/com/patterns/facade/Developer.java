package com.patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BagTracker bagTracker){
        if(bagTracker.isActiveSprint()){
            System.out.println("Developer is solving problem");
        } else {
            System.out.println("Developer is reading Habr...");
        }
    }
}
