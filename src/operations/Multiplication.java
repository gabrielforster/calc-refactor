package operations;

import java.util.ArrayList;

public class Multiplication {
    private double result;

    public void doTheMultiplication(ArrayList<Integer> numList){
        for(int i = 0; numList.size() > i; i++){
            setResult(getResult() * numList.get(i));
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
