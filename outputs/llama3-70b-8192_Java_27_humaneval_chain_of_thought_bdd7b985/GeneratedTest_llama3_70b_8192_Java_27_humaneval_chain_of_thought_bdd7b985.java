
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
    
    public class GeneratedTest_llama3_70b_8192_Java_27_humaneval_chain_of_thought_bdd7b985 {
    private Solution solution = new Solution();

    @Test
    void testFlipCase_HappyPath() {
        assertEquals("hELLO", solution.flipCase("Hello"));
    }

    @Test
    void testFlipCase_EmptyString() {
        assertEquals("", solution.flipCase(""));
    }

    @Test
    void testFlipCase_AllLowercase() {
        assertEquals("HELLO", solution.flipCase("hello"));
    }

    @Test
    void testFlipCase_AllUppercase() {
        assertEquals("hello", solution.flipCase("HELLO"));
    }

    @Test
    void testFlipCase_MixedCaseWithSpaces() {
        assertEquals("hElLo WoRlD", solution.flipCase("HeLlO wOrLd"));
    }
}
    