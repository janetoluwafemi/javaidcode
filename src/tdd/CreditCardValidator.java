package tdd;

public class CreditCardValidator {
    public String checkCreditCard(String creditCard){
        if(creditCard.length() < 16 && creditCard.length() > 13){
            return "Valid credit card";
        }
        return "Invalid credit Card";
    }
    public char creditCardValidatorTest(String creditCard) {
    char result = '\u0000';
    for (int count = 0; count < creditCard.length(); count++) {
        result = creditCard.charAt(count);
    }
    return result;
}
    public String creditCardValidatorLength(String creditCard) {
        for (int count = 0; count < creditCard.length(); ) {
            creditCard = creditCard.substring(count, count+2);
            return creditCard;
        }
        return creditCard;
    }
    public String addingTheLastValue(String creditCard) {
        int result = 0;
        int finalResult = 0;
        for (int count = 0; count < 19; count+=2) {
            result = Integer.parseInt(creditCard);
            finalResult = result * 2;
        }
        return String.valueOf(finalResult);
    }
}
