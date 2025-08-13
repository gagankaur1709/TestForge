
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
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
    Return median of elements in the list l.
    >>> median(Arrays.asList(3, 1, 2, 4, 5))
    3
    >>> median(Arrays.asList(-10, 4, 6, 1000, 10, 20))
    15.0
     */
    public double median(List<Integer> l) {

            List<Integer> list = l;
        Collections.sort(list);
        if (l.size() % 2 == 1) {
            return l.get(l.size() / 2);
        } else {
            return (l.get(l.size() / 2 - 1) + l.get(l.size() / 2)) / 2.0;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_47_humaneval_role_playing_26d80429 {

    @Test
    void shouldReturnMedianWhenListHasOddSize() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(3, 1, 2, 4, 5);
        
        // Act
        double result = solution.median(list);
        
        // Assert
        assertEquals(3, result);
    }

    @Test
    void shouldReturnMedianWhenListHasEvenSize() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        
        // Act
        double result = solution.median(list);
        
        // Assert
        assertEquals(15.0, result);
    }

    @Test
    void shouldReturnMedianWhenListHasOneElement() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(5);
        
        // Act
        double result = solution.median(list);
        
        // Assert
        assertEquals(5, result);
    }

    @Test
    void shouldReturnMedianWhenListHasTwoElements() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(2, 4);
        
        // Act
        double result = solution.median(list);
        
        // Assert
        assertEquals(3.0, result);
    }

    @Test
    void shouldSortListWhenCalculatingMedian() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = mock(List.class);
        Collections.singletonList(list);
        
        // Act
        solution.median(list);
        
        // Assert
        verify(list).sort();
    }
}
    