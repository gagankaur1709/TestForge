
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
    
    public class GeneratedTest_llama3_70b_8192_Java_23_humaneval_chain_of_thought_5f46e802 {
    private Solution solution = new Solution();

    @Test
    void test_strlen_happy_path() {
        assertEquals(3, solution.strlen("abc"));
    }

    @Test
    void test_strlen_empty_string() {
        assertEquals(0, solution.strlen(""));
    }

    @Test
    void test_strlen_single_character() {
        assertEquals(1, solution.strlen("a"));
    }

    @Test
    void test_strlen_long_string() {
        assertEquals(100, solution.strlen(new String(new char[100])));
    }

    @Test
    void test_strlen_null_string() {
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> solution.strlen(null));
        assertEquals("Cannot invoke \"String.length()\" because \"string\" is null", exception.getMessage());
    }
}
    