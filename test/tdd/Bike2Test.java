package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bike2Test {
    @Test
    public void testIfTheBikeIsOn(){
       Bike2 bike = new Bike2();
       boolean checkIfItIsOnOrOff = false;
       checkIfItIsOnOrOff = bike.onOrOffBike("true");
       assertTrue(checkIfItIsOnOrOff);
    }
    @Test
    public void testIfTheBikeIsOff(){
        Bike2 bike = new Bike2();
        boolean checkIfItIsOn = bike.onOrOffBike("true");
        assertTrue(checkIfItIsOn);
        boolean CheckIfItIsOff = bike.onOrOffBike("false");
        assertFalse(CheckIfItIsOff);
   }
    @Test
   public void testIfTheBikeSpeedCanincrease(){
        Bike2 bike = new Bike2();
        boolean checkIfItIsOn = true;
        checkIfItIsOn = bike.onOrOffBike("true");
        assertTrue(checkIfItIsOn);
        for (int i = 1; i < 20; i++) {
            bike.acceleratingSpeed();
        }

        assertEquals(19,bike.getSpeed());
        bike.acceleratingSpeed();
        assertEquals(22,bike.getSpeed());
   }
   @Test
   public void testIfTheBikeSpeedCandecrease(){
       Bike2 bike = new Bike2();
       boolean checkIfItIsOn = true;
       checkIfItIsOn = bike.onOrOffBike("true");
       assertTrue(checkIfItIsOn);
       for (int i = 1; i < 30; i++) {
           bike.decreasingSpeed();
       }

       assertEquals(29,bike.getSpeed());
       bike.decreasingSpeed();
       assertEquals(27,bike.getSpeed());
   }
   @Test
   public void testIfTheBikeSpeedCannotDecreaseWhen0(){
        Bike2 bike = new Bike2();
        boolean checkIfItIsOn = true;
        checkIfItIsOn = bike.onOrOffBike("true");
        assertTrue(checkIfItIsOn);
        bike.decreasing(50);
        assertEquals(0,bike.checkBikeSpeed());
   }
   @Test
   public void testIfTheBikeSpeedCanIncreaseWhenAtGearOne(){
        Bike2 bike = new Bike2();
        boolean checkIfItIsOn = true;
        checkIfItIsOn = bike.onOrOffBike("true");
        assertTrue(checkIfItIsOn);
        bike.acceleration(50);

   }
}