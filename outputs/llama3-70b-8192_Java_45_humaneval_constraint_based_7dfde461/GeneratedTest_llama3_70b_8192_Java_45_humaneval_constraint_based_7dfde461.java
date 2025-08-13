
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
    
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
    Given length of a side and high return area for a triangle.
    >>> triangleArea(5, 3)
    7.5
     */
    public double triangleArea(double a, double h) {

            return a * h / 2;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_45_humaneval_constraint_based_7dfde461 {
    @InjectMocks
    private Solution solution;

    @Test
    void testTriangleArea_HappyPath() {
        double a = 5.0;
        double h = 3.0;
        double expectedResult = 7.5;
        double result = solution.triangleArea(a, h);
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    void testTriangleArea_EdgeCase_ZeroHeight() {
        double a = 5.0;
        double h = 0.0;
        double expectedResult = 0.0;
        double result = solution.triangleArea(a, h);
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    void testTriangleArea_EdgeCase_NegativeSide() {
        double a = -5.0;
        double h = 3.0;
        double expectedResult = -7.5;
        double result = solution.triangleArea(a, h);
        assertEquals(expectedResult, result, 0.01);
    }
}
    