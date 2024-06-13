package tdd;

public class CountingStrings {
    public int lengthOfTheWord(String value){
        int length = 0;
        for(int count = 0; count <value.length(); count++){
            length = count+1;
            //count++;
        }
        return length;
    }
}
