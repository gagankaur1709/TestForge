
    import java.lang.*;
import java.util.*;
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
    Return maximum element in the list.
    >>> maxElement(Arrays.asList(1, 2, 3))
    3
    >>> maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
    123
     */
    public int maxElement(List<Integer> l) {

            return Collections.max(l);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_35_humaneval_role_playing_dac6ebb5 {

    @Test
    void should_ReturnMaxElement_When_ListHasMultipleElements() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(1, 2, 3);

        // Act
        int result = solution.maxElement(list);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void should_ReturnMaxElement_When_ListHasMultipleElementsWithNegativeNumbers() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);

        // Act
        int result = solution.maxElement(list);

        // Assert
        assertEquals(123, result);
    }

    @Test
    void should_ReturnSingleElement_When_ListHasSingleElement() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = Collections.singletonList(5);

        // Act
        int result = solution.maxElement(list);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void should_ThrowException_When_ListIsNull() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = null;

        // Act and Assert
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> solution.maxElement(list));
        assertEquals("Cannot invoke \"java.util.List.iterator()\" because \"l\" is null", exception.getMessage());
    }

    @Test
    void should_ThrowException_When_ListIsEmpty() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>();

        // Act and Assert
        NoSuchElementException exception = Assertions.assertThrows(NoSuchElementException.class, () -> solution.maxElement(list));
        assertEquals("No value present", exception.getMessage());
    }
}
    