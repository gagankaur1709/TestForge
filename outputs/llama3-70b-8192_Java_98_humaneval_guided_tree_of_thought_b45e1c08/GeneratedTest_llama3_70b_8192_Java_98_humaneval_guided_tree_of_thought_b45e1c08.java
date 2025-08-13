
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
    Given a string s, count the number of uppercase vowels in even indices.
    
    For example:
    countUpper("aBCdEf") returns 1
    countUpper("abcdefg") returns 0
    countUpper("dBBE") returns 0
     */    
    public int countUpper(String s) {

            int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if ("AEIOU".indexOf(s.charAt(i)) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_98_humaneval_guided_tree_of_thought_b45e1c08 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testCountUpper_HappyPath() {
        assertEquals(1, solution.countUpper("aBCdEf"));
    }

    @Test
    void testCountUpper_NoUpperVowels() {
        assertEquals(0, solution.countUpper("abcdefg"));
    }

    @Test
    void testCountUpper_NoVowelsAtEvenIndices() {
        assertEquals(0, solution.countUpper("dBBE"));
    }

    @Test
    void testCountUpper_EmptyString() {
        assertEquals(0, solution.countUpper(""));
    }

    @Test
    void testCountUpper_SingleCharacter_UpperVowel() {
        assertEquals(1, solution.countUpper("A"));
    }

    @Test
    void testCountUpper_SingleCharacter_LowerVowel() {
        assertEquals(0, solution.countUpper("a"));
    }

    @Test
    void testCountUpper_MultipleUpperVowels() {
        assertEquals(2, solution.countUpper("aAeIoU"));
    }
}
    