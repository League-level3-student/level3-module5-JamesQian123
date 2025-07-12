package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(16, RecursionMath.recursiveMultiplication(4, 4));
        assertEquals(67, RecursionMath.recursiveMultiplication(67,1));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(67, RecursionMath.recursiveDivision(67, 1));
    	assertEquals(345, RecursionMath.recursiveDivision(19320, 56));
        
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(8, RecursionMath.recursivePower(2, 3));
        assertEquals(81, RecursionMath.recursivePower(9,2));
        assertEquals(67, RecursionMath.recursivePower(67,1));
    }
}
