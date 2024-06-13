package tdd;

import java.util.Arrays;

public class Acending {
    public String arrangingInAcendingOrder(int[] number) {
        int temp = 0;
        for (int count = 0; count < number.length; count++) {
            for (int counter = 0; counter < number.length; counter++) {
                if (number[count] < number[counter]) {
                    temp = number[count];
                    number[count] = number[counter];
                    number[counter] = temp;
                }
            }
        }
        String result = Arrays.toString(number);
        return result;
    }
}
