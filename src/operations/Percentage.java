package operations;

import java.util.ArrayList;

public class Percentage {
    private double total;
    private double amount;


    public Percentage(double total, double amount){
        this.total = total;
        this.amount = amount;
    }

    private double result = (amount * 100) / total;

    public double getResult() {
        return result;
    }
}
