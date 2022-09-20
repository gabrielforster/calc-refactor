package operations;

import java.util.ArrayList;

public class Division {
    private double divider, dividend, result;


    public Division(double divider, double dividend){
        this.dividend = dividend;
        this.divider = divider;
        setResult(this.divider / this.dividend);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
