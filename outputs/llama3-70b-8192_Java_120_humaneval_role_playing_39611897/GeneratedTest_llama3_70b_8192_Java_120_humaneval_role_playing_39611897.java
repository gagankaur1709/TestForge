
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    Given an array arr of integers and a positive integer k, return a sorted list
    of length k with the maximum k numbers in arr.

    Example 1:

        Input: arr = [-3, -4, 5], k = 3
        Output: [-4, -3, 5]

    Example 2:

        Input: arr = [4, -4, 4], k = 2
        Output: [4, 4]

    Example 3:

        Input: arr = [-3, 2, 1, 2, -1, -2, 1], k = 1
        Output: [2]

    Note:
        1. The length of the array will be in the range of [1, 1000].
        2. The elements in the array will be in the range of [-1000, 1000].
        3. 0 <= k <= len(arr)
     */
    public List<Integer> maximum(List<Integer> arr, int k) {

            if (k == 0) {
            return List.of();
        }
        List<Integer> arr_sort = new ArrayList<>(arr);
        Collections.sort(arr_sort);
        return arr_sort.subList(arr_sort.size() - k, arr_sort.size());
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_120_humaneval_role_playing_39611897 {

    @Test
    void should_return_empty_list_when_k_is_zero() {
        Solution solution = new Solution();
        List<Integer> arr = new ArrayList<>();
        assertEquals(List.of(), solution.maximum(arr, 0));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(-3, -4, 5);
        List<Integer> expected = List.of(-4, -3, 5);
        assertEquals(expected, solution.maximum(arr, 3));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers_when_k_is_equal_to_arr_length() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(4, -4, 4);
        List<Integer> expected = List.of(-4, 4, 4);
        assertEquals(expected, solution.maximum(arr, 3));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers_when_k_is_one() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
        List<Integer> expected = List.of(2);
        assertEquals(expected, solution.maximum(arr, 1));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers_when_k_is_greater_than_half_of_arr_length() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(-3, -4, 5, 1, 2, 3);
        List<Integer> expected = List.of(-3, -4, 1, 2, 3, 5);
        assertEquals(expected, solution.maximum(arr, 6));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers_when_k_is_equal_to_half_of_arr_length() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(-3, -4, 5, 1, 2, 3);
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, solution.maximum(arr, 3));
    }

    @Test
    void should_return_sorted_list_of_length_k_with_maximum_k_numbers_when_k_is_less_than_half_of_arr_length() {
        Solution solution = new Solution();
        List<Integer> arr = List.of(-3, -4, 5, 1, 2, 3);
        List<Integer> expected = List.of(2, 3);
        assertEquals(expected, solution.maximum(arr, 2));
    }
}
    