package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcendingTest {
    @Test
    public void testThatTheNumbersAreAcending(){
        Acending acending = new Acending();
        int[] numbers = new int[]{3,7,2,4,5,6,1,8,9};
        String result = acending.arrangingInAcendingOrder(numbers);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", result);
    }
}