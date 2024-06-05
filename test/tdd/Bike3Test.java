package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bike3Test {
    @Test
    public void testIfBikeIsOnOrOff(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOff = bike.checkIfBikeIsOnOrOff("false");
        assertFalse(checkIfBikeIsOff);
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);

    }
    @Test
    public void testIfBikeIsNotOnOrOff(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);
        boolean whenBikeIsOff = bike.checkIfBikeIsOnOrOff("false");
        assertFalse(whenBikeIsOff);
    }
    @Test
    public void testIfBikeSpeedCanIncrease(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);
        bike.checkIfBikeSpeedCanIncrease(20);
        assertEquals(20,bike.checkSpeed());
    }
    @Test
    public void testIfBikeSpeedCannnotIncreaseNegativeNumber(){
       Bike3 bike = new Bike3();
       boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
       assertTrue(checkIfBikeIsOn);
       boolean checkIfSpeedCannnotIncrease = bike.checkIfBikeIsOnOrOff("-1");
       assertEquals(0,bike.checkSpeed());
    }
    @Test
    public void testThatgearChangesGear1ToGear2(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);
        bike.checkIfBikeSpeedCanIncrease(10);
        assertEquals(10,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("1",bike.getGear());
        bike.checkIfBikeSpeedCanIncrease(15);
        assertEquals(25,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("2",bike.getGear());
    }
    @Test
    public void testThatgearChangesGear3ToGear4(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);
        bike.checkIfBikeSpeedCanIncrease(30);
        assertEquals(30,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("3",bike.getGear());
        bike.checkIfBikeSpeedCanIncrease(15);
        assertEquals(45,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("4",bike.getGear());
    }
    @Test
    public void testThatGearChangesGear2ToGear1(){
        Bike3 bike = new Bike3();
        boolean checkIfBikeIsOn = bike.checkIfBikeIsOnOrOff("true");
        assertTrue(checkIfBikeIsOn);
        bike.checkIfBikeSpeedCanIncrease(25);
        assertEquals(25,bike.checkSpeed());
        bike.checkIfBikeSpeedCanDecrease(10);
        assertEquals(15,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("1",bike.getGear());
    }
    @Test
    public void testThatGearChangesGear3ToGear2(){
        Bike3 bike = new Bike3();
        bike.checkIfBikeSpeedCanIncrease(39);
        assertEquals(39,bike.checkSpeed());
        bike.checkIfBikeSpeedCanDecrease(10);
        assertEquals(29,bike.checkSpeed());
        bike.checkGear(bike.checkSpeed());
        assertEquals("2",bike.getGear());
    }


}