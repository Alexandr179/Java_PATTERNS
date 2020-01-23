package com.patterns.facade;

import java.awt.*;

public class Workflow {// рабочий процесс
    Developer developer = new Developer();
    Job job = new Job();
    BagTracker bagTracker = new BagTracker();// поля...... фасада.

    public void solveProblems(){
        job.doJob();
        bagTracker.startSprint();
        developer.doJobBeforeDeadline(bagTracker);
    }
}
