
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
    You are given a positive integer n. You have to create an integer array a of length n.
        For each i (1 <= i <= n), the value of a[i] = i * i - i + 1.
        Return the number of triples (a[i], a[j], a[k]) of a where i < j < k,
    and a[i] + a[j] + a[k] is a multiple of 3.

    Example :
        Input: n = 5
        Output: 1
        Explanation:
        a = [1, 3, 7, 13, 21]
        The only valid triple is (1, 7, 13).
     */
    public int getMaxTriples(int n) {

            List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            A.add(i * i - i + 1);
        }
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                for (int k = j + 1; k < A.size(); k++) {
                    if ((A.get(i) + A.get(j) + A.get(k)) % 3 == 0) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_147_humaneval_role_playing_e58c7367 {

    @Test
    void shouldReturnZeroWhenNIsOne() {
        Solution solution = new Solution();
        assertEquals(0, solution.getMaxTriples(1));
    }

    @Test
    void shouldReturnOneWhenNIsFive() {
        Solution solution = new Solution();
        assertEquals(1, solution.getMaxTriples(5));
    }

    @Test
    void shouldReturnZeroWhenNIsTwo() {
        Solution solution = new Solution();
        assertEquals(0, solution.getMaxTriples(2));
    }

    @Test
    void shouldReturnThreeWhenNIsSix() {
        Solution solution = new Solution();
        assertEquals(3, solution.getMaxTriples(6));
    }

    @Test
    void shouldReturnZeroWhenNIsZero() {
        Solution solution = new Solution();
        assertEquals(0, solution.getMaxTriples(0));
    }

    @Test
    void shouldReturnZeroWhenNIsNegative() {
        Solution solution = new Solution();
        assertEquals(0, solution.getMaxTriples(-1));
    }
}
    