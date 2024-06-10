package tdd;
import java.util.Arrays;

public class CountingNumberOfTimes {
    public String numbersInAnArray(int[] numbers){

        for(int count = 0; count < numbers.length; count++){
            for(int counter = 0; counter < numbers.length; ){
                if(numbers[count] == numbers[counter]) {
                    counter++;
                }
            }
        }
        String result = Arrays.toString(numbers);
        return result;
    }
}
