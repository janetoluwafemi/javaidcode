package tdd;
import java.util.Arrays;
public class ToDayClassTask {
    public String numbersInAnArray(int[] numbers){
        int sum[] = new int[numbers.length];
        for(int counter = 0; counter <numbers.length; counter++){
            sum[counter] = numbers[counter] * numbers[0];
        }
        String result = Arrays.toString(sum);
        return result;
    }
}
