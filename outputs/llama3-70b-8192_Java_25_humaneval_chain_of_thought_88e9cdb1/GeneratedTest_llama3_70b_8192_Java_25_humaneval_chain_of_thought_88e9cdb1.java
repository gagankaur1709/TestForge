
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
    
    public class GeneratedTest_llama3_70b_8192_Java_25_humaneval_chain_of_thought_88e9cdb1 {

    @Test
    void testFactorizeHappyPath() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2, 2, 2);
        List<Integer> actual = solution.factorize(8);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorizeEdgeCaseSmallPrime() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = solution.factorize(25);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorizeEdgeCaseLargeComposite() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList(2, 5, 7);
        List<Integer> actual = solution.factorize(70);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorizeEdgeCaseOne() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = solution.factorize(1);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorizeEdgeCaseZero() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = solution.factorize(0);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorizeEdgeCaseNegative() {
        Solution solution = new Solution();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = solution.factorize(-5);
        assertEquals(expected, actual);
    }
}
    