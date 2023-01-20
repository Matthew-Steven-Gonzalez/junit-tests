import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort testCohort;

    private Student dave;
    private Student gary;
    private Student denise;
    private Student shondra;
    private Student romona;

    @Before
    public void setUp(){
        this.testCohort = new Cohort();
        this.dave = new Student(3, "Dave");
        this.gary = new Student(4, "Gary");
        this.denise = new Student(5, "Denise");
        this.shondra = new Student(6, "Shondra");
        this.romona = new Student(2, "Romona");
        dave.addGrade(80);
        dave.addGrade(70);
        gary.addGrade(50);
        gary.addGrade(90);
        denise.addGrade(100);
        denise.addGrade(100);
        shondra.addGrade(88);
        shondra.addGrade(89);
        romona.addGrade(66);
        romona.addGrade(100);
        testCohort.addStudent(dave);
        testCohort.addStudent(gary);
        testCohort.addStudent(denise);
        testCohort.addStudent(shondra);
        testCohort.addStudent(romona);


    }

    @Test
    public void testAddAStudentToList(){
        assertEquals(testCohort.getStudents().get(0).getName(),"Dave");
    }
//ask for clarification
    @Test
    public void testGetList(){
        List<Student> testerList = this.testCohort.getStudents();

        assertEquals(testerList,this.testCohort.getStudents());

    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(this.testCohort.getCohortAverage(),83.3,1e-15);
    }


}
