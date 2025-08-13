
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
    Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    Example
    isEqualToSumEven(4) == false
    isEqualToSumEven(6) == false
    isEqualToSumEven(8) == true
     */
    public boolean isEqualToSumEven(int n) {

            return n % 2 == 0 && n >= 8;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_138_humaneval_constraint_based_c1e7442a {
    private Solution solution = new Solution();

    @Test
    void testIsEqualToSumEven_HappyPath() {
        assertTrue(solution.isEqualToSumEven(8));
        assertTrue(solution.isEqualToSumEven(12));
        assertTrue(solution.isEqualToSumEven(20));
    }

    @Test
    void testIsEqualToSumEven_EdgeCase_OddNumber() {
        assertFalse(solution.isEqualToSumEven(5));
        assertFalse(solution.isEqualToSumEven(7));
        assertFalse(solution.isEqualToSumEven(11));
    }

    @Test
    void testIsEqualToSumEven_EdgeCase_LessThan8() {
        assertFalse(solution.isEqualToSumEven(4));
        assertFalse(solution.isEqualToSumEven(6));
        assertFalse(solution.isEqualToSumEven(2));
    }
}
    