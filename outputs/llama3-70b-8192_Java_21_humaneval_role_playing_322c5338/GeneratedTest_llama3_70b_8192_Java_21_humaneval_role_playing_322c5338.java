
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_21_humaneval_role_playing_322c5338 {

    @Test
    void should_rescale_list_with_multiple_elements() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);

        // Act
        List<Double> result = solution.rescaleToUnit(numbers);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_throw_exception_when_list_is_empty() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = new ArrayList<>();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> solution.rescaleToUnit(numbers));
    }

    @Test
    void should_throw_exception_when_list_has_only_one_element() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> solution.rescaleToUnit(numbers));
    }

    @Test
    void should_rescale_list_with_same_elements() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0);
        List<Double> expected = Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0);

        // Act
        List<Double> result = solution.rescaleToUnit(numbers);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_rescale_list_with_negative_numbers() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(-5.0, -3.0, -1.0, 1.0, 3.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);

        // Act
        List<Double> result = solution.rescaleToUnit(numbers);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_rescale_list_with_large_numbers() {
        // Arrange
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);

        // Act
        List<Double> result = solution.rescaleToUnit(numbers);

        // Assert
        assertEquals(expected, result);
    }
}
    