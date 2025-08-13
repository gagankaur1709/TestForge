
    import java.lang.*;
import java.util.*;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_71_humaneval_chain_of_thought_ad1794e7 {
    @Test
    void testTriangleArea_HappyPath() {
        Solution solution = new Solution();
        double result = solution.triangleArea(3, 4, 5);
        assertEquals(6.00, result);
    }

    @Test
    void testTriangleArea_InvalidTriangle() {
        Solution solution = new Solution();
        double result = solution.triangleArea(1, 2, 10);
        assertEquals(-1, result);
    }

    @Test
    void testTriangleArea_EqualSides() {
        Solution solution = new Solution();
        double result = solution.triangleArea(5, 5, 5);
        assertEquals(10.83, result);
    }

    @Test
    void testTriangleArea_NearlyEqualSides() {
        Solution solution = new Solution();
        double result = solution.triangleArea(5, 5, 4.99);
        assertEquals(12.49, result);
    }

    @Test
    void testTriangleArea_ZeroSide() {
        Solution solution = new Solution();
        double result = solution.triangleArea(0, 4, 5);
        assertEquals(-1, result);
    }

    @Test
    void testTriangleArea_NegativeSide() {
        Solution solution = new Solution();
        double result = solution.triangleArea(-1, 4, 5);
        assertEquals(-1, result);
    }
}
    