
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
    You are given a word. Your task is to find the closest vowel that stands between
    two consonants from the right side of the word (case sensitive).

    Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    find any vowel met the above condition.

    You may assume that the given string contains English letter only.

    Example:
    getClosestVowel("yogurt") ==> "u"
    getClosestVowel("FULL") ==> "U"
    getClosestVowel("quick") ==> ""
    getClosestVowel("ab") ==> ""
     */
    public String getClosestVowel(String word) {

            if (word.length() < 3) {
            return "";
        }

        String vowels = "aeiouAEIOU";
        for (int i = word.length() - 2; i > 0; i--) {
            if (vowels.indexOf(word.charAt(i)) != -1 && vowels.indexOf(word.charAt(i + 1)) == -1 && vowels.indexOf(word.charAt(i - 1)) == -1) {
                return String.valueOf(word.charAt(i));
            }
        }
        return "";
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_118_humaneval_chain_of_thought_8e9b965b {

    @Test
    void testGetClosestVowel_HappyPath() {
        Solution solution = new Solution();
        assertEquals("u", solution.getClosestVowel("yogurt"));
    }

    @Test
    void testGetClosestVowel_EdgeCase_ShortWord() {
        Solution solution = new Solution();
        assertEquals("", solution.getClosestVowel("ab"));
    }

    @Test
    void testGetClosestVowel_EdgeCase_NoVowel() {
        Solution solution = new Solution();
        assertEquals("", solution.getClosestVowel("quick"));
    }

    @Test
    void testGetClosestVowel_EdgeCase_CaseSensitive() {
        Solution solution = new Solution();
        assertEquals("U", solution.getClosestVowel("FULL"));
    }
}
    