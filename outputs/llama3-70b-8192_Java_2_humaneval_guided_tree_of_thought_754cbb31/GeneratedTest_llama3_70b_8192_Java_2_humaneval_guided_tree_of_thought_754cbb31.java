
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
    Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncateNumber(3.5)
    0.5
     */
    public double truncateNumber(double number) {

            return number % 1.0;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_2_humaneval_guided_tree_of_thought_754cbb31 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testTruncateNumber_HappyPath() {
        double number = 3.5;
        double expectedResult = 0.5;
        double result = solution.truncateNumber(number);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    void testTruncateNumber_IntegerInput() {
        double number = 5.0;
        double expectedResult = 0.0;
        double result = solution.truncateNumber(number);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    void testTruncateNumber_SmallDecimalInput() {
        double number = 0.123;
        double expectedResult = 0.123;
        double result = solution.truncateNumber(number);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    void testTruncateNumber_LargeDecimalInput() {
        double number = 123.456;
        double expectedResult = 0.456;
        double result = solution.truncateNumber(number);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    void testTruncateNumber_NegativeInput() {
        double number = -3.5;
        double expectedResult = 0.5;
        double result = solution.truncateNumber(number);
        assertEquals(expectedResult, result, 0.001);
    }
}
    