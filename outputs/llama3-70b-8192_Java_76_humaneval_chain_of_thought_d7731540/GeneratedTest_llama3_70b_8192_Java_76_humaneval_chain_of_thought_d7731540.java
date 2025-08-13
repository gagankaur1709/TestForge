
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
    Your task is to write a function that returns true if a number x is a simple
    power of n and false in other cases.
    x is a simple power of n if n**int=x
    For example:
    isSimplePower(1, 4) => true
    isSimplePower(2, 2) => true
    isSimplePower(8, 2) => true
    isSimplePower(3, 2) => false
    isSimplePower(3, 1) => false
    isSimplePower(5, 3) => false
     */
    public boolean isSimplePower(int x, int n) {

            if (n == 1) {
            return x == 1;
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return power == x;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_76_humaneval_chain_of_thought_d7731540 {

    @Test
    void testIsSimplePower_HappyPath() {
        Solution solution = new Solution();
        assertTrue(solution.isSimplePower(1, 4));
        assertTrue(solution.isSimplePower(2, 2));
        assertTrue(solution.isSimplePower(8, 2));
    }

    @Test
    void testIsSimplePower_EdgeCase_NegativeX() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(-1, 4));
        assertFalse(solution.isSimplePower(-2, 2));
        assertFalse(solution.isSimplePower(-8, 2));
    }

    @Test
    void testIsSimplePower_EdgeCase_NegativeN() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(1, -4));
        assertFalse(solution.isSimplePower(2, -2));
        assertFalse(solution.isSimplePower(8, -2));
    }

    @Test
    void testIsSimplePower_EdgeCase_XEqualsN() {
        Solution solution = new Solution();
        assertTrue(solution.isSimplePower(1, 1));
        assertTrue(solution.isSimplePower(2, 2));
        assertTrue(solution.isSimplePower(8, 8));
    }

    @Test
    void testIsSimplePower_EdgeCase_XNotPowerOfN() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(3, 2));
        assertFalse(solution.isSimplePower(5, 3));
        assertFalse(solution.isSimplePower(7, 4));
    }
}
    