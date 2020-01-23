package com.patterns.abstract_factory.website;

import com.patterns.abstract_factory.Developer;
import com.patterns.abstract_factory.ProjectManager;
import com.patterns.abstract_factory.ProjectTeamFactory;
import com.patterns.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
