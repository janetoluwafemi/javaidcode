package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testIfBikeIsOn() {
        boolean checkIfOnOrOff = false;
        Bike bike = new Bike();
        checkIfOnOrOff = bike.checkingIfBikeIsOn("true");
        assertTrue(checkIfOnOrOff);
    }

    @Test
    public void testIfBikeIsOff() {
        boolean checkIfOnOrOff = false;
        Bike bike = new Bike();
        checkIfOnOrOff = bike.checkingIfBikeIsOff("false");
        assertFalse(checkIfOnOrOff);
    }

    @Test
    public void testIfBikeIsAtGearOne() {
        int gear = 1;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearOne(15);
        assertEquals(16, sum);
    }

    @Test
    public void testIfBikeIsAtGearTwo() {
        int gear = 2;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearTwo(24);
        assertEquals(26, sum);
    }

    @Test
    public void testIfBikeIsAtGearThree() {
        int gear = 3;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearThree(32);
        assertEquals(35, sum);
    }

    @Test
    public void testIfBikeIsAtGearFour() {
        int gear = 4;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearFour(40);
        assertEquals(44, sum);
    }

    @Test
    public void testIfBikeIsAtGearOneForDecreasing() {
        int gear = 1;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearOneForDecreasing(15);
        assertEquals(14, sum);
    }

    @Test
    public void testIfBikeIsAtGearTwoForDecreasing() {
        int gear = 2;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearTwoForDecreasing(24);
        assertEquals(22, sum);
    }

    @Test
    public void testIfItIsOnGearThreeForDecreasing() {
        int gear = 3;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearThreeForDecreasing(34);
        assertEquals(31, sum);
    }

    @Test
    public void testIfBikeIsAtGearFourForDecreasing() {
        int gear = 4;
        Bike bike = new Bike();
        int sum = bike.checkingIfItIsOnGearFourForDecreasing(44);
        assertEquals(40, sum);
    }
}