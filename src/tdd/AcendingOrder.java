package tdd;
import java.util.*;
public class AcendingOrder {
    public String acendingnumbers(int[] numbers){
        int temp = 0;
        for(int count=0; count<numbers.length; count++){
            for(int counter = 0; counter < numbers.length; counter++){
                if(numbers[count] < numbers[counter]){
                    temp = numbers[count];
                    numbers[count] = numbers[counter];
                    numbers[counter] = temp;
                }
            }
        }
        String sum = Arrays.toString(numbers);
        return sum;
    }
}
