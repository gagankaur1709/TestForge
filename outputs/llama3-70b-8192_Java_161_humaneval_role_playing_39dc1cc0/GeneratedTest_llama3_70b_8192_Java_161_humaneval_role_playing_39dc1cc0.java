
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
    
    public class GeneratedTest_llama3_70b_8192_Java_161_humaneval_role_playing_39dc1cc0 {

    @Test
    void should_return_reversed_string_when_input_contains_no_letters() {
        Solution solution = new Solution();
        assertEquals("4321", solution.solve("1234"));
    }

    @Test
    void should_return_string_with_reversed_case_when_input_contains_letters() {
        Solution solution = new Solution();
        assertEquals("AB", solution.solve("ab"));
    }

    @Test
    void should_return_string_with_reversed_case_and_non_letters_unchanged() {
        Solution solution = new Solution();
        assertEquals("#A@c", solution.solve("#a@C"));
    }

    @Test
    void should_return_empty_string_when_input_is_empty() {
        Solution solution = new Solution();
        assertEquals("", solution.solve(""));
    }

    @Test
    void should_return_single_character_string_with_reversed_case() {
        Solution solution = new Solution();
        assertEquals("A", solution.solve("a"));
    }

    @Test
    void should_return_single_non_letter_character_string_unchanged() {
        Solution solution = new Solution();
        assertEquals("#", solution.solve("#"));
    }
}
    