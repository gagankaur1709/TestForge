
    import java.lang.*;
import java.util.*;
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
    Given a positive integer n, return a tuple that has the number of even and odd
    integer palindromes that fall within the range(1, n), inclusive.

    Example 1:

        Input: 3
        Output: (1, 2)
        Explanation:
        Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.

    Example 2:

        Input: 12
        Output: (4, 6)
        Explanation:
        Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.

    Note:
        1. 1 <= n <= 10^3
        2. returned tuple has the number of even and odd integer palindromes respectively.
     */
    public List<Integer> evenOddPalindrome(int n) {

            int even_palindrome_count = 0, odd_palindrome_count = 0;

        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                if (i % 2 == 1) {
                    odd_palindrome_count += 1;
                } else {
                    even_palindrome_count += 1;
                }
            }
        }
        return Arrays.asList(even_palindrome_count, odd_palindrome_count);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_107_humaneval_role_playing_41e7e70a {

    @Test
    void should_return_one_even_and_two_odd_palindromes_when_input_is_three() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddPalindrome(3);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void should_return_four_even_and_six_odd_palindromes_when_input_is_twelve() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddPalindrome(12);
        assertEquals(4, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void should_return_zero_even_and_one_odd_palindromes_when_input_is_one() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddPalindrome(1);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void should_return_zero_even_and_zero_odd_palindromes_when_input_is_zero() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddPalindrome(0);
        assertEquals(0, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void should_return_same_even_and_odd_palindromes_when_input_is_large_number() {
        Solution solution = new Solution();
        List<Integer> result = solution.evenOddPalindrome(1000);
        assertEquals(455, result.get(0));
        assertEquals(545, result.get(1));
    }
}
    