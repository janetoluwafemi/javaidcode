package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsGradeTest1 {
    @Test
    public void testIfStudentsGradeAscends() {
        StudentsGrade studentsScores = new StudentsGrade();
        int[] grades = new int[]{45,32,90,100,42,20,89};
        String ascendingScores = studentsScores.scoresInAcendingOrder(grades);
        assertEquals("[100, 90, 89, 45, 42, 32, 20]", ascendingScores);
        int[] result = new int[]{45,32,90,100,42,20,89};
        String ascendingResults = studentsScores.scoresInAcendingOrder(result);
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", ascendingResults);
    }

}
