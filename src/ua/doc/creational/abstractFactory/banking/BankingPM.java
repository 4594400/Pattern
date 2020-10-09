package ua.doc.creational.abstractFactory.banking;

import ua.doc.creational.abstractFactory.ProjectManager;

public class BankingPM  implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
