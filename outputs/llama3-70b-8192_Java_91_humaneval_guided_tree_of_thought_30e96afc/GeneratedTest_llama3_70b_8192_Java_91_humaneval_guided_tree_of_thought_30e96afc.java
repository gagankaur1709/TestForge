
    import java.lang.*;
import java.util.*;
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
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.

    For example:
    >>> isBored("Hello world")
    0
    >>> isBored("The sky is blue. The sun is shining. I love this weather")
    1
     */
    public int isBored(String S) {

            String [] sentences = S.split("[.?!]\s*");
        int count = 0;
        for (String sentence : sentences) {
            if (sentence.subSequence(0, 2).equals("I ")) {
                count += 1;
            }
        }
        return count;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_91_humaneval_guided_tree_of_thought_30e96afc {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testNoBoredom() {
        assertEquals(0, solution.isBored("Hello world"));
    }

    @Test
    void testOneBoredom() {
        assertEquals(1, solution.isBored("The sky is blue. The sun is shining. I love this weather"));
    }

    @Test
    void testMultipleBoredoms() {
        assertEquals(2, solution.isBored("I am bored. The sun is shining. I love this weather"));
    }

    @Test
    void testNoSentences() {
        assertEquals(0, solution.isBored(""));
    }

    @Test
    void testSingleSentenceNoBoredom() {
        assertEquals(0, solution.isBored("Hello world."));
    }

    @Test
    void testSingleSentenceBoredom() {
        assertEquals(1, solution.isBored("I am bored."));
    }
}
    