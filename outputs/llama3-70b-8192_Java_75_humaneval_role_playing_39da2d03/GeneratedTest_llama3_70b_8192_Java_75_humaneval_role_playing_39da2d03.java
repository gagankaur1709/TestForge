
    import java.lang.*;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
    
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
    
    class GeneratedTest_llama3_70b_8192_Java_75_humaneval_role_playing_39da2d03 {

    @Test
    void should_ReturnTrue_When_GivenNumberIsMultiplicationOfThreePrimeNumbers() {
        Solution solution = new Solution();
        assertTrue(solution.isMultiplyPrime(30));
    }

    @Test
    void should_ReturnFalse_When_GivenNumberIsNotMultiplicationOfThreePrimeNumbers() {
        Solution solution = new Solution();
        assertFalse(solution.isMultiplyPrime(100));
    }

    @ParameterizedTest
    @MethodSource("provideMultiplicationOfThreePrimeNumbers")
    void should_ReturnTrue_When_GivenNumberIsMultiplicationOfThreePrimeNumbers(int number) {
        Solution solution = new Solution();
        assertTrue(solution.isMultiplyPrime(number));
    }

    private static Stream<Arguments> provideMultiplicationOfThreePrimeNumbers() {
        return Stream.of(
                Arguments.of(2 * 3 * 5),
                Arguments.of(2 * 3 * 11),
                Arguments.of(2 * 5 * 7),
                Arguments.of(3 * 3 * 5),
                Arguments.of(3 * 5 * 7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNotMultiplicationOfThreePrimeNumbers")
    void should_ReturnFalse_When_GivenNumberIsNotMultiplicationOfThreePrimeNumbers(int number) {
        Solution solution = new Solution();
        assertFalse(solution.isMultiplyPrime(number));
    }

    private static Stream<Arguments> provideNotMultiplicationOfThreePrimeNumbers() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(4),
                Arguments.of(6),
                Arguments.of(8),
                Arguments.of(9)
        );
    }
}
    