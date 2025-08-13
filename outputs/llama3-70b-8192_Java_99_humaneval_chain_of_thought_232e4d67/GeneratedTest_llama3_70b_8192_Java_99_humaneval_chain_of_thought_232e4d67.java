
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
    Create a function that takes a value (string) representing a number
    and returns the closest integer to it. If the number is equidistant
    from two integers, round it away from zero.

    Examples
    >>> closest_integer("10")
    10
    >>> closest_integer("15.3")
    15

    Note:
    Rounding away from zero means that if the given number is equidistant
    from two integers, the one you should return is the one that is the
    farthest from zero. For example closest_integer("14.5") should
    return 15 and closest_integer("-14.5") should return -15.
     */
    public int countUpper(String value) {

            if (value.contains(".")) {
            while (value.charAt(value.length() - 1) == '0') {
                value = value.substring(0, value.length() - 1);
            }
        }
        double num = Double.parseDouble(value);
        int res = 0;
        if (value.substring(Math.max(value.length() - 2, 0)).equals(".5")) {
            if (num > 0) {
                res = (int) Math.ceil(num);
            } else {
                res = (int) Math.floor(num);
            }
        } else if(value.length() > 0) {
            res = (int) Math.round(num);
        }
        return res;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_99_humaneval_chain_of_thought_232e4d67 {
    private Solution solution = new Solution();

    @Test
    void testClosestInteger_HappyPath() {
        assertEquals(10, solution.countUpper("10"));
        assertEquals(15, solution.countUpper("15.3"));
    }

    @Test
    void testClosestInteger_EdgeCase_RoundAwayFromZero() {
        assertEquals(15, solution.countUpper("14.5"));
        assertEquals(-15, solution.countUpper("-14.5"));
    }

    @Test
    void testClosestInteger_EdgeCase_IntegerInput() {
        assertEquals(0, solution.countUpper("0"));
        assertEquals(-10, solution.countUpper("-10"));
    }

    @Test
    void testClosestInteger_EdgeCase_FractionalInput() {
        assertEquals(15, solution.countUpper("15.0"));
        assertEquals(-15, solution.countUpper("-15.0"));
    }
}
    