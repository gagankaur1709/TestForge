
    import java.lang.*;
import java.util.*;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_80_humaneval_constraint_based_00fc66c6 {
    @Test
    void testIsHappy_HappyString_ReturnsTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isHappy("abcd"));
    }

    @Test
    void testIsHappy_SingleCharacter_ReturnsFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isHappy("a"));
    }

    @Test
    void testIsHappy_TwoCharacters_ReturnsFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isHappy("aa"));
    }

    @Test
    void testIsHappy_ThreeCharactersWithDuplicates_ReturnsFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isHappy("aab"));
    }

    @Test
    void testIsHappy_ThreeCharactersWithoutDuplicates_ReturnsTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isHappy("adb"));
    }

    @Test
    void testIsHappy_LongStringWithDuplicates_ReturnsFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isHappy("xyyzzz"));
    }

    @Test
    void testIsHappy_LongStringWithoutDuplicates_ReturnsTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isHappy("abcdefghi"));
    }
}
    