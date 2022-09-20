package operations;

public class Potentiation {

    private double base;
    private double potency;

    public Potentiation(double base, double potency) {
        this.base = base;
        this.potency = potency;
    }

    private double result = Math.pow(base, potency);

    public double getResult() {
        return result;
    }

}
