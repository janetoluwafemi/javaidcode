package tdd;

import java.util.Arrays;
import java.util.Scanner;
    public class DecendingOrder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements you wish to order: ");
            String input = scanner.nextLine();
            char result = '\u0000';
            String comparing = "";
            for (int count = input.length()-1; count >= 0; count--) {

                    result = input.charAt(count);
                    comparing = comparing + result;



            }
            System.out.println(comparing);
            String output = Arrays.toString(comparing.toCharArray());
            System.out.println(output);
    }
}
