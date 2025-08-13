
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
    Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> stringXor("010", "110")
    "100"
     */
    public String stringXor(String a, String b) {

            StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_11_humaneval_role_playing_9ae20bc7 {

    @Test
    void should_return_empty_string_when_input_strings_are_empty() {
        Solution solution = new Solution();
        assertEquals("", solution.stringXor("", ""));
    }

    @Test
    void should_perform_binary_xor_on_single_character_strings() {
        Solution solution = new Solution();
        assertEquals("1", solution.stringXor("0", "1"));
        assertEquals("1", solution.stringXor("1", "0"));
        assertEquals("0", solution.stringXor("0", "0"));
        assertEquals("0", solution.stringXor("1", "1"));
    }

    @Test
    void should_perform_binary_xor_on_multicharacter_strings() {
        Solution solution = new Solution();
        assertEquals("100", solution.stringXor("010", "110"));
        assertEquals("11", solution.stringXor("10", "01"));
        assertEquals("0", solution.stringXor("00", "00"));
        assertEquals("10", solution.stringXor("10", "00"));
    }

    @Test
    void should_throw_no_exception_when_input_strings_have_different_lengths() {
        Solution solution = new Solution();
        assertEquals("1", solution.stringXor("1", "10"));
    }
}
    