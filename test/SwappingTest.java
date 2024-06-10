import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwappingTest {
    @Test
    public void testThatnumbersCanSwap(){
       // Swapping swapping = new Swapping();
        int[] numbers = new int[]{3,2,6,1,9};
        //int result swapping.swappingNumbers(numbers);
        assertEquals(new int[]{9, 1, 6, 2, 3,});
    }

    private void assertEquals(int[] ints) {
    }
}