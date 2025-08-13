
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
    For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
    >>> flipCase("Hello")
    "hELLO"
     */
    public String flipCase(String string) {

            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                sb.append(Character.toUpperCase(string.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(string.charAt(i)));
            }
        }
        return sb.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_27_humaneval_role_playing_e764218f {

    @Test
    void should_flip_case_when_input_is_empty_string() {
        Solution solution = new Solution();
        assertEquals("", solution.flipCase(""));
    }

    @Test
    void should_flip_case_when_input_is_single_lowercase_character() {
        Solution solution = new Solution();
        assertEquals("A", solution.flipCase("a"));
    }

    @Test
    void should_flip_case_when_input_is_single_uppercase_character() {
        Solution solution = new Solution();
        assertEquals("a", solution.flipCase("A"));
    }

    @Test
    void should_flip_case_when_input_is_mixed_case_string() {
        Solution solution = new Solution();
        assertEquals("hELLO", solution.flipCase("Hello"));
    }

    @Test
    void should_flip_case_when_input_is_all_lowercase_string() {
        Solution solution = new Solution();
        assertEquals("HELLO", solution.flipCase("hello"));
    }

    @Test
    void should_flip_case_when_input_is_all_uppercase_string() {
        Solution solution = new Solution();
        assertEquals("hello", solution.flipCase("HELLO"));
    }

    @Test
    void should_flip_case_when_input_is_string_with_non_alphabetic_characters() {
        Solution solution = new Solution();
        assertEquals("h3LlO w0rLd!", solution.flipCase("H3lL0 W0RlD!"));
    }
}
    