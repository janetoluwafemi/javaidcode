import java.util.Arrays;

public class Swapping {
    public int swappingNumbers(int[] numbers)
    {
        int[] result = new int[numbers.length];
        for(int count = numbers.length-1; count >= 0; count--) {
            result[count] = numbers[count];
        }
        String finalResult = Arrays.toString(result);
        return Integer.parseInt(finalResult);
    }
}
