
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
    Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
     */
    public List<Integer> factorize(int n) {

            List<Integer> fact = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return fact;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_25_humaneval_guided_tree_of_thought_f1ecdbf2 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFactorize_8() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, solution.factorize(8));
    }

    @Test
    void testFactorize_25() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(5);
        assertEquals(expected, solution.factorize(25));
    }

    @Test
    void testFactorize_70() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, solution.factorize(70));
    }

    @Test
    void testFactorize_1() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.factorize(1));
    }

    @Test
    void testFactorize_2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected, solution.factorize(2));
    }

    @Test
    void testFactorize_3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        assertEquals(expected, solution.factorize(3));
    }
}
    