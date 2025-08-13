
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
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
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generateIntegers(2, 8) => [2, 4, 6, 8]
    generateIntegers(8, 2) => [2, 4, 6, 8]
    generateIntegers(10, 14) => []
     */
    public List<Integer> generateIntegers(int a, int b) {

            int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));

        List<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i += 2) {
            result.add(i);
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_163_humaneval_chain_of_thought_07d621c9 {

    @Test
    void testGenerateIntegers_HappyPath() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = solution.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_SwappedInput() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = solution.generateIntegers(8, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_OutOfRange() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.generateIntegers(10, 14);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_LowerBound() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = solution.generateIntegers(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_UpperBound() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = solution.generateIntegers(2, 9);
        assertEquals(expected, actual);
    }
}
    