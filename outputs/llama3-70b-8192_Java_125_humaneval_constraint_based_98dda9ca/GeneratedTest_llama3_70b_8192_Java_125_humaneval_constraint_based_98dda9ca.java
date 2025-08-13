
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
    Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
    should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
    alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
    Examples
    splitWords("Hello world!") == ["Hello", "world!"]
    splitWords("Hello,world!") == ["Hello", "world!"]
    splitWords("abcdef") == 3
     */
    public Object splitWords(String txt) {

            if (txt.contains(" " )) {
            return Arrays.asList(txt.split(" " ));
        } else if (txt.contains("," )) {
            return Arrays.asList(txt.split("[,\s]" ));
        } else {
            int count = 0;
            for (char c : txt.toCharArray()) {
                if (Character.isLowerCase(c) && (c - 'a') % 2 == 1) {
                    count += 1;
                }
            }
            return count;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_125_humaneval_constraint_based_98dda9ca {
    @Test
    void testSplitWords_WithSpaces() {
        Solution solution = new Solution();
        List<String> result = (List<String>) solution.splitWords("Hello world!");
        assertEquals(Arrays.asList("Hello", "world!"), result);
    }

    @Test
    void testSplitWords_WithCommas() {
        Solution solution = new Solution();
        List<String> result = (List<String>) solution.splitWords("Hello,world!");
        assertEquals(Arrays.asList("Hello", "world!"), result);
    }

    @Test
    void testSplitWords_WithoutSpacesOrCommas() {
        Solution solution = new Solution();
        int result = (int) solution.splitWords("abcdef");
        assertEquals(3, result);
    }

    @Test
    void testSplitWords_EmptyString() {
        Solution solution = new Solution();
        int result = (int) solution.splitWords("");
        assertEquals(0, result);
    }

    @Test
    void testSplitWords_SingleCharacter() {
        Solution solution = new Solution();
        int result = (int) solution.splitWords("a");
        assertEquals(1, result);
    }

    @Test
    void testSplitWords_AllLowercase() {
        Solution solution = new Solution();
        int result = (int) solution.splitWords("abcdefghijklmnopqrstuvwxyz");
        assertEquals(13, result);
    }
}
    