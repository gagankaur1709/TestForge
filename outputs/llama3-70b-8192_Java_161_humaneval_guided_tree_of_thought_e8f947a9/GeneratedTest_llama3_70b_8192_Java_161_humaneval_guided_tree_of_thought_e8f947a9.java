
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
    if s[i] is a letter, reverse its case from lower to upper or vise versa,
    otherwise keep it as it is.
    If the string contains no letters, reverse the string.
    The function should return the resulted string.
    Examples
    solve("1234") = "4321"
    solve("ab") = "AB"
    solve("#a@C") = "#A@c"
     */
    public String solve(String s) {

            boolean flag = true;
        StringBuilder new_string = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isUpperCase(i)) {
                new_string.append(Character.toLowerCase(i));
                flag = false;
            } else if (Character.isLowerCase(i)) {
                new_string.append(Character.toUpperCase(i));
                flag = false;
            } else {
                new_string.append(i);
            }
        }
        if (flag) {
            new_string.reverse();
        }
        return new_string.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_161_humaneval_guided_tree_of_thought_e8f947a9 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSolve_OnlyDigits_ReturnsReversedString() {
        String input = "1234";
        String expected = "4321";
        assertEquals(expected, solution.solve(input));
    }

    @Test
    void testSolve_OnlyLetters_ReturnsCaseReversedString() {
        String input = "ab";
        String expected = "AB";
        assertEquals(expected, solution.solve(input));
    }

    @Test
    void testSolve_MixedInput_ReturnsCaseReversedString() {
        String input = "#a@C";
        String expected = "#A@c";
        assertEquals(expected, solution.solve(input));
    }

    @Test
    void testSolve_EmptyString_ReturnsEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, solution.solve(input));
    }

    @Test
    void testSolve_SpecialCharactersOnly_ReturnsReversedString() {
        String input = "!@#";
        String expected = "#@!";
        assertEquals(expected, solution.solve(input));
    }
}
    