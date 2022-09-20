package operations;

import java.util.ArrayList;

public class Percentage {
    private double total;
    private double amount;
    private double result;

    public Percentage(double total, double amount){
        this.total = total;
        this.amount = amount;
        this.setResult((this.amount * 100) / this.total);
    }

    public String getResult() {
        return String.format("%.2f", result);
    }

    public void setResult(double result) {
        this.result = result;
    }
}
