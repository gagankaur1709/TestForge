
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    
    import static org.junit.jupiter.api.Assertions.*;
    import static org.junit.jupiter.api.Assertions.assertFalse;
    import static org.junit.jupiter.api.Assertions.assertTrue;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    import static org.junit.jupiter.api.Assertions.assertNotNull;
    import static org.junit.jupiter.api.Assertions.assertNull;
    import static org.junit.jupiter.api.Assertions.assertArrayEquals;
    import org.mockito.Mockito;
    import org.mockito.junit.jupiter.MockitoExtension;
    import org.junit.jupiter.api.extension.ExtendWith;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeAll;
    
    
    import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given the lengths of the three sides of a triangle. Return the area of
    the triangle rounded to 2 decimal points if the three sides form a valid triangle.
    Otherwise return -1
    Three sides make a valid triangle when the sum of any two sides is greater
    than the third side.
    Example:
    triangleArea(3, 4, 5) == 6.00
    triangleArea(1, 2, 10) == -1
     */
    public double triangleArea(double a, double b, double c) {

            if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        area = (double) Math.round(area * 100) / 100;
        return area;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_71_humaneval_guided_tree_of_thought_1144d784 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testValidTriangle() {
        assertEquals(6.00, solution.triangleArea(3, 4, 5));
    }

    @Test
    void testInvalidTriangle() {
        assertEquals(-1, solution.triangleArea(1, 2, 10));
    }

    @Test
    void testEqualSides() {
        assertEquals(0.00, solution.triangleArea(5, 5, 5));
    }

    @Test
    void testRightTriangle() {
        assertEquals(6.00, solution.triangleArea(3, 4, 5));
    }

    @Test
    void testSmallSides() {
        assertEquals(-1, solution.triangleArea(1, 1, 3));
    }

    @Test
    void testLargeSides() {
        assertEquals(936.00, solution.triangleArea(100, 100, 100));
    }
}
    