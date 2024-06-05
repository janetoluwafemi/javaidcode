package tdd;

public class Bike3 {
        private String gear;
        private int speed;

        public int checkSpeed(){
           return this.speed;
        }
        public boolean checkIfBikeIsOnOrOff(String input){
            if(input.equalsIgnoreCase("true")){
                return true;
            }
            return false;
        }

    public void checkIfBikeSpeedCanIncrease(int increasing) {
        if(increasing > 0) {
            this.speed += increasing;
        }
    }
    public void checkIfBikeSpeedCanDecrease(int decreasing) {
            if(decreasing > 0 && decreasing < speed) {
                this.speed -= decreasing;
            }
    }
    public void checkGear(int speed) {
            if(speed < 20 && speed >=0) {
                this.gear = "1";
            }
            if(speed < 30 && speed >= 21) {
                this.gear = "2";
            }
            if(speed < 40 && speed >= 30) {
                this.gear = "3";
            }
            if(speed >= 45) {
                this.gear = "4";
            }

    }
    public String getGear() {
            return gear;
    }
    public int getSpeed() {
            return speed;
    }
}
