
    import java.lang.*;
import java.util.*;
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
    Given an integer. return a tuple that has the number of even and odd digits respectively.
    
     Example:
        evenOddCount(-12) ==> (1, 1)
        evenOddCount(123) ==> (1, 2)
     */
    public List<Integer> evenOddCount(int num) {

            int even_count = 0, odd_count = 0;
        for (char i : String.valueOf(Math.abs(num)).toCharArray()) {
            if ((i - '0') % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
        }
        return Arrays.asList(even_count, odd_count);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_155_humaneval_constraint_based_7b415583 {
    @Test
    void testEvenOddCount_HappyPath() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddCount(123);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void testEvenOddCount_EdgeCase_Zero() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddCount(0);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEvenOddCount_EdgeCase_SingleDigit() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddCount(5);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }
}
    