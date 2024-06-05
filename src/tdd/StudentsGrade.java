package tdd;


import java.util.Arrays;
public class StudentsGrade {
    public String scoresInAcendingOrder(int[] grades) {
        int temp = 0;

        for (int count = 0; count < grades.length; count++) {
            for(int counter = 0; counter < grades.length; counter++) {
                if(grades[count] > grades[counter]){
                    temp = grades[count];
                    grades[count] = grades[counter];
                    grades[counter] = temp;
                }
            }
        }

        int[] counting = new int[grades.length];
        for(int counter = 0; counter < grades.length; ) {
            if(grades[counter] > counting[counter]){
                System.out.println(counter);
                counter++;
            }
        }
        String result = Arrays.toString(grades);
        return result;
    }
}
