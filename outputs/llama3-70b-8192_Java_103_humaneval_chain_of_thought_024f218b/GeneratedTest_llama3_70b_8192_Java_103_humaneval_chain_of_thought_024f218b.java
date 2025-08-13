
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
    You are given two positive integers n and m, and your task is to compute the
    average of the integers from n through m (including n and m).
    Round the answer to the nearest integer and convert that to binary.
    If n is greater than m, return -1.
    Example:
    roundedAvg(1, 5) => "11"
    roundedAvg(7, 5) => -1
    roundedAvg(10, 20) => "1111"
    roundedAvg(20, 33) => "11011"
     */
    public Object roundedAvg(int n, int m) {

            if (n > m) {
            return -1;
        }
        return Integer.toBinaryString((int) Math.round((double) (m + n) / 2));
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_103_humaneval_chain_of_thought_024f218b {
    @Test
    void testRoundedAvg_HappyPath() {
        Solution solution = new Solution();
        assertEquals("11", solution.roundedAvg(1, 5));
    }

    @Test
    void testRoundedAvg_EdgeCase_N_GreaterThan_M() {
        Solution solution = new Solution();
        assertEquals(-1, solution.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvg_EdgeCase_LargeNumbers() {
        Solution solution = new Solution();
        assertEquals("11011", solution.roundedAvg(20, 33));
    }

    @Test
    void testRoundedAvg_EdgeCase_SameNumbers() {
        Solution solution = new Solution();
        assertEquals("1", solution.roundedAvg(10, 10));
    }
}
    