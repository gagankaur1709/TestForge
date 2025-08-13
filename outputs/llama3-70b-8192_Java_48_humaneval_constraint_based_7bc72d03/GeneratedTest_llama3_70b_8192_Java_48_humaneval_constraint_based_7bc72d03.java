
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
    
    public class GeneratedTest_llama3_70b_8192_Java_48_humaneval_constraint_based_7bc72d03 {

    @Test
    void testIsPalindrome_EmptyString() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void testIsPalindrome_SingleCharacter() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void testIsPalindrome_Palindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("aba"));
    }

    @Test
    void testIsPalindrome_LongPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("aaaaa"));
    }

    @Test
    void testIsPalindrome_NotPalindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome("zbcd"));
    }

    @Test
    void testIsPalindrome_SingleCharacterDifferentCase() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("A"));
    }

    @Test
    void testIsPalindrome_PalindromeDifferentCase() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("Aba"));
    }
}
    