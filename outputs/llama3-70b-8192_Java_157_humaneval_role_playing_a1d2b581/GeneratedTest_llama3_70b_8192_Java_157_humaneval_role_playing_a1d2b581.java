
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
    Given the lengths of the three sides of a triangle. Return true if the three
    sides form a right-angled triangle, false otherwise.
    A right-angled triangle is a triangle in which one angle is right angle or
    90 degree.
    Example:
    rightAngleTriangle(3, 4, 5) == true
    rightAngleTriangle(1, 2, 3) == false
     */
    public boolean rightAngleTriangle(int a, int b, int c) {

            return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_157_humaneval_role_playing_a1d2b581 {

    @Test
    void should_return_true_when_given_a_right_angled_triangle() {
        Solution solution = new Solution();
        assertTrue(solution.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void should_return_false_when_given_a_non_right_angled_triangle() {
        Solution solution = new Solution();
        assertFalse(solution.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void should_return_true_when_given_a_right_angled_triangle_with_permuted_sides() {
        Solution solution = new Solution();
        assertTrue(solution.rightAngleTriangle(5, 3, 4));
        assertTrue(solution.rightAngleTriangle(4, 5, 3));
        assertTrue(solution.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void should_return_false_when_given_a_non_right_angled_triangle_with_permuted_sides() {
        Solution solution = new Solution();
        assertFalse(solution.rightAngleTriangle(3, 1, 2));
        assertFalse(solution.rightAngleTriangle(1, 3, 2));
        assertFalse(solution.rightAngleTriangle(2, 1, 3));
    }

    @Test
    void should_return_true_when_given_a_right_angled_triangle_with_zero_length_sides() {
        Solution solution = new Solution();
        assertTrue(solution.rightAngleTriangle(0, 0, 0));
    }

    @Test
    void should_return_false_when_given_a_non_right_angled_triangle_with_negative_length_sides() {
        Solution solution = new Solution();
        assertFalse(solution.rightAngleTriangle(-1, 2, 3));
        assertFalse(solution.rightAngleTriangle(1, -2, 3));
        assertFalse(solution.rightAngleTriangle(1, 2, -3));
    }
}
    