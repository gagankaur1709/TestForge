
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
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
    Task
    We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    then check if the result string is palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return a tuple containing the result string and true/false for the check.
    Example
    For s = "abcde", c = "ae", the result should be ("bcd",false)
    For s = "abcdef", c = "b"  the result should be ("acdef",false)
    For s = "abcdedcba", c = "ab", the result should be ("cdedc",true)
     */
    public List<Object> reverseDelete(String s, String c) {

            StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (c.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return Arrays.asList(sb.toString(), sb.toString().equals(sb.reverse().toString()));
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_112_humaneval_guided_tree_of_thought_15ab3361 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testReverseDelete_HappyPath() {
        List<Object> result = solution.reverseDelete("abcde", "ae");
        assertEquals("bcd", result.get(0));
        assertEquals(false, result.get(1));
    }

    @Test
    void testReverseDelete_SingleCharacterInC() {
        List<Object> result = solution.reverseDelete("abcdef", "b");
        assertEquals("acdef", result.get(0));
        assertEquals(false, result.get(1));
    }

    @Test
    void testReverseDelete_Palindrome() {
        List<Object> result = solution.reverseDelete("abcdedcba", "ab");
        assertEquals("cdedc", result.get(0));
        assertEquals(true, result.get(1));
    }

    @Test
    void testReverseDelete_EmptyStringS() {
        List<Object> result = solution.reverseDelete("", "ae");
        assertEquals("", result.get(0));
        assertEquals(true, result.get(1));
    }

    @Test
    void testReverseDelete_EmptyStringC() {
        List<Object> result = solution.reverseDelete("abcde", "");
        assertEquals("abcde", result.get(0));
        assertEquals(false, result.get(1));
    }

    @Test
    void testReverseDelete_BothEmptyStrings() {
        List<Object> result = solution.reverseDelete("", "");
        assertEquals("", result.get(0));
        assertEquals(true, result.get(1));
    }
}
    