package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    @Test
    public void testIfAirConditionalIsOn() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc = false;
        temperatureOfTheAc = vendor.checkingIfOnOrOff("true");
        assertTrue(temperatureOfTheAc);

    }
    @Test
    public void testIfAirConditionalIsOff() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc;
        assertTrue(vendor.checkingIfOnOrOff("true"));
        temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
        assertFalse(temperatureOfTheAc);
    }
    @Test
    public void testIfAirConditionalIsIgnoreCase() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc;
        assertTrue(vendor.checkingIfOnOrOff("true"));
        temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
        assertFalse(temperatureOfTheAc);

    }
    @Test
    public void testIfAirConditionalTemperatureIslow() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc;
        assertTrue(vendor.checkingIfOnOrOff("true"));
        temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
        assertFalse(temperatureOfTheAc);

        assertTrue(vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(31));
        temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(19);

        assertTrue(vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(39));
        temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(23);




    }
    @Test
    public void testIfAirConditionalTemperatureIshigh() {
       AirConditional vendor = new AirConditional();
       boolean temperatureOfTheAc;
       assertTrue(vendor.checkingIfOnOrOff("true"));
       temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
       assertFalse(temperatureOfTheAc);

       assertTrue(vendor.checkingIfTheTemperatureOfTheRoomIsDecreased(18));
       temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheRoomIsDecreased(30);

       assertTrue(vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(32));
       temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheRoomIsIncreased(29);
    }
    @Test
    public void testIfAirConditionalTemperatureCanBeGreaterThan30() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc;
        assertTrue(vendor.checkingIfOnOrOff("true"));
        temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
        assertFalse(temperatureOfTheAc);

        assertTrue(vendor.checkingIfTheTemperatureOfTheAcIsGreaterThan30(32));
        temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheAcIsGreaterThan30(32);


    }
    @Test
    public void testIfAirConditionalTemperatureCanBeLessThan16() {
        AirConditional vendor = new AirConditional();
        boolean temperatureOfTheAc;
        assertTrue(vendor.checkingIfOnOrOff("true"));
        temperatureOfTheAc = vendor.checkingIfOnOrOff("false");
        assertFalse(temperatureOfTheAc);

        assertTrue(vendor.checkingIfTheTemperatureOfTheAcIsLessThan16(14));
        temperatureOfTheAc = vendor.checkingIfTheTemperatureOfTheAcIsLessThan16(14);
    }


}