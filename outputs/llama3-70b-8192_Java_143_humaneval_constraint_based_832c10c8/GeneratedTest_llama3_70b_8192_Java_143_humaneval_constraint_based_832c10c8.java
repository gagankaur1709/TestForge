
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
    You are given a string representing a sentence,
    the sentence contains some words separated by a space,
    and you have to return a string that contains the words from the original sentence,
    whose lengths are prime numbers,
    the order of the words in the new string should be the same as the original one.

    Example 1:
        Input: sentence = "This is a test"
        Output: "is"

    Example 2:
        Input: sentence = "lets go for swimming"
        Output: "go for"

    Constraints:
        * 1 <= len(sentence) <= 100
        * sentence contains only letters
     */
    public String wordsInSentence(String sentence) {

            List<String> new_lst = new ArrayList<>();
        for (String word : sentence.split(" " )) {
            boolean flg = true;
            if (word.length() == 1) {
                continue;
            }
            for (int i = 2; i < word.length(); i++) {
                if (word.length() % i == 0) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                new_lst.add(word);
            }
        }
        return String.join(" ", new_lst);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_143_humaneval_constraint_based_832c10c8 {

    @Test
    void testWordsInSentence_HappyPath() {
        Solution solution = new Solution();
        assertEquals("is", solution.wordsInSentence("This is a test"));
    }

    @Test
    void testWordsInSentence_MultiplePrimeWords() {
        Solution solution = new Solution();
        assertEquals("go for", solution.wordsInSentence("lets go for swimming"));
    }

    @Test
    void testWordsInSentence_NoPrimeWords() {
        Solution solution = new Solution();
        assertEquals("", solution.wordsInSentence("a b c"));
    }

    @Test
    void testWordsInSentence_SingleWord() {
        Solution solution = new Solution();
        assertEquals("", solution.wordsInSentence("a"));
    }

    @Test
    void testWordsInSentence_EmptySentence() {
        Solution solution = new Solution();
        assertEquals("", solution.wordsInSentence(""));
    }
}
    