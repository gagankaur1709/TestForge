
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
    Write a function vowelsCount which takes a string representing
    a word as input and returns the number of vowels in the string.
    Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
    vowel, but only when it is at the end of the given word.

    Example:
    >>> vowelsCount("abcde")
    2
    >>> vowelsCount("ACEDY")
    3
     */
    public int vowelsCount(String s) {

            String vowels = "aeiouAEIOU";
        int n_vowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                n_vowels += 1;
            }
        }
        if (s.charAt(s.length() - 1) == 'y' || s.charAt(s.length() - 1) == 'Y') {
            n_vowels += 1;
        }
        return n_vowels;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_64_humaneval_guided_tree_of_thought_d0d77238 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testVowelsCountHappyPath() {
        assertEquals(2, solution.vowelsCount("abcde"));
    }

    @Test
    void testVowelsCountEdgeCaseYAtTheEnd() {
        assertEquals(3, solution.vowelsCount("ACEDY"));
    }

    @Test
    void testVowelsCountEdgeCaseNoVowels() {
        assertEquals(0, solution.vowelsCount("bcdfgh"));
    }

    @Test
    void testVowelsCountEdgeCaseOnlyVowels() {
        assertEquals(5, solution.vowelsCount("aeiou"));
    }

    @Test
    void testVowelsCountEdgeCaseOnlyYAtTheEnd() {
        assertEquals(1, solution.vowelsCount("bcdfghy"));
    }

    @Test
    void testVowelsCountEdgeCaseEmptyString() {
        assertEquals(0, solution.vowelsCount(""));
    }
}
    