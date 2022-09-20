package operations;

import java.util.ArrayList;

public class Division {
    private double divider, dividend;

    public Division(double divider, double dividend){
        this.dividend = dividend;
        this.divider = divider;
    }

    private double result = divider / dividend;

    public double getResult() {
        return result;
    }
}
