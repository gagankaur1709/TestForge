
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
    
    public class GeneratedTest_llama3_70b_8192_Java_155_humaneval_chain_of_thought_3bc93a57 {
    private Solution solution = new Solution();

    @Test
    void testEvenOddCount_HappyPath() {
        List<Integer> result = solution.evenOddCount(123);
        assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    void testEvenOddCount_NegativeNumber() {
        List<Integer> result = solution.evenOddCount(-12);
        assertEquals(Arrays.asList(1, 1), result);
    }

    @Test
    void testEvenOddCount_SingleDigit() {
        List<Integer> result = solution.evenOddCount(5);
        assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void testEvenOddCount_Zero() {
        List<Integer> result = solution.evenOddCount(0);
        assertEquals(Arrays.asList(1, 0), result);
    }
}
    