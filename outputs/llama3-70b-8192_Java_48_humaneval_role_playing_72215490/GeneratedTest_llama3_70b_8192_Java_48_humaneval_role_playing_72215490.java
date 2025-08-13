
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
    Checks if given string is a palindrome
    >>> isPalindrome("")
    true
    >>> isPalindrome("aba")
    true
    >>> isPalindrome("aaaaa")
    true
    >>> isPalindrome("zbcd")
    false
     */
    public boolean isPalindrome(String text) {

            for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_48_humaneval_role_playing_72215490 {

    @Test
    void should_return_true_when_input_is_an_empty_string() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void should_return_true_when_input_is_a_single_character() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void should_return_true_when_input_is_a_palindrome_with_even_length() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("abba"));
    }

    @Test
    void should_return_true_when_input_is_a_palindrome_with_odd_length() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("aba"));
    }

    @Test
    void should_return_false_when_input_is_not_a_palindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome("zbcd"));
    }

    @Test
    void should_return_true_when_input_is_a_long_palindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("aaaaa"));
    }

    @Test
    void should_return_false_when_input_is_a_long_non_palindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome("abcdefghij"));
    }
}
    