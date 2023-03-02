import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

@RunWith(JUnit4.class) public class ExampleVintageTests {

    @Before
    public void setUp(){
        //Any required setup goes here
    }

    @Test
    public void addTest(){
        assertEquals(ExampleClass.add(2,2),4);
    }

    //Set-up to test what your expected exception message is
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test(expected=IllegalArgumentException.class)
    public void checkSubExceptionMessage(){
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Integers should be greater than 0");
        ExampleClass.subtract(-5, -20);
    }

    @Test
    public void evenTest(){
        assertTrue(ExampleClass.isEven(8));
        assertFalse(ExampleClass.isEven(9));
    }

    @After
    public void tearDown(){
        //Any required teardown goes here.
    }
}