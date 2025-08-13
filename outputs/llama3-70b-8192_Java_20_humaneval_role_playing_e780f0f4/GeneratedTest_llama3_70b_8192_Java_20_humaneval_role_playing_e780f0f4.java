
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
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
    From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2))
    [2.0, 2.2]
    >>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0))
    [2.0, 2.0]
     */
    public List<Double> findClosestElements(List<Double> numbers) {

            List<Double> closest_pair = new ArrayList<>();
        closest_pair.add(numbers.get(0));
        closest_pair.add(numbers.get(1));
        double distance = Math.abs(numbers.get(1) - numbers.get(0));
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < distance) {
                    closest_pair.clear();
                    closest_pair.add(numbers.get(i));
                    closest_pair.add(numbers.get(j));
                    distance = Math.abs(numbers.get(i) - numbers.get(j));
                }
            }
        }
        Collections.sort(closest_pair);
        return closest_pair;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_20_humaneval_role_playing_e780f0f4 {

    @Test
    void should_return_closest_elements_when_list_has_unique_elements() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected = Arrays.asList(2.0, 2.2);
        assertEquals(expected, solution.findClosestElements(numbers));
    }

    @Test
    void should_return_closest_elements_when_list_has_duplicate_elements() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expected = Arrays.asList(2.0, 2.0);
        assertEquals(expected, solution.findClosestElements(numbers));
    }

    @Test
    void should_return_closest_elements_when_list_has_negative_elements() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(-1.0, 2.0, 3.0, 4.0, 5.0, -0.8);
        List<Double> expected = Arrays.asList(-1.0, -0.8);
        assertEquals(expected, solution.findClosestElements(numbers));
    }

    @Test
    void should_return_closest_elements_when_list_has_elements_with_different_signs() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(-1.0, 2.0, 3.0, 4.0, 5.0, 0.8);
        List<Double> expected = Arrays.asList(-1.0, 0.8);
        assertEquals(expected, solution.findClosestElements(numbers));
    }

    @Test
    void should_return_closest_elements_when_list_has_only_two_elements() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0);
        List<Double> expected = Arrays.asList(1.0, 2.0);
        assertEquals(expected, solution.findClosestElements(numbers));
    }
}
    