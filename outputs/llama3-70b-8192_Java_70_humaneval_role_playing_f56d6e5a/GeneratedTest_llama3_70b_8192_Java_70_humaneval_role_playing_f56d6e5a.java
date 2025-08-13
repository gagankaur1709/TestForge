
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_70_humaneval_role_playing_f56d6e5a {

    @Test
    void should_return_empty_list_when_input_is_empty() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> input = new ArrayList<>();

        // Act
        List<Integer> result = solution.strangeSortList(input);

        // Assert
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void should_return_single_element_list_when_input_has_single_element() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(5);

        // Act
        List<Integer> result = solution.strangeSortList(input);

        // Assert
        assertEquals(Arrays.asList(5), result);
    }

    @Test
    void should_return_list_in_strange_order_when_input_has_multiple_elements() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 4);

        // Act
        List<Integer> result = solution.strangeSortList(input);

        // Assert
        assertEquals(Arrays.asList(1, 4, 2, 3), result);
    }

    @Test
    void should_return_list_in_strange_order_when_input_has_duplicates() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(5, 5, 5, 5);

        // Act
        List<Integer> result = solution.strangeSortList(input);

        // Assert
        assertEquals(Arrays.asList(5, 5, 5, 5), result);
    }

    @Test
    void should_return_list_in_strange_order_when_input_has_negative_numbers() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(-5, -3, -1, 0);

        // Act
        List<Integer> result = solution.strangeSortList(input);

        // Assert
        assertEquals(Arrays.asList(-5, 0, -3, -1), result);
    }
}
    