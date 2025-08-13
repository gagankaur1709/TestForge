
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
    Given a positive integer, obtain its roman numeral equivalent as a string,
    and return it in lowercase.
    Restrictions: 1 <= num <= 1000

    Examples:
    >>> intToMiniRoman(19) == "xix"
    >>> intToMiniRoman(152) == "clii"
    >>> intToMiniRoman(426) == "cdxxvi"
     */
    public String intToMiniRoman(int number) {

            List<Integer> num = Arrays.asList(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000);
        List<String> sym = Arrays.asList("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M");
        int i = 12;
        String res = "";
        while (number > 0) {
            int div = number / num.get(i);
            number %= num.get(i);
            while (div != 0) {
                res += sym.get(i);
                div -= 1;
            }
            i -= 1;
        }
        return res.toLowerCase();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_156_humaneval_guided_tree_of_thought_c2d90790 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testIntToMiniRoman_19() {
        assertEquals("xix", solution.intToMiniRoman(19));
    }

    @Test
    void testIntToMiniRoman_152() {
        assertEquals("clii", solution.intToMiniRoman(152));
    }

    @Test
    void testIntToMiniRoman_426() {
        assertEquals("cdxxvi", solution.intToMiniRoman(426));
    }

    @Test
    void testIntToMiniRoman_1() {
        assertEquals("i", solution.intToMiniRoman(1));
    }

    @Test
    void testIntToMiniRoman_4() {
        assertEquals("iv", solution.intToMiniRoman(4));
    }

    @Test
    void testIntToMiniRoman_5() {
        assertEquals("v", solution.intToMiniRoman(5));
    }

    @Test
    void testIntToMiniRoman_10() {
        assertEquals("x", solution.intToMiniRoman(10));
    }

    @Test
    void testIntToMiniRoman_1000() {
        assertEquals("m", solution.intToMiniRoman(1000));
    }
}
    