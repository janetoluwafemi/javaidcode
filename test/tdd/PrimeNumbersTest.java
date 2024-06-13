package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    @Test
    public void testIfNumbersArePrime() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int number = 1;
        boolean result = primeNumbers.isPrime(number);
        assertTrue(result);
    }
}