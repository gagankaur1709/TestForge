
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    Given list of numbers (of at least two elements), apply a linear transform to that list,
    such that the smallest number will become 0 and the largest will become 1
    >>> rescaleToUnit(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))
    [0.0, 0.25, 0.5, 0.75, 1.0]
     */
    public List<Double> rescaleToUnit(List<Double> numbers) {

            double min_number = Collections.min(numbers);
        double max_number = Collections.max(numbers);
        List<Double> result = new ArrayList<>();
        for (double x : numbers) {
            result.add((x - min_number) / (max_number - min_number));
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_21_humaneval_constraint_based_1dcf4489 {

    @Test
    void testRescaleToUnit_HappyPath() {
        Solution solution = new Solution();
        List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        assertEquals(expected, solution.rescaleToUnit(input));
    }

    @Test
    void testRescaleToUnit_SingleElementList() {
        Solution solution = new Solution();
        List<Double> input = Collections.singletonList(1.0);
        List<Double> expected = Collections.singletonList(0.0);
        assertEquals(expected, solution.rescaleToUnit(input));
    }

    @Test
    void testRescaleToUnit_EmptyList() {
        Solution solution = new Solution();
        List<Double> input = Collections.emptyList();
        assertEquals(Collections.emptyList(), solution.rescaleToUnit(input));
    }
}
    