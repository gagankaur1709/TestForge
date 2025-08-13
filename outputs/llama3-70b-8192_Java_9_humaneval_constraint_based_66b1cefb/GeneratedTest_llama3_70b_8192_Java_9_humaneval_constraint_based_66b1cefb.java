
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
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
    From a given list of integers, generate a list of rolling maximum element found until given moment
    in the sequence.
    >>> rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2))
    [1, 2, 3, 3, 3, 4, 4]
     */
    public List<Integer> rollingMax(List<Integer> numbers) {

            List<Integer> result = new ArrayList<>();
        if (numbers.size() == 0) {
            return result;
        }
        int rollingMax = numbers.get(0);
        result.add(rollingMax);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > rollingMax) {
                rollingMax = numbers.get(i);
            }
            result.add(rollingMax);
        }

        return result;
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_9_humaneval_constraint_based_66b1cefb {

    @Test
    void testRollingMax_HappyPath() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
        List<Integer> result = solution.rollingMax(numbers);
        assertEquals(expectedResult, result);
    }

    @Test
    void testRollingMax_EmptyList() {
        Solution solution = new Solution();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> result = solution.rollingMax(numbers);
        assertEquals(expectedResult, result);
    }

    @Test
    void testRollingMax_SingleElementList() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList(5);
        List<Integer> expectedResult = Arrays.asList(5);
        List<Integer> result = solution.rollingMax(numbers);
        assertEquals(expectedResult, result);
    }
}
    