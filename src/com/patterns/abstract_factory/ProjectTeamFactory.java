package com.patterns.abstract_factory;

public interface ProjectTeamFactory {// составляем команду из требований проекта..
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
