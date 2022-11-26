package Testing;

public class Grader {
    public char determineLetterGrade(int numberGrade) throws illegalArgumentException {
        if (numberGrade < 0){
            throw new illegalArgumentException("Number grade cannot be les tan 0");
        }
        else if (numberGrade <60) {
            return 'F';
        }
        else if (numberGrade <70 ) {
            return 'D';
        }
        else if (numberGrade < 80) {
            return 'C';
        }
        else if (numberGrade <90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
