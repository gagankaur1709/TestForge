
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
    
    public class GeneratedTest_llama3_70b_8192_Java_31_humaneval_role_playing_be1a87e3 {

    private Solution solution = new Solution();

    @Test
    void shouldReturnFalseWhenInputIsLessThan2() {
        // Arrange
        int input = 1;

        // Act
        boolean result = solution.isPrime(input);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenInputIsEvenAndGreaterThan2() {
        // Arrange
        int input = 4;

        // Act
        boolean result = solution.isPrime(input);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenInputIsPrime() {
        // Arrange
        int input = 101;

        // Act
        boolean result = solution.isPrime(input);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenInputIsLargePrime() {
        // Arrange
        int input = 13441;

        // Act
        boolean result = solution.isPrime(input);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenInputIsComposite() {
        // Arrange
        int input = 6;

        // Act
        boolean result = solution.isPrime(input);

        // Assert
        assertFalse(result);
    }
}
    