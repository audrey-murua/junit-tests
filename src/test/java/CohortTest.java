import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {

        Student dwight;
        Student jim;
        Cohort theOffice;


        @Before
        public void setUpCohort() {
            dwight = new Student(1, "Dwight");
            jim = new Student(2, "Jim");
            theOffice = new Cohort();
            theOffice.addStudent(dwight);
            theOffice.addStudent(jim);
            dwight.addGrade(88);
            dwight.addGrade(100);
            dwight.addGrade(84);
            dwight.addGrade(82);
            jim.addGrade(100);
            jim.addGrade(100);
            jim.addGrade(96);
            jim.addGrade(98);
        }

        @Test
        public void addStudent() {

            Assert.assertEquals(this.dwight, theOffice.getStudents().get(0));
            Assert.assertEquals(this.jim, theOffice.getStudents().get(1));
        }

        @Test
        public void getStudents() {
            Assert.assertEquals(2, theOffice.getStudents().size());
            Assert.assertEquals(this.dwight, theOffice.getStudents().get(0));
            Assert.assertEquals(this.jim, theOffice.getStudents().get(1));
        }

        @Test
        public void cohortAverage() {

            Assert.assertEquals(93.5, this.theOffice.getCohortAverage(),0);
        }



}
