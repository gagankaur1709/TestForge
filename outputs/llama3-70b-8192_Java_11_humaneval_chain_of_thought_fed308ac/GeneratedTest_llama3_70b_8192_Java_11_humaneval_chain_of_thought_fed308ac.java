
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
    
    public class GeneratedTest_llama3_70b_8192_Java_11_humaneval_chain_of_thought_fed308ac {
    private Solution solution = new Solution();

    @Test
    void testStringXor_HappyPath() {
        assertEquals("100", solution.stringXor("010", "110"));
    }

    @Test
    void testStringXor_EmptyStrings() {
        assertEquals("", solution.stringXor("", ""));
    }

    @Test
    void testStringXor_DifferentLengths() {
        assertEquals("1", solution.stringXor("1", "0"));
    }

    @Test
    void testStringXor_AllZeros() {
        assertEquals("0", solution.stringXor("0", "0"));
    }

    @Test
    void testStringXor_AllOnes() {
        assertEquals("0", solution.stringXor("1", "1"));
    }
}
    