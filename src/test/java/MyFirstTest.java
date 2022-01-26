
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class MyFirstTest {
    //best to use one assert per test

    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }
    @Test
    public void davidIsDavid() {
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(instructor, testWriter);
    }

    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>();
        languages.add("Latin");
        names.add("Latin");

        Assert.assertEquals(languages, names);
        //checks for value
        Assert.assertSame(languages, names);
        //checks for object (check if the objects are the same (one object vs two)
        Assert.assertNotSame(languages, names);
    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void funWithPHP() {
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));
        //uses boolean expressions
        Assert.assertFalse(language.contains("J"));
        //uses boolean expressions
    }

}
