
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
    You have been tasked to write a function that receives
    a hexadecimal number as a string and counts the number of hexadecimal
    digits that are primes (prime number, or a prime, is a natural number
    greater than 1 that is not a product of two smaller natural numbers).
    Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
    Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
    So you have to determine a number of the following digits: 2, 3, 5, 7,
    B (=decimal 11), D (=decimal 13).
    Note: you may assume the input is always correct or empty string,
    and symbols A,B,C,D,E,F are always uppercase.
    Examples:
    For num = "AB" the output should be 1.
    For num = "1077E" the output should be 2.
    For num = "ABED1A33" the output should be 4.
    For num = "123456789ABCDEF0" the output should be 6.
    For num = "2020" the output should be 2.
     */
    public int hexKey(String num) {

            String primes = "2357BD";
        int total = 0;
        for (char c : num.toCharArray()) {
            if (primes.indexOf(c) != -1) {
                total += 1;
            }
        }
        return total;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_78_humaneval_role_playing_e42d9756 {

    @Test
    void should_return_1_when_input_is_AB() {
        Solution solution = new Solution();
        assertEquals(1, solution.hexKey("AB"));
    }

    @Test
    void should_return_2_when_input_is_1077E() {
        Solution solution = new Solution();
        assertEquals(2, solution.hexKey("1077E"));
    }

    @Test
    void should_return_4_when_input_is_ABED1A33() {
        Solution solution = new Solution();
        assertEquals(4, solution.hexKey("ABED1A33"));
    }

    @Test
    void should_return_6_when_input_is_123456789ABCDEF0() {
        Solution solution = new Solution();
        assertEquals(6, solution.hexKey("123456789ABCDEF0"));
    }

    @Test
    void should_return_2_when_input_is_2020() {
        Solution solution = new Solution();
        assertEquals(2, solution.hexKey("2020"));
    }

    @Test
    void should_return_0_when_input_is_empty_string() {
        Solution solution = new Solution();
        assertEquals(0, solution.hexKey(""));
    }

    @Test
    void should_return_0_when_input_does_not_contain_prime_digits() {
        Solution solution = new Solution();
        assertEquals(0, solution.hexKey("0469"));
    }
}
    