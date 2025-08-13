
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
    Your task is to implement a function that will simplify the expression
    x * n. The function returns true if x * n evaluates to a whole number and false
    otherwise. Both x and n, are string representation of a fraction, and have the following format,
    <numerator>/<denominator> where both numerator and denominator are positive whole numbers.

    You can assume that x, and n are valid fractions, and do not have zero as denominator.

    simplify("1/5", "5/1") = true
    simplify("1/6", "2/1") = false
    simplify("7/10", "10/2") = false
     */
    public boolean simplify(String x, String n) {

            String[] a = x.split("/");
        String[] b = n.split("/");
        int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
        int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
        return numerator / denom * denom == numerator;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_144_humaneval_guided_tree_of_thought_a0c117cb {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSimplifyTrue() {
        assertTrue(solution.simplify("1/5", "5/1"));
    }

    @Test
    void testSimplifyFalse() {
        assertFalse(solution.simplify("1/6", "2/1"));
    }

    @Test
    void testSimplifyFalse2() {
        assertFalse(solution.simplify("7/10", "10/2"));
    }

    @Test
    void testSimplifySameFraction() {
        assertTrue(solution.simplify("2/3", "3/2"));
    }

    @Test
    void testSimplifyDifferentFractions() {
        assertFalse(solution.simplify("2/3", "4/5"));
    }

    @Test
    void testSimplifyLargeFractions() {
        assertTrue(solution.simplify("100/200", "200/100"));
    }
}
    