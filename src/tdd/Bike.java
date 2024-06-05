package tdd;

public class Bike {
   public boolean checkingIfBikeIsOn(String input){
       if(input.equalsIgnoreCase("true")){
           return true;
       }
       return false;
   }
   public boolean checkingIfBikeIsOff(String input){
       if(input.equalsIgnoreCase("false")){
           return false;
       }
       return true;
   }
   public int checkingIfItIsOnGearOne(int input){
       int sum = 0;
       String gear = "1";
       if(gear.equalsIgnoreCase("1") && input < 20 && input > 0){
          sum = input + 1;
          return sum;
       }
       return sum;
   }
   public int checkingIfItIsOnGearTwo(int input){
       int sum = 0;
       String gear = "2";
       if(gear.equalsIgnoreCase("2") && input < 25 && input > 0){
           sum = input + 2;
           return sum;
       }
       return sum;
   }
   public int checkingIfItIsOnGearThree(int input){
       int sum = 0;
       String gear = "3";
       if(gear.equalsIgnoreCase("3") && input < 35 && input > 0){
           sum = input + 3;
           return sum;
       }
       return sum;
   }
   public int checkingIfItIsOnGearFour(int input){
       int sum = 0;
       String gear = "4";
       if(gear.equalsIgnoreCase("4") && input < 45 && input > 0){
           sum = input + 4;
           return sum;
       }
       return sum;
   }
   public int checkingIfItIsOnGearOneForDecreasing(int input){
       int sum = 0;
       String gear = "1";
       if(gear.equalsIgnoreCase("1") && input < 20 && input > 0){
           sum = input - 1;
           return sum;
       }
       return sum;
   }
    public int checkingIfItIsOnGearTwoForDecreasing(int input){
        int sum = 0;
        String gear = "2";
        if(gear.equalsIgnoreCase("2") && input < 25 && input > 0){
            sum = input - 2;
            return sum;
        }
        return sum;
    }
    public int checkingIfItIsOnGearThreeForDecreasing(int input){
        int sum = 0;
        String gear = "3";
        if(gear.equalsIgnoreCase("3") && input < 35 && input > 0){
            sum = input - 3;
            return sum;
        }
        return sum;
    }
    public int checkingIfItIsOnGearFourForDecreasing(int input){
        int sum = 0;
        String gear = "4";
        if(gear.equalsIgnoreCase("4") && input < 45 && input > 0){
            sum = input - 4;
            return sum;
        }
        return sum;
    }
}