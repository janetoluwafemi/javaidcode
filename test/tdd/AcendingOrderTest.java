package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcendingOrderTest {
    @Test
    public void testThatNumbersCanBeInAcendingOrder() {
        AcendingOrder acending = new AcendingOrder();
        int[] numbers = {3,2,5,6,1,8,9,4,7};
        String numbersaccending =acending.acendingnumbers(numbers);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]",numbersaccending);
    }
}