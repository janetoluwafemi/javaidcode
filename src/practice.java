public class practice {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        System.out.print(firstNumber + "\t");
        for(int counter = 1; counter <= 10; counter++){
            sum = secondNumber;
            secondNumber = firstNumber + secondNumber;
            System.out.print(sum + "\t");
            firstNumber = sum;

        }
    }
}
