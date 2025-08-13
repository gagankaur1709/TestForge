
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
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
    Return true if a given number is prime, and false otherwise.
    >>> isPrime(6)
    false
    >>> isPrime(101)
    true
    >>> isPrime(11)
    true
    >>> isPrime(13441)
    true
    >>> isPrime(61)
    true
    >>> isPrime(4)
    false
    >>> isPrime(1)
    false
     */
    public boolean isPrime(int n) {

            if (n < 2) {
            return false;
        }
        for (int k = 2; k < n; k++) {
            if (n % k == 0) {
                return false;
            }
        }
         return true;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_31_humaneval_constraint_based_31dacfc1 {

    private Solution solution = new Solution();

    @Test
    @DisplayName("Test isPrime with prime number")
    void testIsPrime_PrimeNumber() {
        assertTrue(solution.isPrime(101));
    }

    @Test
    @DisplayName("Test isPrime with composite number")
    void testIsPrime_CompositeNumber() {
        assertFalse(solution.isPrime(6));
    }

    @Test
    @DisplayName("Test isPrime with 1")
    void testIsPrime_One() {
        assertFalse(solution.isPrime(1));
    }

    @Test
    @DisplayName("Test isPrime with 2")
    void testIsPrime_Two() {
        assertTrue(solution.isPrime(2));
    }

    @Test
    @DisplayName("Test isPrime with 0")
    void testIsPrime_Zero() {
        assertFalse(solution.isPrime(0));
    }

    @Test
    @DisplayName("Test isPrime with negative number")
    void testIsPrime_NegativeNumber() {
        assertFalse(solution.isPrime(-5));
    }
}
    