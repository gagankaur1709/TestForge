
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
    Given a string s and a natural number n, you have been tasked to implement
    a function that returns a list of all words from string s that contain exactly
    n consonants, in order these words appear in the string s.
    If the string s is empty then the function should return an empty list.
    Note: you may assume the input string contains only letters and spaces.
    Examples:
    selectWords("Mary had a little lamb", 4) ==> ["little"]
    selectWords("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
    selectWords("simple white space", 2) ==> []
    selectWords("Hello world", 4) ==> ["world"]
    selectWords("Uncle sam", 3) ==> ["Uncle"]
     */
    public List<String> selectWords(String s, int n) {

            List<String> result = new ArrayList<>();
        for (String word : s.split(" ")) {
            int n_consonants = 0;
            for (char c : word.toCharArray()) {
                c = Character.toLowerCase(c);
                if ("aeiou".indexOf(c) == -1) {
                    n_consonants += 1;
                }
            }
            if (n_consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_117_humaneval_guided_tree_of_thought_d0b8a070 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSelectWords_HappyPath() {
        List<String> expected = Arrays.asList("little");
        List<String> actual = solution.selectWords("Mary had a little lamb", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords_MultipleWords() {
        List<String> expected = Arrays.asList("Mary", "lamb");
        List<String> actual = solution.selectWords("Mary had a little lamb", 3);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords_NoMatchingWords() {
        List<String> expected = Arrays.asList();
        List<String> actual = solution.selectWords("simple white space", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords_SingleWord() {
        List<String> expected = Arrays.asList("world");
        List<String> actual = solution.selectWords("Hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords_EmptyInput() {
        List<String> expected = Arrays.asList();
        List<String> actual = solution.selectWords("", 4);
        assertEquals(expected, actual);
    }
}
    