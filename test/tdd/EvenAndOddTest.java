package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddTest {
    @Test
    public void testIfNumberIsEven() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int num = 2;
        boolean result = evenAndOdd.isEven(num);
        assertTrue(result);
    }
    @Test
    public void testIfNumberIsOdd() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int num = 3;
        boolean result = evenAndOdd.isOdd(num);
        assertTrue(result);
    }
}