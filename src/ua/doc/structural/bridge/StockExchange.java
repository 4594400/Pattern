package ua.doc.structural.bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
