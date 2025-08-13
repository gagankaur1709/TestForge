
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
    
    public class GeneratedTest_llama3_70b_8192_Java_71_humaneval_role_playing_937bde84 {

    @Test
    void should_return_area_when_valid_triangle() {
        Solution solution = new Solution();
        assertEquals(6.00, solution.triangleArea(3, 4, 5));
    }

    @Test
    void should_return_minus_one_when_invalid_triangle() {
        Solution solution = new Solution();
        assertEquals(-1, solution.triangleArea(1, 2, 10));
    }

    @Test
    void should_return_minus_one_when_a_plus_b_equals_c() {
        Solution solution = new Solution();
        assertEquals(-1, solution.triangleArea(3, 4, 7));
    }

    @Test
    void should_return_minus_one_when_a_plus_c_equals_b() {
        Solution solution = new Solution();
        assertEquals(-1, solution.triangleArea(3, 7, 4));
    }

    @Test
    void should_return_minus_one_when_b_plus_c_equals_a() {
        Solution solution = new Solution();
        assertEquals(-1, solution.triangleArea(7, 3, 4));
    }

    @Test
    void should_return_area_when_a_equals_b_equals_c() {
        Solution solution = new Solution();
        assertEquals(10.82, solution.triangleArea(10, 10, 10));
    }

    @Test
    void should_return_area_when_a_is_close_to_b_plus_c() {
        Solution solution = new Solution();
        assertEquals(0.00, solution.triangleArea(10, 9, 1));
    }

    @Test
    void should_return_area_when_b_is_close_to_a_plus_c() {
        Solution solution = new Solution();
        assertEquals(0.00, solution.triangleArea(10, 1, 9));
    }

    @Test
    void should_return_area_when_c_is_close_to_a_plus_b() {
        Solution solution = new Solution();
        assertEquals(0.00, solution.triangleArea(1, 10, 9));
    }
}
    