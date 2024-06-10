package tdd;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class CountingNumberOfTimesTest {

    @Test
    public void testThatCountingNumberOfTimes() {
        CountingNumberOfTimes countingNumberOfTimes = new CountingNumberOfTimes();
        int[] numbers = {2,3,5,3,3,2,5};
        String checkTheNumbers = countingNumberOfTimes.numbersInAnArray(numbers);
        assertEquals("[2,3,2]", checkTheNumbers);
    }
}