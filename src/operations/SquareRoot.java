package operations;

public class SquareRoot {

    private double result;

    public void doTheSquareRoot(double number){
        setResult(Math.sqrt(number));
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
