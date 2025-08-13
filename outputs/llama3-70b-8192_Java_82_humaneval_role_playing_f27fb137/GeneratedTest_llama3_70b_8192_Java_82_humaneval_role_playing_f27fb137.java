
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
    Write a function that takes a string and returns true if the string
    length is a prime number or false otherwise
    Examples
    primeLength("Hello") == true
    primeLength("abcdcba") == true
    primeLength("kittens") == true
    primeLength("orange") == false
     */
    public boolean primeLength(String string) {

            int l = string.length();
        if (l == 0 || l == 1) {
            return false;
        }
        for (int i = 2; i < l; i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_82_humaneval_role_playing_f27fb137 {

    private Solution solution = new Solution();

    @Test
    void should_return_true_when_string_length_is_prime() {
        assertTrue(solution.primeLength("Hello"));
        assertTrue(solution.primeLength("abcdcba"));
        assertTrue(solution.primeLength("kittens"));
    }

    @Test
    void should_return_false_when_string_length_is_not_prime() {
        assertFalse(solution.primeLength("orange"));
        assertFalse(solution.primeLength("a"));
        assertFalse(solution.primeLength(""));
    }

    @Test
    void should_return_false_when_string_length_is_one_or_zero() {
        assertFalse(solution.primeLength(""));
        assertFalse(solution.primeLength("a"));
    }
}
    