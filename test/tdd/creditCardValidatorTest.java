package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class creditCardValidatorTest {
    @Test
    public void testCreditCardValidator() {
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        String creditCardNumber = "123456789";
        String checkCreditCard = creditCardValidator.checkCreditCard(creditCardNumber);
        assertEquals("Invalid credit Card",checkCreditCard);
    }
    @Test
    public void testCreditCardsOfNumbers(){
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        String cardsOfNumbers = "239138765489365";
        String creditCardsOfNumbers = creditCardValidator.creditCardValidatorLength(cardsOfNumbers);
        assertEquals("3186496",creditCardsOfNumbers);

    }
    @Test
    public void testCreditCardsOfNumbersLength(){}
}