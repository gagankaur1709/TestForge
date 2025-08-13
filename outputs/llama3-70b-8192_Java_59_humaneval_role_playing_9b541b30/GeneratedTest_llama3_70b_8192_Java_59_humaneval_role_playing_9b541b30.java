
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
    Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largestPrimeFactor(13195)
    29
    >>> largestPrimeFactor(2048)
    2
     */
    public int largestPrimeFactor(int n) {

            int largest = 1;
        for (int j = 2; j <= n; j++) {
            if (n % j == 0) {
                boolean is_prime = j >= 2;
                for (int i = 2; i < j - 1; i++) {
                    if (j % i == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) {
                    largest = Math.max(largest, j);
                }
            }
        }
        return largest;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_59_humaneval_role_playing_9b541b30 {

    @Test
    void should_return_largest_prime_factor_when_input_is_composite_number() {
        Solution solution = new Solution();
        assertEquals(29, solution.largestPrimeFactor(13195));
        assertEquals(2, solution.largestPrimeFactor(2048));
    }

    @Test
    void should_return_largest_prime_factor_when_input_is_square_of_prime_number() {
        Solution solution = new Solution();
        assertEquals(7, solution.largestPrimeFactor(49));
        assertEquals(11, solution.largestPrimeFactor(121));
    }

    @Test
    void should_return_largest_prime_factor_when_input_is_product_of_two_prime_numbers() {
        Solution solution = new Solution();
        assertEquals(3, solution.largestPrimeFactor(6));
        assertEquals(5, solution.largestPrimeFactor(10));
    }

    @Test
    void should_return_largest_prime_factor_when_input_is_product_of_more_than_two_prime_numbers() {
        Solution solution = new Solution();
        assertEquals(5, solution.largestPrimeFactor(30));
        assertEquals(7, solution.largestPrimeFactor(42));
    }

    @Test
    void should_return_largest_prime_factor_when_input_is_power_of_prime_number() {
        Solution solution = new Solution();
        assertEquals(2, solution.largestPrimeFactor(8));
        assertEquals(3, solution.largestPrimeFactor(27));
    }
}
    