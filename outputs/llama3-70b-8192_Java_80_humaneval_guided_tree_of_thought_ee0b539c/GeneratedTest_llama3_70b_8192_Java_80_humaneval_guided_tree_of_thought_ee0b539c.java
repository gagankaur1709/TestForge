
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
    You are given a string s.
    Your task is to check if the string is happy or not.
    A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
    For example:
    isHappy(a) => false
    isHappy(aa) => false
    isHappy(abcd) => true
    isHappy(aabb) => false
    isHappy(adb) => true
    isHappy(xyy) => false
     */
    public boolean isHappy(String s) {

            if (s.length() < 3) {
            return false;
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2) || s.charAt(i) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_80_humaneval_guided_tree_of_thought_ee0b539c {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testIsHappy_SingleCharacter_False() {
        assertFalse(solution.isHappy("a"));
    }

    @Test
    void testIsHappy_TwoCharacters_False() {
        assertFalse(solution.isHappy("aa"));
    }

    @Test
    void testIsHappy_ThreeDistinctCharacters_True() {
        assertTrue(solution.isHappy("abc"));
    }

    @Test
    void testIsHappy_ThreeNonDistinctCharacters_False() {
        assertFalse(solution.isHappy("aab"));
    }

    @Test
    void testIsHappy_FourDistinctCharacters_True() {
        assertTrue(solution.isHappy("abcd"));
    }

    @Test
    void testIsHappy_FourNonDistinctCharacters_False() {
        assertFalse(solution.isHappy("aabb"));
    }

    @Test
    void testIsHappy_MultipleDistinctCharacters_True() {
        assertTrue(solution.isHappy("adbcef"));
    }

    @Test
    void testIsHappy_MultipleNonDistinctCharacters_False() {
        assertFalse(solution.isHappy("xyyzz"));
    }
}
    