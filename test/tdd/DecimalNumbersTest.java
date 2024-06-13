package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalNumbersTest {
    @Test
    public void testThatBinaryCanConvertToDecimal(){
        DecimalMumbers decimalMumbers = new DecimalMumbers();
        String decimalNumber = "101011";
        String binaryNumber = decimalMumbers.decimalNumberTodecimalMumbers(decimalNumber);
        assertEquals("43",binaryNumber);
    }
}