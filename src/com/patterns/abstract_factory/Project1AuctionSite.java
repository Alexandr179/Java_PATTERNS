package com.patterns.abstract_factory;

import com.patterns.abstract_factory.website.WebsiteTeamFactory;

public class Project1AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website team:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
