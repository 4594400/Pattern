package ua.doc.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Master project", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        System.out.println("*************************************************");

        /**
         Project masterClone = (Project) master.copy();  // need cast
         */

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println(masterClone);
    }
}
