
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
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
    Return length of given string
    >>> strlen("")
    0
    >>> strlen("abc")
    3
     */
    public int strlen(String string) {

            return string.length();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_23_humaneval_constraint_based_ee40684a {
    private Solution solution = new Solution();

    @Test
    @DisplayName("Test strlen with empty string")
    void testStrlenEmptyString() {
        assertEquals(0, solution.strlen(""));
    }

    @Test
    @DisplayName("Test strlen with non-empty string")
    void testStrlenNonEmptyString() {
        assertEquals(3, solution.strlen("abc"));
    }

    @Test
    @DisplayName("Test strlen with single character string")
    void testStrlenSingleCharacterString() {
        assertEquals(1, solution.strlen("a"));
    }
}
    