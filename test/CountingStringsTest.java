import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingStringsTest {
    @Test
    public void testTheLengthOfTheWord(){
        CountingStrings countingStrings = new CountingStrings();
        String word = "semicolon";
        int length = countingStrings.lengthOfTheWord(word);
        assertEquals(9,length);
    }
}