package ua.doc.creational.abstractFactory.website;

import ua.doc.creational.abstractFactory.Developer;
import ua.doc.creational.abstractFactory.ProjectManager;
import ua.doc.creational.abstractFactory.ProjectTeamFactory;
import ua.doc.creational.abstractFactory.Tester;

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
