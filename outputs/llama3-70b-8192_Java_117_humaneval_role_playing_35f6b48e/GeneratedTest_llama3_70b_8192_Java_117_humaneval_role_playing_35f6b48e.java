
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_117_humaneval_role_playing_35f6b48e {

    @Test
    void should_return_empty_list_when_input_string_is_empty() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("", 4);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void should_return_list_of_words_with_exactly_n_consonants() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("Mary had a little lamb", 4);
        assertEquals(List.of("little"), result);
    }

    @Test
    void should_return_list_of_words_with_exactly_n_consonants_multiple_words() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("Mary had a little lamb", 3);
        assertEquals(List.of("Mary", "lamb"), result);
    }

    @Test
    void should_return_empty_list_when_no_words_have_n_consonants() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("simple white space", 2);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void should_return_list_of_words_with_exactly_n_consonants_case_insensitive() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("Hello world", 4);
        assertEquals(List.of("world"), result);
    }

    @Test
    void should_return_list_of_words_with_exactly_n_consonants_multiple_words_case_insensitive() {
        Solution solution = new Solution();
        List<String> result = solution.selectWords("Uncle sam", 3);
        assertEquals(List.of("Uncle"), result);
    }
}
    