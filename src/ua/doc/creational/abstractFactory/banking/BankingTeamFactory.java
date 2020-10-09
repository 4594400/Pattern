package ua.doc.creational.abstractFactory.banking;

import ua.doc.creational.abstractFactory.Developer;
import ua.doc.creational.abstractFactory.ProjectManager;
import ua.doc.creational.abstractFactory.ProjectTeamFactory;
import ua.doc.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
