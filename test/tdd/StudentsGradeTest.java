package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsGradeTest {
    @Test
    public void testIfStudentsGradeAcends() {
        StudentsGrade studentsScores = new StudentsGrade();
        int[] grades = new int[]{45,32,90,100,42,20,89};
        String acendingScores = studentsScores.scoresInAcendingOrder(grades);
        assertEquals("[20, 32, 42, 45, 89, 90, 100]", acendingScores);
    }
}