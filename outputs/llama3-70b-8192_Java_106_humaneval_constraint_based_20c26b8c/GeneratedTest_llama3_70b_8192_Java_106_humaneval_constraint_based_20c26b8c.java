
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    Implement the function f that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 1.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    Example:
    f(5) == [1, 2, 6, 24, 15]
     */
    public List<Integer> f(int n) {

            List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int x = 1;
                for (int j = 1; j <= i; j++) {
                    x *= j;
                }
                ret.add(x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
                ret.add(x);
            }
        }
        return ret;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_106_humaneval_constraint_based_20c26b8c {
    private Solution solution = new Solution();

    @Test
    void testF_HappyPath() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15);
        List<Integer> actual = solution.f(5);
        assertEquals(expected, actual);
    }

    @Test
    void testF_EdgeCase_NegativeInput() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.f(-5);
        assertEquals(expected, actual);
    }

    @Test
    void testF_EdgeCase_ZeroInput() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.f(0);
        assertEquals(expected, actual);
    }
}
    