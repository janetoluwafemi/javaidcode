package tdd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
class OddNumbersTest {
    @Test
    public void testOddNumbers() {
        OddNumbers oddNumbers = new OddNumbers();
        int[] numbers = {2,3,4,5};
        String checkIfNumberIsOddOrTrue = oddNumbers.oddNumbersInAnArray(numbers);
        assertEquals("[false, true, false, true]",checkIfNumberIsOddOrTrue);
    }
}