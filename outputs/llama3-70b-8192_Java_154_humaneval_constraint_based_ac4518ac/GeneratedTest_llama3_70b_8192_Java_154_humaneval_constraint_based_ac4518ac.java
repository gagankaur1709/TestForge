
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
    
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
    You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    cycpatternCheck("abcd","abd") => false
    cycpatternCheck("hello","ell") => true
    cycpatternCheck("whassup","psus") => false
    cycpatternCheck("abab","baa") => true
    cycpatternCheck("efef","eeff") => false
    cycpatternCheck("himenss","simen") => true
     */
    public boolean cycpatternCheck(String a, String b) {

            int l = b.length();
        String pat = b + b;
        for (int i = 0; i <= a.length() - l; i++) {
            for (int j = 0; j <= l; j++) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l))) {
                    return true;
                }
            }
        }
        return false;
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_154_humaneval_constraint_based_ac4518ac {

    @Test
    void testCycpatternCheck_HappyPath() {
        Solution solution = new Solution();
        assertTrue(solution.cycpatternCheck("hello", "ell"));
    }

    @Test
    void testCycpatternCheck_EdgeCase_EmptyString() {
        Solution solution = new Solution();
        assertFalse(solution.cycpatternCheck("", "ell"));
    }

    @Test
    void testCycpatternCheck_EdgeCase_SingleCharacter() {
        Solution solution = new Solution();
        assertTrue(solution.cycpatternCheck("a", "a"));
    }

    @Test
    void testCycpatternCheck_EdgeCase_LongerPattern() {
        Solution solution = new Solution();
        assertFalse(solution.cycpatternCheck("abcd", "abcde"));
    }

    @Test
    void testCycpatternCheck_EdgeCase_SameLength() {
        Solution solution = new Solution();
        assertTrue(solution.cycpatternCheck("abcd", "abcd"));
    }
}
    