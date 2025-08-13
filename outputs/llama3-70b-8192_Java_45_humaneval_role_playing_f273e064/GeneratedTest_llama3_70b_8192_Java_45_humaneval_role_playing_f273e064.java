
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
    Given length of a side and high return area for a triangle.
    >>> triangleArea(5, 3)
    7.5
     */
    public double triangleArea(double a, double h) {

            return a * h / 2;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_45_humaneval_role_playing_f273e064 {

    @Test
    void should_ReturnZero_When_BothSidesAreZero() {
        Solution solution = new Solution();
        double result = solution.triangleArea(0, 0);
        assertEquals(0, result, 0.01);
    }

    @Test
    void should_ReturnArea_When_BothSidesArePositive() {
        Solution solution = new Solution();
        double result = solution.triangleArea(5, 3);
        assertEquals(7.5, result, 0.01);
    }

    @Test
    void should_ReturnArea_When_OneSideIsZero() {
        Solution solution = new Solution();
        double result = solution.triangleArea(5, 0);
        assertEquals(0, result, 0.01);
    }

    @Test
    void should_ReturnArea_When_OneSideIsNegative() {
        Solution solution = new Solution();
        double result = solution.triangleArea(-5, 3);
        assertEquals(-7.5, result, 0.01);
    }

    @Test
    void should_ReturnArea_When_BothSidesAreNegative() {
        Solution solution = new Solution();
        double result = solution.triangleArea(-5, -3);
        assertEquals(7.5, result, 0.01);
    }
}
    