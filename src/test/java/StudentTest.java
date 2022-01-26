import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void newStudentTest() {
        Student student1 = new Student(1,"student1");
        Assert.assertEquals("student1", student1.getName());
        Assert.assertEquals(1, student1.getId());
        Assert.assertTrue(student1.getGrades().isEmpty());
    }

    @Test
    public void addGradeTest() {
        Student student1 = new Student(1, "student1");
        Assert.assertTrue(student1.getGrades().isEmpty());
        student1.addGrade(84);
//        Assert.assertFalse(student1.getGrades().isEmpty()); generic way doing it
        Assert.assertSame(84, student1.getGrades().get(0));
    }

    @Test
    public void gradeAverageTest() {
        Student student1 = new Student(1, "student1");
        student1.addGrade(87);
        student1.addGrade(79);
        student1.addGrade(90);
        Assert.assertEquals(83.5, student1.getGradeAverage(), 0);
    }


}
