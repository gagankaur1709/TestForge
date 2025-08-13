
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
    You are given a rectangular grid of wells. Each row represents a single well,
    and each 1 in a row represents a single unit of water.
    Each well has a corresponding bucket that can be used to extract water from it,
    and all buckets have the same capacity.
    Your task is to use the buckets to empty the wells.
    Output the number of times you need to lower the buckets.

    Example 1:
        Input:
            grid : [[0,0,1,0], [0,1,0,0], [1,1,1,1]]
            bucket_capacity : 1
        Output: 6

    Example 2:
        Input:
            grid : [[0,0,1,1], [0,0,0,0], [1,1,1,1], [0,1,1,1]]
            bucket_capacity : 2
        Output: 5

    Example 3:
        Input:
            grid : [[0,0,0], [0,0,0]]
            bucket_capacity : 5
        Output: 0

    Constraints:
        * all wells have the same length
        * 1 <= grid.length <= 10^2
        * 1 <= grid[:,1].length <= 10^2
        * grid[i][j] -> 0 | 1
        * 1 <= capacity <= 10
     */
    public int maxFill(List<List<Integer>> grid, int capacity) {

            int sum = 0;
        for (List<Integer> arr : grid) {
            sum += Math.ceil((double) arr.stream().reduce(Integer::sum).get() / capacity);
        }
        return sum;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_115_humaneval_role_playing_d033c51b {

    @Test
    void should_return_6_when_grid_is_3_by_4_and_bucket_capacity_is_1() {
        Solution solution = new Solution();
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(0, 1, 0, 0),
                Arrays.asList(1, 1, 1, 1)
        );
        int bucketCapacity = 1;
        int expected = 6;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void should_return_5_when_grid_is_4_by_4_and_bucket_capacity_is_2() {
        Solution solution = new Solution();
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 1),
                Arrays.asList(0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(0, 1, 1, 1)
        );
        int bucketCapacity = 2;
        int expected = 5;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void should_return_0_when_grid_is_2_by_3_and_bucket_capacity_is_5() {
        Solution solution = new Solution();
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0)
        );
        int bucketCapacity = 5;
        int expected = 0;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void should_return_1_when_grid_is_1_by_1_and_bucket_capacity_is_1() {
        Solution solution = new Solution();
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1)
        );
        int bucketCapacity = 1;
        int expected = 1;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void should_return_0_when_grid_is_empty_and_bucket_capacity_is_1() {
        Solution solution = new Solution();
        List<List<Integer>> grid = new ArrayList<>();
        int bucketCapacity = 1;
        int expected = 0;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void should_return_0_when_grid_is_null_and_bucket_capacity_is_1() {
        Solution solution = new Solution();
        List<List<Integer>> grid = null;
        int bucketCapacity = 1;
        int expected = 0;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }
}
    