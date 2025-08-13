
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
    
    public class GeneratedTest_llama3_70b_8192_Java_138_humaneval_guided_tree_of_thought_20fdb15f {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testEqualToSumEven_Four() {
        assertFalse(solution.isEqualToSumEven(4));
    }

    @Test
    void testEqualToSumEven_Six() {
        assertFalse(solution.isEqualToSumEven(6));
    }

    @Test
    void testEqualToSumEven_Eight() {
        assertTrue(solution.isEqualToSumEven(8));
    }

    @Test
    void testEqualToSumEven_Ten() {
        assertTrue(solution.isEqualToSumEven(10));
    }

    @Test
    void testEqualToSumEven_Negative() {
        assertFalse(solution.isEqualToSumEven(-2));
    }

    @Test
    void testEqualToSumEven_Zero() {
        assertFalse(solution.isEqualToSumEven(0));
    }

    @Test
    void testEqualToSumEven_One() {
        assertFalse(solution.isEqualToSumEven(1));
    }

    @Test
    void testEqualToSumEven_Three() {
        assertFalse(solution.isEqualToSumEven(3));
    }

    @Test
    void testEqualToSumEven_Seven() {
        assertFalse(solution.isEqualToSumEven(7));
    }
}
    