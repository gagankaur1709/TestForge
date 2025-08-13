
    import java.lang.*;
import java.util.*;
import java.util.List;
import java.util.Optional;
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
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
     */
    public int addElements(List<Integer> arr, int k) {

            arr = arr.subList(0, k);
        Optional<Integer> sum = arr.stream().filter(p -> String.valueOf(Math.abs(p)).length() <= 2).reduce(Integer::sum);
        return sum.orElse(0);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_122_humaneval_role_playing_ab2d51ab {

    @Test
    void shouldReturnSumOfElementsWithAtMostTwoDigits_whenKIsLessThanArrayLength() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;

        // Act
        int result = solution.addElements(arr, k);

        // Assert
        assertEquals(24, result);
    }

    @Test
    void shouldReturnSumOfElementsWithAtMostTwoDigits_whenKIsEqualToArrayLength() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = arr.size();

        // Act
        int result = solution.addElements(arr, k);

        // Assert
        assertEquals(45, result);
    }

    @Test
    void shouldReturnZero_whenNoElementsHaveAtMostTwoDigits() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> arr = List.of(1111, 2222, 3333, 4000, 5000);
        int k = arr.size();

        // Act
        int result = solution.addElements(arr, k);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void shouldReturnSumOfElementsWithAtMostTwoDigits_whenArrayHasOneElement() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> arr = List.of(21);
        int k = arr.size();

        // Act
        int result = solution.addElements(arr, k);

        // Assert
        assertEquals(21, result);
    }

    @Test
    void shouldReturnZero_whenArrayIsEmpty() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> arr = List.of();
        int k = arr.size();

        // Act
        int result = solution.addElements(arr, k);

        // Assert
        assertEquals(0, result);
    }
}
    