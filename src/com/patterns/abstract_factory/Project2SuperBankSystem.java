package com.patterns.abstract_factory;

import com.patterns.abstract_factory.banking.BankingTeamFactory;

public class Project2SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bankSystem team:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
