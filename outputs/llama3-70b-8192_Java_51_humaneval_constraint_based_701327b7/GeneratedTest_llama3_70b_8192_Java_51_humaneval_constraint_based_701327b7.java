
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
    removeVowels is a function that takes string and returns string without vowels.
    >>> removeVowels("")
    ""
    >>> removeVowels("abcdef\nghijklm")
    "bcdf\nghjklm"
    >>> removeVowels("abcdef")
    "bcdf"
    >>> removeVowels("aaaaa")
    ""
    >>> removeVowels("aaBAA")
    "B"
    >>> removeVowels("zbcd")
    "zbcd"
     */
    public String removeVowels(String text) {

            StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_51_humaneval_constraint_based_701327b7 {
    private Solution solution = new Solution();

    @Test
    void testRemoveVowels_HappyPath() {
        assertEquals("bcdf\nghjklm", solution.removeVowels("abcdef\nghijklm"));
    }

    @Test
    void testRemoveVowels_EmptyString() {
        assertEquals("", solution.removeVowels(""));
    }

    @Test
    void testRemoveVowels_OnlyVowels() {
        assertEquals("", solution.removeVowels("aaaaa"));
    }

    @Test
    void testRemoveVowels_MixedCase() {
        assertEquals("B", solution.removeVowels("aaBAA"));
    }

    @Test
    void testRemoveVowels_NoVowels() {
        assertEquals("zbcd", solution.removeVowels("zbcd"));
    }
}
    