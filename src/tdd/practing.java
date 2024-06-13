package tdd;

public class practing {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4};
        int[] number = new int[array.length];

        for (int i = array.length-1; i >= 0; i--) {
            number[i] = array[i];
            System.out.print(number[i]);
        }
    }

}
