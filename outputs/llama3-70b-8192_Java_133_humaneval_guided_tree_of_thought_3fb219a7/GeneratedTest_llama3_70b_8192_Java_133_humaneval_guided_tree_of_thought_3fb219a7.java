
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
    You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    Examples:
    For lst = [1,2,3] the output should be 14
    For lst = [1,4,9] the output should be 98
    For lst = [1,3,5,7] the output should be 84
    For lst = [1.4,4.2,0] the output should be 29
    For lst = [-2.4,1,1] the output should be 6
     */
    public int sumSquares(List<Double> lst) {

            return lst.stream().map(p -> (int) Math.ceil(p)).map(p -> p * p).reduce(Integer::sum).get();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_133_humaneval_guided_tree_of_thought_3fb219a7 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSumSquares_HappyPath() {
        List<Double> lst = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals(14, solution.sumSquares(lst));
    }

    @Test
    void testSumSquares_SingleElement() {
        List<Double> lst = Arrays.asList(4.0);
        assertEquals(16, solution.sumSquares(lst));
    }

    @Test
    void testSumSquares_MultipleElements() {
        List<Double> lst = Arrays.asList(1.4, 4.2, 0.0);
        assertEquals(29, solution.sumSquares(lst));
    }

    @Test
    void testSumSquares_NegativeNumbers() {
        List<Double> lst = Arrays.asList(-2.4, 1.0, 1.0);
        assertEquals(6, solution.sumSquares(lst));
    }

    @Test
    void testSumSquares_EmptyList() {
        List<Double> lst = new ArrayList<>();
        assertEquals(0, solution.sumSquares(lst));
    }
}
    