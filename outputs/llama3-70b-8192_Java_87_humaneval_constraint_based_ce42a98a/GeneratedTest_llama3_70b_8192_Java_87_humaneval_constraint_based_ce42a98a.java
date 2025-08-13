
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of lists, [[x1, y1], [x2, y2] ...] such that
    each list is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by rows in ascending order.
    Also, sort coordinates of the row by columns in descending order.

    Examples:
    getRow([
      [1,2,3,4,5,6],
      [1,2,3,4,1,6],
      [1,2,3,4,5,1]
    ], 1) == [[0, 0], [1, 4], [1, 0], [2, 5], [2, 0]]
    getRow([], 1) == []
    getRow([[], [1], [1, 2, 3]], 3) == [[2, 2]]
     */
    public List<List<Integer>> getRow(List<List<Integer>> lst, int x) {

            List<List<Integer>> coords = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            List<List<Integer>> row = new ArrayList<>();
            for (int j = lst.get(i).size() - 1; j >= 0; j--) {
                if (lst.get(i).get(j) == x) {
                    row.add(Arrays.asList(i, j));
                }
            }
            coords.addAll(row);
        }
        return coords;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_87_humaneval_constraint_based_ce42a98a {
    @Test
    void testGetRow_HappyPath() {
        Solution solution = new Solution();
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1,2,3,4,5,6));
        lst.add(Arrays.asList(1,2,3,4,1,6));
        lst.add(Arrays.asList(1,2,3,4,5,1));
        int x = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(2, 5));
        expected.add(Arrays.asList(2, 0));
        assertEquals(expected, solution.getRow(lst, x));
    }

    @Test
    void testGetRow_EmptyList() {
        Solution solution = new Solution();
        List<List<Integer>> lst = new ArrayList<>();
        int x = 1;
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.getRow(lst, x));
    }

    @Test
    void testGetRow_SingleElementList() {
        Solution solution = new Solution();
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1));
        int x = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        assertEquals(expected, solution.getRow(lst, x));
    }

    @Test
    void testGetRow_NoMatch() {
        Solution solution = new Solution();
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(2,3,4,5,6));
        lst.add(Arrays.asList(2,3,4,5,6));
        lst.add(Arrays.asList(2,3,4,5,6));
        int x = 1;
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.getRow(lst, x));
    }
}
    