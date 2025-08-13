
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
    
    public class GeneratedTest_llama3_70b_8192_Java_83_humaneval_role_playing_88f60420 {

    @Test
    void shouldReturn1_WhenNIs1() {
        Solution solution = new Solution();
        int result = solution.startsOneEnds(1);
        assertEquals(1, result);
    }

    @Test
    void shouldReturn18_WhenNIs2() {
        Solution solution = new Solution();
        int result = solution.startsOneEnds(2);
        assertEquals(18, result);
    }

    @Test
    void shouldReturn180_WhenNIs3() {
        Solution solution = new Solution();
        int result = solution.startsOneEnds(3);
        assertEquals(180, result);
    }

    @Test
    void shouldReturn1800_WhenNIs4() {
        Solution solution = new Solution();
        int result = solution.startsOneEnds(4);
        assertEquals(1800, result);
    }

    @Test
    void shouldReturn18000_WhenNIs5() {
        Solution solution = new Solution();
        int result = solution.startsOneEnds(5);
        assertEquals(18000, result);
    }
}
    