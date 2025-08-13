
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
    
    public class GeneratedTest_llama3_70b_8192_Java_27_humaneval_guided_tree_of_thought_2e8c8ce6 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFlipCase_Hello() {
        String input = "Hello";
        String expected = "hELLO";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFlipCase_EmptyString() {
        String input = "";
        String expected = "";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFlipCase_AllLowercase() {
        String input = "hello";
        String expected = "HELLO";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFlipCase_AllUppercase() {
        String input = "HELLO";
        String expected = "hello";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFlipCase_MixedCase() {
        String input = "HeLlO";
        String expected = "hElLo";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
    }
}
    