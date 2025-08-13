
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
    Write a function that takes an array of numbers as input and returns
    the number of elements in the array that are greater than 10 and both
    first and last digits of a number are odd (1, 3, 5, 7, 9).
    For example:
    specialFilter(Arrays.asList(15, -73, 14, -15)) => 1
    specialFilter(Arrays.asList(33, -2, -3, 45, 21, 109)) => 2
     */
    public int specialFilter(List<Integer> nums) {

            int count = 0;
        for (int num : nums) {
            if (num > 10) {
                String odd_digits = "13579";
                String number_as_string = String.valueOf(num);
                if (odd_digits.indexOf(number_as_string.charAt(0)) != -1 && odd_digits.indexOf(number_as_string.charAt(number_as_string.length() - 1)) != -1) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_146_humaneval_constraint_based_ebd99af2 {

    @Test
    void testSpecialFilter_HappyPath() {
        Solution solution = new Solution();
        List<Integer> nums = Arrays.asList(15, -73, 14, -15);
        int expected = 1;
        int actual = solution.specialFilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSpecialFilter_MultipleMatches() {
        Solution solution = new Solution();
        List<Integer> nums = Arrays.asList(33, -2, -3, 45, 21, 109);
        int expected = 2;
        int actual = solution.specialFilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSpecialFilter_NoMatches() {
        Solution solution = new Solution();
        List<Integer> nums = Arrays.asList(10, 20, 30);
        int expected = 0;
        int actual = solution.specialFilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSpecialFilter_EmptyList() {
        Solution solution = new Solution();
        List<Integer> nums = new ArrayList<>();
        int expected = 0;
        int actual = solution.specialFilter(nums);
        assertEquals(expected, actual);
    }
}
    