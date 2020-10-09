package ua.doc.creational.abstractFactory;

import ua.doc.creational.abstractFactory.banking.BankingTeamFactory;

public class SomeBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }


}
