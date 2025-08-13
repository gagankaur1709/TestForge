
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
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
    You will be given a string of words separated by commas or spaces. Your task is
    to split the string into words and return an array of the words.
    
    For example:
    words_string("Hi, my name is John").equals(Arrays.asList("Hi", "my", "name", "is", "John"]
    words_string("One, two, three, four, five, six").equals(Arrays.asList("One", "two", "three", "four", "five", "six"]
     */
    public List<String> wordStrings(String s) {

            if (s.length() == 0) {
            return List.of();
        }
        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray()) {
            if (letter == ',') {
                sb.append(' ');
            } else {
                sb.append(letter);
            }
        }

        return new ArrayList<>(Arrays.asList(sb.toString().split("\s+" )));
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_101_humaneval_chain_of_thought_2338ae9f {

    @Test
    void testWordStringsHappyPath() {
        Solution solution = new Solution();
        List<String> result = solution.wordStrings("Hi, my name is John");
        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), result);
    }

    @Test
    void testWordStringsEmptyInput() {
        Solution solution = new Solution();
        List<String> result = solution.wordStrings("");
        assertEquals(Arrays.asList(), result);
    }

    @Test
    void testWordStringsSingleWord() {
        Solution solution = new Solution();
        List<String> result = solution.wordStrings("Hello");
        assertEquals(Arrays.asList("Hello"), result);
    }

    @Test
    void testWordStringsMultipleSpaces() {
        Solution solution = new Solution();
        List<String> result = solution.wordStrings("One  , two, three, four, five, six");
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), result);
    }
}
    