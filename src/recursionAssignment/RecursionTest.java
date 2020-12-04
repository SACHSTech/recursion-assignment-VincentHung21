package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;
import org.junit.After;
import org.junit.Before;


import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void C7Test1(){
        // make assertion statement(s)
        assertEquals(2, Recursion.count7(717));
        // assertTrue(TESTBOOLEAN);
    }
    @Test
    public void C7Test2(){
        // make assertion statement(s)
        assertEquals(5, Recursion.count7(77777));
        // assertTrue(TESTBOOLEAN);
    }
    @Test
    public void C7Test3(){
        // make assertion statement(s)
        assertEquals(0, Recursion.count7(1239823));
        // assertTrue(TESTBOOLEAN);
    }
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
