package com.patterns.abstract_factory.banking;

import com.patterns.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("PM manages banking Code");
    }
}
