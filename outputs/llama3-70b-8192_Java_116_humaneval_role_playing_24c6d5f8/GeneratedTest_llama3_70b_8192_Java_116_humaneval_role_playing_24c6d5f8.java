
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
    In this Kata, you have to sort an array of non-negative integers according to
    number of ones in their binary representation in ascending order.
    For similar number of ones, sort based on decimal value.
    <p>
    It must be implemented like this:
    >>> sortArray(Arrays.asList(1, 5, 2, 3, 4)).equals(Arrays.asList(1, 2, 3, 4, 5))
    >>> sortArray(Arrays.asList(-2, -3, -4, -5, -6)).equals(Arrays.asList(-6, -5, -4, -3, -2))
    >>> sortArray(Arrays.asList(1, 0, 2, 3, 4)).equals(Arrays.asList(0, 1, 2, 3, 4))
     */
    public List<Integer> sortArray(List<Integer> arr) {

                    List < Integer > sorted_arr = new ArrayList<>(arr);
        sorted_arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int cnt1 = (int) Integer.toBinaryString(Math.abs(o1)).chars().filter(ch -> ch == '1').count();
                int cnt2 = (int) Integer.toBinaryString(Math.abs(o2)).chars().filter(ch -> ch == '1').count();
                if (cnt1 > cnt2) {
                    return 1;
                } else if (cnt1 < cnt2) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        return sorted_arr;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_116_humaneval_role_playing_24c6d5f8 {

    @Test
    void shouldSortArrayByOnesInBinaryRepresentationAndThenByValue() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 5, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void shouldSortArrayWithNegativeNumbers() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(-2, -3, -4, -5, -6);
        List<Integer> expected = Arrays.asList(-6, -5, -4, -3, -2);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void shouldSortArrayWithZero() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 0, 2, 3, 4);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void shouldSortEmptyArray() {
        Solution solution = new Solution();
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void shouldSortArrayWithSingleElement() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void shouldSortArrayWithSameBinaryOnesCount() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(2, 4, 8);
        List<Integer> expected = Arrays.asList(2, 4, 8);
        assertEquals(expected, solution.sortArray(input));
    }
}
    