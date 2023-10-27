package study.TDD.John;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }
    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));

    }

    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void eightyShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void seventyShouldReturnC() {
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void zeroNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });
    }

}