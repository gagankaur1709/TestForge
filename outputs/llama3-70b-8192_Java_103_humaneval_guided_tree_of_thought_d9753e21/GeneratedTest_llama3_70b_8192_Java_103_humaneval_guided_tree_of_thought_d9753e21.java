
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
    
    public class GeneratedTest_llama3_70b_8192_Java_103_humaneval_guided_tree_of_thought_d9753e21 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testRoundedAvgHappyPath() {
        assertEquals("11", solution.roundedAvg(1, 5));
    }

    @Test
    void testRoundedAvgEdgeCaseSmallNumbers() {
        assertEquals("0", solution.roundedAvg(1, 1));
    }

    @Test
    void testRoundedAvgEdgeCaseLargeNumbers() {
        assertEquals("11111", solution.roundedAvg(1000, 2000));
    }

    @Test
    void testRoundedAvgNegativePathNGreaterThanM() {
        assertEquals(-1, solution.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvgEdgeCaseEqualNumbers() {
        assertEquals("1", solution.roundedAvg(10, 10));
    }
}
    