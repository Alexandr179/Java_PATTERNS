package com.patterns.prototype;

public class ClientVersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "MasterProject", "SourceCode = new SourceCode();");
        System.out.println(master);

//        Project masterClone = (Project) master.copy();
////        System.out.println(masterClone);

        ProjectPrototypeFactory projectPrototypeFactory = new ProjectPrototypeFactory(master);
        Project masterClone = projectPrototypeFactory.cloneProject();
        System.out.println(masterClone);
    }
}
