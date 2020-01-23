package com.patterns.facade;

public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();// все инициализации спрятаны в Facade

        workflow.solveProblems();
    }
}
