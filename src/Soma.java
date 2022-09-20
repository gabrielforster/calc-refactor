import java.util.ArrayList;

public class Soma {
    private double result;

    public void doTheSum(ArrayList<Integer> numList){
        for(int i = 0; numList.size() > i; i++){
            setResult(getResult() + numList.get(i));
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
