
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
    Write a function that takes a string and returns an ordered version of it.
    Ordered version of string, is a string where all words (separated by space)
    are replaced by a new word where all the characters arranged in
    ascending order based on ascii value.
    Note: You should keep the order of words and blank spaces in the sentence.

    For example:
    antiShuffle("Hi") returns "Hi"
    antiShuffle("hello") returns "ehllo"
    antiShuffle("Hello World!!!") returns "Hello !!!Wdlor"
     */
    public String antiShuffle(String s) {

            String[] strings = s.split(" ");
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            result.add(String.copyValueOf(chars));
        }
        return String.join(" ", result);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_86_humaneval_constraint_based_da84b6d4 {
    private Solution solution = new Solution();

    @Test
    void testAntiShuffle_HappyPath() {
        String input = "Hello World!!!";
        String expected = "Hello !!!Wdlor";
        String result = solution.antiShuffle(input);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    void testAntiShuffle_SingleWord() {
        String input = "hello";
        String expected = "ehllo";
        String result = solution.antiShuffle(input);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    void testAntiShuffle_EmptyString() {
        String input = "";
        String expected = "";
        String result = solution.antiShuffle(input);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    void testAntiShuffle_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = solution.antiShuffle(input);
        assertNotNull(result);
        assertEquals(expected, result);
    }
}
    