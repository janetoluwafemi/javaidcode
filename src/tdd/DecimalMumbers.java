package tdd;

public class DecimalMumbers {
    public String decimalNumberTodecimalMumbers(String number){
        int result = 0;
        int value = 2;
        String finalResult = "";
        int result2 = 0;
        for(int count = 0; count < number.length(); count++){
            result = Integer.parseInt(number);
            result2 = result * value * count;
            finalResult = Integer.toString(result2);
        }
        return finalResult;
    }
}
