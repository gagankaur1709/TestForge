
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_115_humaneval_guided_tree_of_thought_9567dd28 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testExample1() {
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
    void testExample2() {
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
    void testExample3() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0)
        );
        int bucketCapacity = 5;
        int expected = 0;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void testEmptyGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        int bucketCapacity = 1;
        int expected = 0;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void testSingleWell() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1, 1)
        );
        int bucketCapacity = 2;
        int expected = 2;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }

    @Test
    void testBucketCapacityOne() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(0, 1, 0, 0),
                Arrays.asList(1, 1, 1, 1)
        );
        int bucketCapacity = 1;
        int expected = 6;
        assertEquals(expected, solution.maxFill(grid, bucketCapacity));
    }
}
    