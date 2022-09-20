package operations;

import java.util.ArrayList;

public class Subtraction {
    private double result;

    public void doTheSubtraction(ArrayList<Integer> numList){
        setResult(numList.get(0));
        for(int i = 1; numList.size() > i; i++){
            setResult(getResult() - numList.get(i));
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
