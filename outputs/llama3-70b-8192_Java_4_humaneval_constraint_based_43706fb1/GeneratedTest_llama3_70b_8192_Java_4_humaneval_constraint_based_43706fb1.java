
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
    
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
    For a given list of input numbers, calculate Mean Absolute Deviation
    around the mean of this dataset.
    Mean Absolute Deviation is the average absolute difference between each
    element and a centerpoint (mean in this case):
    MAD = average | x - x_mean |
    >>> meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0))
    1.0
     */
    public double meanAbsoluteDeviation(List<Double> numbers) {

            double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.size();
        double sum_abs_diff = 0.0;
        for (double num : numbers) {
            sum_abs_diff += Math.abs(num - mean);
        }
        return sum_abs_diff / numbers.size();
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_4_humaneval_constraint_based_43706fb1 {

    @Test
    void testMeanAbsoluteDeviation_HappyPath() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, solution.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation_EmptyList() {
        Solution solution = new Solution();
        List<Double> numbers = Collections.emptyList();
        assertThrows(ArithmeticException.class, () -> solution.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation_SingleElementList() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(5.0);
        assertEquals(0.0, solution.meanAbsoluteDeviation(numbers));
    }
}
    