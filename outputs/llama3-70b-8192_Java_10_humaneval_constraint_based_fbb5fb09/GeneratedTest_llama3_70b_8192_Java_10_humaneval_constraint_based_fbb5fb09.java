
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
    Test if given string is a palindrome
     */
    public boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i)!= string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    /**
    Find the shortest palindrome that begins with a supplied string.
    Algorithm idea is simple:
    - Find the longest postfix of supplied string that is a palindrome.
    - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
    >>> makePalindrome("")
    ""
    >>> makePalindrome("cat")
    "catac"
    >>> makePalindrome("cata")
    "catac"
     */
    public String makePalindrome(String string) {

            if (string.length() == 0) {
            return "";
        }

        int beginning_of_suffix = 0;

        while (!isPalindrome(string.substring(beginning_of_suffix))) {
            beginning_of_suffix++;
        }

        return string + new StringBuffer(string.substring(0, beginning_of_suffix)).reverse().toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_10_humaneval_constraint_based_fbb5fb09 {
    private Solution solution = new Solution();

    @Test
    void testIsPalindromeHappyPath() {
        assertTrue(solution.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeEdgeCaseEmptyString() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void testIsPalindromeEdgeCaseSingleCharacter() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void testMakePalindromeHappyPath() {
        assertEquals("catac", solution.makePalindrome("cat"));
    }

    @Test
    void testMakePalindromeEdgeCaseEmptyString() {
        assertEquals("", solution.makePalindrome(""));
    }

    @Test
    void testMakePalindromeEdgeCasePalindrome() {
        assertEquals("catac", solution.makePalindrome("cata"));
    }
}
    