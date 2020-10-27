package ua.doc.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programms = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        for(Program program : programms){
            program.developProgram();
        }
    }
}
