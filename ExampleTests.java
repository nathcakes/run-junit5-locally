import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTests {
    @BeforeEach
    void setUp(){
        //Any required setup goes here
    }

    @Test
    @DisplayName("Checking 2+2 is 4")
    void addTest(){
        assertEquals(4,ExampleClass.add(2,2));
    }

    @Test
    @DisplayName("Checking subtraction throws")
    void subTest(){
        assertEquals(2,ExampleClass.subtract(4,2));
        //You can just do an assertThrows, but if you store it in an exception, you can also check the error message
        Exception subEx = assertThrows(IllegalArgumentException.class,() -> {ExampleClass.subtract(-5,-20);});
        assertEquals("Integers should be greater than 0",subEx.getMessage());
    }

    @Test
    @DisplayName("Checking even function")
    void evenTest(){
        assertTrue(ExampleClass.isEven(8));
        assertFalse(ExampleClass.isEven(9));
    }

    @AfterEach
    void tearDown(){
        //Any required teardown goes here.
    }

}
