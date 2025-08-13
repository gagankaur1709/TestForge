
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
    Implement a function that takes an non-negative integer and returns an array of the first n
    integers that are prime numbers and less than n.
    for example:
    countUpTo(5) => [2,3]
    countUpTo(11) => [2,3,5,7]
    countUpTo(0) => []
    countUpTo(20) => [2,3,5,7,11,13,17,19]
    countUpTo(1) => []
    countUpTo(18) => [2,3,5,7,11,13,17]
     */
    public List<Integer> countUpTo(int n) {

            List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean is_prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_96_humaneval_constraint_based_5c536c58 {
    @Test
    void testCountUpTo_HappyPath() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19));
        List<Integer> actual = solution.countUpTo(20);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testCountUpTo_EdgeCase_Zero() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.countUpTo(0);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testCountUpTo_EdgeCase_One() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.countUpTo(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testCountUpTo_EdgeCase_SmallPrime() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(2));
        List<Integer> actual = solution.countUpTo(3);
        assertIterableEquals(expected, actual);
    }
}
    