
    import java.lang.*;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
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
    Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> countDistinctCharacters("xyzXYZ")
    3
    >>> countDistinctCharacters("Jerry")
    4
     */
    public int countDistinctCharacters(String string) {

            Set<Character> set = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_16_humaneval_constraint_based_3629aa36 {

    @Test
    void testCountDistinctCharacters_HappyPath() {
        Solution solution = new Solution();
        assertEquals(3, solution.countDistinctCharacters("xyzXYZ"));
    }

    @Test
    void testCountDistinctCharacters_EmptyString() {
        Solution solution = new Solution();
        assertEquals(0, solution.countDistinctCharacters(""));
    }

    @Test
    void testCountDistinctCharacters_SingleCharacter() {
        Solution solution = new Solution();
        assertEquals(1, solution.countDistinctCharacters("a"));
    }

    @Test
    void testCountDistinctCharacters_MultipleSameCharacters() {
        Solution solution = new Solution();
        assertEquals(1, solution.countDistinctCharacters("aaaa"));
    }

    @Test
    void testCountDistinctCharacters_MixedCase() {
        Solution solution = new Solution();
        assertEquals(4, solution.countDistinctCharacters("Jerry"));
    }
}
    