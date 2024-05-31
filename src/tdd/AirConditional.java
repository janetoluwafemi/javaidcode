package tdd;

public class AirConditional {

    public boolean checkingIfOnOrOff(String input) {
        if (input.equalsIgnoreCase("true")) {
            return true;
        }
        return !input.equalsIgnoreCase("false");
    }
    public boolean checkingIfTheTemperatureOfTheRoomIsIncreased(int input) {
        int high = 30;
        int low = 16;
        int average = 23;
        if (input > average) {
            return true;
        }
        if (input > high || input < low) {
            return false;
        }
        return true;
    }
    public boolean checkingIfTheTemperatureOfTheRoomIsDecreased(int input) {
        int high = 30;
        int low = 16;
        int average = 23;
        if (input < average) {
            return true;
        }
        if (input > high || input < low) {
            return false;
        }
        return true;
    }
    public boolean checkingIfTheTemperatureOfTheAcIsGreaterThan30(int input) {
        int high = 30;
        int low = 16;
        int average = 23;
        if (input > high) {
            input = 30;
            return true;
        }
        return false;
    }
    public boolean checkingIfTheTemperatureOfTheAcIsLessThan16(int input) {
        int high = 30;
        int low = 16;
        int average = 23;
        if (input < low) {
            input = 16;
            return true;
        }
        return false;
    }
}
