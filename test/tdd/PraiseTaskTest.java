package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PraiseTaskTest {
    @Test
    public void testAdditionOfNumbers(){
        PraiseTask praiseTask = new PraiseTask();
        String number = "4";
        String value = "4";
        String convertingToString = praiseTask.addingNumbers(number,value);
        assertEquals("16",convertingToString);
    }
}