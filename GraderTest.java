package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void zeroShouldReturnF() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('F',grade.determineLetterGrade(0));
    }
    @Test
    void fiftyNineShouldReturnF() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('F',grade.determineLetterGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('D',grade.determineLetterGrade(69));
    }
    @Test
    void seventyNineShouldReturnC() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('C',grade.determineLetterGrade(79));
    }
    @Test
    void eightyNineShouldReturnB() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('B',grade.determineLetterGrade(89));
    }
    @Test
    void ninetyNineShouldReturnA() throws illegalArgumentException {
        Grader grade = new Grader();
        assertEquals('A',grade.determineLetterGrade(99));
    }

    @Test
    void negativeOneShouldReturnIllegalExeption() throws illegalArgumentException {
        var grade = new Grader();
        // lambda expresion
        assertThrows(illegalArgumentException.class,
                      () -> {
                        grade.determineLetterGrade(-1);
                     });
    }
}