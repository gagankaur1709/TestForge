
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
    Change numerical base of input number x to base.
    return string representation after the conversion.
    base numbers are less than 10.
    >>> changeBase(8, 3)
    "22"
    >>> changeBase(8, 2)
    "1000"
    >>> changeBase(7, 2)
    "111"
     */
    public String changeBase(int x, int base) {

            StringBuilder ret = new StringBuilder();
        while (x > 0) {
            ret.append(String.valueOf(x % base));
            x /= base;
        }
        return ret.reverse().toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_44_humaneval_constraint_based_1b714c71 {
    private Solution solution = new Solution();

    @Test
    void testChangeBase_HappyPath() {
        assertEquals("22", solution.changeBase(8, 3));
        assertEquals("1000", solution.changeBase(8, 2));
        assertEquals("111", solution.changeBase(7, 2));
    }

    @Test
    void testChangeBase_EdgeCase_Base1() {
        assertEquals("0", solution.changeBase(0, 1));
    }

    @Test
    void testChangeBase_EdgeCase_Base10() {
        assertEquals("8", solution.changeBase(8, 10));
    }
}
    