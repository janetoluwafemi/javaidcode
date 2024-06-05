package tdd;
public class PraiseTask {
    public String addingNumbers(String number,String value) {
        int number1 = Integer.parseInt(number);
        int number2 = Integer.parseInt(value);
        int sum = number1 * number2;

        String finalResult = Integer.toString(sum);
        return finalResult;
    }
}
