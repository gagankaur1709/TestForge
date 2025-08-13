
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
    Complete the function that takes two integers and returns
    the product of their unit digits.
    Assume the input is always valid.
    Examples:
    multiply(148, 412) should return 16.
    multiply(19, 28) should return 72.
    multiply(2020, 1851) should return 0.
    multiply(14,-15) should return 20.
     */
    public int multiply(int a, int b) {

            return Math.abs(a % 10) * Math.abs(b % 10);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_97_humaneval_constraint_based_ae1803fb {

    @Test
    void testMultiplyHappyPath() {
        Solution solution = new Solution();
        assertEquals(16, solution.multiply(148, 412));
    }

    @Test
    void testMultiplyEdgeCaseZero() {
        Solution solution = new Solution();
        assertEquals(0, solution.multiply(2020, 1851));
    }

    @Test
    void testMultiplyEdgeCaseNegative() {
        Solution solution = new Solution();
        assertEquals(20, solution.multiply(14, -15));
    }

    @Test
    void testMultiplyEdgeCaseSingleDigit() {
        Solution solution = new Solution();
        assertEquals(9, solution.multiply(9, 9));
    }
}
    