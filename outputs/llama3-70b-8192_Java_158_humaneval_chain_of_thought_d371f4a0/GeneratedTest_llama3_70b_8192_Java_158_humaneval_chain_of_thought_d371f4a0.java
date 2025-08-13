
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
    Write a function that accepts a list of strings.
    The list contains different words. Return the word with maximum number
    of unique characters. If multiple strings have maximum number of unique
    characters, return the one which comes first in lexicographical order.

    findMax(["name", "of", "string"]) == "string"
    findMax(["name", "enam", "game"]) == "enam"
    findMax(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
     */
    public String findMax(List<String> words) {

            List<String> words_sort = new ArrayList<>(words);
        words_sort.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Set<Character> s1 = new HashSet<>();
                for (char ch : o1.toCharArray()) {
                    s1.add(ch);
                }
                Set<Character> s2 = new HashSet<>();
                for (char ch : o2.toCharArray()) {
                    s2.add(ch);
                }
                if (s1.size() > s2.size()) {
                    return 1;
                } else if (s1.size() < s2.size()) {
                    return -1;
                } else {
                    return -o1.compareTo(o2);
                }
            }
        });
        return words_sort.get(words_sort.size() - 1);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_158_humaneval_chain_of_thought_d371f4a0 {

    @Test
    void testFindMax_HappyPath() {
        Solution solution = new Solution();
        List<String> words = Arrays.asList("name", "of", "string");
        assertEquals("string", solution.findMax(words));
    }

    @Test
    void testFindMax_EdgeCase_MultipleMaxUniqueCharacters() {
        Solution solution = new Solution();
        List<String> words = Arrays.asList("name", "enam", "game");
        assertEquals("enam", solution.findMax(words));
    }

    @Test
    void testFindMax_EdgeCase_SingleWord() {
        Solution solution = new Solution();
        List<String> words = Arrays.asList("aaaaaaa");
        assertEquals("aaaaaaa", solution.findMax(words));
    }

    @Test
    void testFindMax_EdgeCase_EmptyList() {
        Solution solution = new Solution();
        List<String> words = new ArrayList<>();
        assertEquals("", solution.findMax(words));
    }
}
    