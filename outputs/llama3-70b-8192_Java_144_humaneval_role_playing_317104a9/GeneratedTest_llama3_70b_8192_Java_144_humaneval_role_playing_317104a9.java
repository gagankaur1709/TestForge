
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
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
    Your task is to implement a function that will simplify the expression
    x * n. The function returns true if x * n evaluates to a whole number and false
    otherwise. Both x and n, are string representation of a fraction, and have the following format,
    <numerator>/<denominator> where both numerator and denominator are positive whole numbers.

    You can assume that x, and n are valid fractions, and do not have zero as denominator.

    simplify("1/5", "5/1") = true
    simplify("1/6", "2/1") = false
    simplify("7/10", "10/2") = false
     */
    public boolean simplify(String x, String n) {

            String[] a = x.split("/");
        String[] b = n.split("/");
        int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
        int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
        return numerator / denom * denom == numerator;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_144_humaneval_role_playing_317104a9 {

    @Test
    @DisplayName("should return true when x * n evaluates to a whole number")
    void should_return_true_when_x_times_n_evaluates_to_a_whole_number() {
        Solution solution = new Solution();
        assertTrue(solution.simplify("1/5", "5/1"));
    }

    @Test
    @DisplayName("should return false when x * n does not evaluate to a whole number")
    void should_return_false_when_x_times_n_does_not_evaluate_to_a_whole_number() {
        Solution solution = new Solution();
        assertFalse(solution.simplify("1/6", "2/1"));
    }

    @Test
    @DisplayName("should return false when x * n does not evaluate to a whole number with different denominators")
    void should_return_false_when_x_times_n_does_not_evaluate_to_a_whole_number_with_different_denominators() {
        Solution solution = new Solution();
        assertFalse(solution.simplify("7/10", "10/2"));
    }

    @Test
    @DisplayName("should return true when x * n evaluates to a whole number with same denominators")
    void should_return_true_when_x_times_n_evaluates_to_a_whole_number_with_same_denominators() {
        Solution solution = new Solution();
        assertTrue(solution.simplify("2/4", "4/2"));
    }

    @Test
    @DisplayName("should return true when x * n evaluates to a whole number with numerator and denominator as 1")
    void should_return_true_when_x_times_n_evaluates_to_a_whole_number_with_numerator_and_denominator_as_1() {
        Solution solution = new Solution();
        assertTrue(solution.simplify("1/1", "1/1"));
    }
}
    