package operations;

public class Potentiation {

    private double base;
    private double potency;
    private double result;

    public Potentiation(double base, double potency) {
        this.base = base;
        this.potency = potency;
        setResult(Math.pow(this.base, this.potency));
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
