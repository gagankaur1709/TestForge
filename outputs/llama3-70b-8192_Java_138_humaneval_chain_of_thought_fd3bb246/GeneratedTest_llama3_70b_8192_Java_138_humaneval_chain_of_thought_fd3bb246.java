
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
    
    public class GeneratedTest_llama3_70b_8192_Java_138_humaneval_chain_of_thought_fd3bb246 {

    @Test
    void testIsEqualToSumEven_HappyPath() {
        Solution solution = new Solution();
        assertTrue(solution.isEqualToSumEven(8));
    }

    @Test
    void testIsEqualToSumEven_EdgeCase_OddNumber() {
        Solution solution = new Solution();
        assertFalse(solution.isEqualToSumEven(5));
    }

    @Test
    void testIsEqualToSumEven_EdgeCase_LessThan8() {
        Solution solution = new Solution();
        assertFalse(solution.isEqualToSumEven(6));
    }

    @Test
    void testIsEqualToSumEven_EdgeCase_NegativeNumber() {
        Solution solution = new Solution();
        assertFalse(solution.isEqualToSumEven(-2));
    }
}
    