
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
    
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
    Write a function that returns true if the given number is the multiplication of 3 prime numbers
    and false otherwise.
    Knowing that (a) is less then 100.
    Example:
    isMultiplyPrime(30) == true
    30 = 2 * 3 * 5
     */
    public boolean isMultiplyPrime(int a) {

            class IsPrime {
            public static boolean is_prime(int n) {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        for (int i = 2; i < 101; i++) {
            if (!IsPrime.is_prime(i)) {
                continue;
            }
            for (int j = i; j < 101; j++) {
                if (!IsPrime.is_prime(j)) {
                    continue;
                }
                for (int k = j; k < 101; k++) {
                    if (!IsPrime.is_prime(k)) {
                        continue;
                    }
                    if (i * j * k == a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_75_humaneval_guided_tree_of_thought_01d4298a {

    private Solution solution;
    private Solution.IsPrime isPrime;

    @BeforeEach
    void setup() {
        solution = new Solution();
        isPrime = mockStatic(Solution.IsPrime.class);
    }

    @Test
    void testIsMultiplyPrime_30() {
        when(Solution.IsPrime.is_prime(2)).thenReturn(true);
        when(Solution.IsPrime.is_prime(3)).thenReturn(true);
        when(Solution.IsPrime.is_prime(5)).thenReturn(true);
        assertTrue(solution.isMultiplyPrime(30));
    }

    @Test
    void testIsMultiplyPrime_12() {
        when(Solution.IsPrime.is_prime(2)).thenReturn(true);
        when(Solution.IsPrime.is_prime(2)).thenReturn(true);
        when(Solution.IsPrime.is_prime(3)).thenReturn(true);
        assertTrue(solution.isMultiplyPrime(12));
    }

    @Test
    void testIsMultiplyPrime_100() {
        assertFalse(solution.isMultiplyPrime(100));
    }

    @Test
    void testIsMultiplyPrime_1() {
        assertFalse(solution.isMultiplyPrime(1));
    }

    @Test
    void testIsMultiplyPrime_0() {
        assertFalse(solution.isMultiplyPrime(0));
    }

    @Test
    void testIsMultiplyPrime_101() {
        assertFalse(solution.isMultiplyPrime(101));
    }
}
    