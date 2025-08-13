
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    Given list of integers, return list in strange order.
    Strange sorting, is when you start with the minimum value,
    then maximum of the remaining integers, then minimum and so on.

    Examples:
    strangeSortList(Arrays.asList(1, 2, 3, 4)) == Arrays.asList(1, 4, 2, 3)
    strangeSortList(Arrays.asList(5, 5, 5, 5)) == Arrays.asList(5, 5, 5, 5)
    strangeSortList(Arrays.asList()) == Arrays.asList()
     */
    public List<Integer> strangeSortList(List<Integer> lst) {

            List<Integer> res = new ArrayList<>();
        boolean _switch = true;
        List<Integer> l = new ArrayList<>(lst);
        while (l.size() != 0) {
            if (_switch) {
                res.add(Collections.min(l));
            } else {
                res.add(Collections.max(l));
            }
            l.remove(res.get(res.size() - 1));
            _switch = !_switch;
        }
        return res;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_70_humaneval_guided_tree_of_thought_cd57d23e {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testStrangeSortList_HappyPath() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 2, 3);
        assertEquals(expected, solution.strangeSortList(input));
    }

    @Test
    void testStrangeSortList_AllEqualElements() {
        List<Integer> input = Arrays.asList(5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, solution.strangeSortList(input));
    }

    @Test
    void testStrangeSortList_EmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.strangeSortList(input));
    }

    @Test
    void testStrangeSortList_SingleElement() {
        List<Integer> input = Arrays.asList(10);
        List<Integer> expected = Arrays.asList(10);
        assertEquals(expected, solution.strangeSortList(input));
    }

    @Test
    void testStrangeSortList_TwoElements() {
        List<Integer> input = Arrays.asList(3, 7);
        List<Integer> expected = Arrays.asList(3, 7);
        assertEquals(expected, solution.strangeSortList(input));
    }
}
    