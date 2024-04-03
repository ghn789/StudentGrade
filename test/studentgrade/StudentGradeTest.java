package studentgrade;

import org.junit.Test;
import static org.junit.Assert.*;

/* JUnit 4.13.2 */
public class StudentGradeTest {

    @Test
    public void getGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    @Test
    public void getGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    public void getGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
