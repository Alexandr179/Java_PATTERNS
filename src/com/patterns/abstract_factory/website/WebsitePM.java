package com.patterns.abstract_factory.website;

import com.patterns.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website Project");
    }
}
