package com.patterns.prototype;

public class Project implements Copyable {
    private int id;
    private String projectName;
    private String projectCode;

    public Project(int id, String projectName, String projectCode) {
        this.id = id;
        this.projectName = projectName;
        this.projectCode = projectCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Override
    public Object copy() {
        Project project = new Project(id, projectName, projectCode);
        return project;
    }


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                '}';
    }
}
