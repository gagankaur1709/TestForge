
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
    Given a positive integer n, return the count of the numbers of n-digit
    positive integers that start or end with 1.
     */
    public int startsOneEnds(int n) {

            if (n == 1) {
            return 1;
        }
        return 18 * (int) Math.pow(10, n - 2);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_83_humaneval_chain_of_thought_a644e32d {

    @Test
    void testStartsOneEnds_HappyPath() {
        Solution solution = new Solution();
        assertEquals(1, solution.startsOneEnds(1));
    }

    @Test
    void testStartsOneEnds_EdgeCase_SmallNumber() {
        Solution solution = new Solution();
        assertEquals(18, solution.startsOneEnds(2));
    }

    @Test
    void testStartsOneEnds_EdgeCase_LargeNumber() {
        Solution solution = new Solution();
        assertEquals(180000000, solution.startsOneEnds(8));
    }

    @Test
    void testStartsOneEnds_EdgeCase_BoundaryValue() {
        Solution solution = new Solution();
        assertEquals(1800, solution.startsOneEnds(3));
    }
}
    