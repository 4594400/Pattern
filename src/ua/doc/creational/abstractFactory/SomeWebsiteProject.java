package ua.doc.creational.abstractFactory;

import ua.doc.creational.abstractFactory.website.WebsiteTeamFactory;

public class SomeWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

