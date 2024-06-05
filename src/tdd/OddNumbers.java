package tdd;

import java.util.Arrays;

public class OddNumbers {
    public String oddNumbersInAnArray(int[] numbers){
        String[] result = new String[numbers.length];
        for(int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] % 2 == 1) {
                result[counter] = "true";

            }
            else{
                result[counter] = "false";
            }
        }
        return Arrays.toString(result);
    }
}
