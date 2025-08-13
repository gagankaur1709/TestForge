
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
    
    public class GeneratedTest_llama3_70b_8192_Java_101_humaneval_guided_tree_of_thought_7532ce18 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testEmptyString() {
        List<String> expected = List.of();
        List<String> actual = solution.wordStrings("");
        assertEquals(expected, actual);
    }

    @Test
    void testCommaSeparatedWords() {
        List<String> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<String> actual = solution.wordStrings("Hi, my name is John");
        assertEquals(expected, actual);
    }

    @Test
    void testSpaceSeparatedWords() {
        List<String> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        List<String> actual = solution.wordStrings("One two three four five six");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedSeparators() {
        List<String> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        List<String> actual = solution.wordStrings("One, two three, four five, six");
        assertEquals(expected, actual);
    }
}
    