import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaBuzzTests {

    JavaBuzz javabuzz;

    @Before public void initialize(){
        javabuzz = new JavaBuzz();
    }
    @Test public void
        isDivisibleByThree() {
            assertTrue(javabuzz.isDivisibleByThree(3));
    }
    @Test public void
        isNotDivisibleByThree() {
            assertFalse(javabuzz.isDivisibleByThree(1));
    }
    @Test public void
        isDivisibleByFive() {
            assertTrue(javabuzz.isDivisibleByFive(5));
    }
    @Test public void
        isNotDivisibleByFive() {
            assertFalse(javabuzz.isDivisibleByFive(1));
    }
    @Test public void
        isDivisibleByFifteen() {
            assertTrue(javabuzz.isDivisibleByFifteen(15));
    }
    @Test public void
        isNotDivisibleByFifteen() {
            assertFalse(javabuzz.isDivisibleByFifteen(1));
    }

    @Test public void thisNumber(){
        assertEquals("java",javabuzz.thisNumber(3));
        assertEquals("buzz",javabuzz.thisNumber(5));
        assertEquals("javabuzz",javabuzz.thisNumber(15));
        assertEquals("1",javabuzz.thisNumber(1));
    }


}