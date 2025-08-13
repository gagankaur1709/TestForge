
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
    Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
     */
    public int digits(int n) {

            int product = 1, odd_count = 0;
        for (char digit : String.valueOf(n).toCharArray()) {
            int int_digit = digit - '0';
            if (int_digit % 2 == 1) {
                product *= int_digit;
                odd_count += 1;
            }
        }
        if (odd_count == 0) {
            return 0;
        } else {
            return product;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_131_humaneval_chain_of_thought_ec867cfc {

    @Test
    void testDigits_HappyPath() {
        Solution solution = new Solution();
        assertEquals(15, solution.digits(235));
    }

    @Test
    void testDigits_AllEvenDigits() {
        Solution solution = new Solution();
        assertEquals(0, solution.digits(468));
    }

    @Test
    void testDigits_SingleDigit() {
        Solution solution = new Solution();
        assertEquals(1, solution.digits(1));
    }

    @Test
    void testDigits_Zero() {
        Solution solution = new Solution();
        assertEquals(0, solution.digits(0));
    }

    @Test
    void testDigits_NegativeNumber() {
        Solution solution = new Solution();
        assertEquals(0, solution.digits(-235));
    }
}
    