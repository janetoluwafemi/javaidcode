package tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

public class ToDayClassTaskTest {
    @Test
    public void testIfNumbersAreAdding() {
        ToDayClassTask toDayClassTask = new ToDayClassTask();
        int[] numbers = new int[]{2,3,5,2,5,3};
        String addIngNumbers = toDayClassTask.numbersInAnArray(numbers);
        assertEquals("[4, 6, 10, 4, 10, 6]",addIngNumbers);
    }
}