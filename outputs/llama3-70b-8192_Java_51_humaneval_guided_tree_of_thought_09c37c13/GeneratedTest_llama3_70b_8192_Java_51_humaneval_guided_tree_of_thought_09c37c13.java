
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_51_humaneval_guided_tree_of_thought_09c37c13 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testRemoveVowels_EmptyString_ReturnsEmptyString() {
        assertEquals("", solution.removeVowels(""));
    }

    @Test
    void testRemoveVowels_MultiLineString_ReturnsStringWithoutVowels() {
        assertEquals("bcdf\nghjklm", solution.removeVowels("abcdef\nghijklm"));
    }

    @Test
    void testRemoveVowels_SingleLineString_ReturnsStringWithoutVowels() {
        assertEquals("bcdf", solution.removeVowels("abcdef"));
    }

    @Test
    void testRemoveVowels_StringWithOnlyVowels_ReturnsEmptyString() {
        assertEquals("", solution.removeVowels("aaaaa"));
    }

    @Test
    void testRemoveVowels_StringWithMixedCaseVowels_ReturnsStringWithoutVowels() {
        assertEquals("B", solution.removeVowels("aaBAA"));
    }

    @Test
    void testRemoveVowels_StringWithoutVowels_ReturnsOriginalString() {
        assertEquals("zbcd", solution.removeVowels("zbcd"));
    }
}
    