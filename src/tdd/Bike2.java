package tdd;

public class Bike2 {
    private String gear;
    private int speed;

    public String checkGear() {
        return this.gear;
    }

    public boolean onOrOffBike(String input) {
        if (input.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    public void acceleration(int increasing) {
        this.speed += increasing;
    }

    public int checkBikeSpeed() {
        return this.speed;
    }
    public int acceleratingSpeed(){
        if(speed < 20 && speed >= 0){
            gear = "1";
            speed += 1;
        }
        if(speed < 30 && speed >= 20){
            gear = "2";
            speed += 2;
        }
        if(speed < 40 && speed >= 30){
            gear = "3";
            speed += 3;
        }
        if(speed >= 45){
            gear = "4";
            speed += 4;
        }
        return speed;
    }
    public int decreasingSpeed(){
        if(speed < 20 && speed >= 0){
            gear = "1";
            speed -= 1;
        }
        if(speed < 30 && speed >= 20){
            gear = "2";
            speed -= 2;
        }
        if(speed < 40 && speed >= 30){
            gear = "3";
            speed -= 3;
        }
        if(speed >= 45){
            gear = "4";
            speed -= 4;
        }
        return speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void decreasing(int decrease){
        if(this.speed > 0 && decrease < this.speed) {
            this.speed -= decrease;
        }
    }


}
