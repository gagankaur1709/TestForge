
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
    Given length of a side and high return area for a triangle.
    >>> triangleArea(5, 3)
    7.5
     */
    public double triangleArea(double a, double h) {

            return a * h / 2;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_45_humaneval_guided_tree_of_thought_e72cd10f {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testTriangleArea_HappyPath() {
        double a = 5;
        double h = 3;
        double expectedArea = 7.5;
        double actualArea = solution.triangleArea(a, h);
        assertEquals(expectedArea, actualArea, 0.01);
    }

    @Test
    void testTriangleArea_ZeroHeight() {
        double a = 5;
        double h = 0;
        double expectedArea = 0;
        double actualArea = solution.triangleArea(a, h);
        assertEquals(expectedArea, actualArea, 0.01);
    }

    @Test
    void testTriangleArea_ZeroBase() {
        double a = 0;
        double h = 3;
        double expectedArea = 0;
        double actualArea = solution.triangleArea(a, h);
        assertEquals(expectedArea, actualArea, 0.01);
    }

    @Test
    void testTriangleArea_NegativeBase() {
        double a = -5;
        double h = 3;
        double expectedArea = -7.5;
        double actualArea = solution.triangleArea(a, h);
        assertEquals(expectedArea, actualArea, 0.01);
    }

    @Test
    void testTriangleArea_NegativeHeight() {
        double a = 5;
        double h = -3;
        double expectedArea = -7.5;
        double actualArea = solution.triangleArea(a, h);
        assertEquals(expectedArea, actualArea, 0.01);
    }
}
    