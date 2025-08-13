
    import java.lang.*;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
    
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
    
    class GeneratedTest_llama3_70b_8192_Java_11_humaneval_constraint_based_4d675956 {

    @Test
    @DisplayName("Test stringXor with valid inputs")
    void testStringXorValidInputs() {
        Solution solution = new Solution();
        assertEquals("100", solution.stringXor("010", "110"));
    }

    @ParameterizedTest
    @MethodSource("provideEdgeCases")
    @DisplayName("Test stringXor with edge cases")
    void testStringXorEdgeCases(String a, String b, String expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.stringXor(a, b));
    }

    private static Stream<Arguments> provideEdgeCases() {
        return Stream.of(
            Arguments.of("0", "0", "0"),
            Arguments.of("1", "1", "0"),
            Arguments.of("10", "10", "00"),
            Arguments.of("11", "11", "00"),
            Arguments.of("1010", "1010", "0000"),
            Arguments.of("1111", "1111", "0000"),
            Arguments.of("0", "1", "1"),
            Arguments.of("1", "0", "1"),
            Arguments.of("10", "11", "01"),
            Arguments.of("11", "10", "01"),
            Arguments.of("1010", "1111", "0101"),
            Arguments.of("1111", "1010", "0101")
        );
    }
}
    