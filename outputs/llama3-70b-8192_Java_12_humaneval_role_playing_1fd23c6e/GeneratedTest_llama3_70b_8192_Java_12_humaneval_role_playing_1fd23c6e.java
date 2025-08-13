
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
    Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest(List.of())
    Optional.empty
    >>> longest(Arrays.asList("a", "b", "c"))
    Optional[a]
    >>> longest(Arrays.asList("a", "bb", "ccc"))
    Optional[ccc]
     */
    public Optional<String> longest(List<String> strings) {

            if (strings.isEmpty()) {
            return Optional.empty();
        }
        String longest = strings.get(0);
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return Optional.of(longest);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_12_humaneval_role_playing_1fd23c6e {

    @Test
    void shouldReturnEmptyOptionalWhenInputListIsEmpty() {
        // Arrange
        Solution solution = new Solution();
        List<String> emptyList = Arrays.asList();

        // Act
        Optional<String> result = solution.longest(emptyList);

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnFirstStringWhenAllStringsHaveSameLength() {
        // Arrange
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("a", "b", "c");

        // Act
        Optional<String> result = solution.longest(strings);

        // Assert
        assertEquals("a", result.get());
    }

    @Test
    void shouldReturnLongestStringWhenThereIsOne() {
        // Arrange
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("a", "bb", "ccc");

        // Act
        Optional<String> result = solution.longest(strings);

        // Assert
        assertEquals("ccc", result.get());
    }

    @Test
    void shouldReturnFirstLongestStringWhenThereAreMultipleLongestStrings() {
        // Arrange
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("a", "bb", "ccc", "ccc");

        // Act
        Optional<String> result = solution.longest(strings);

        // Assert
        assertEquals("ccc", result.get());
    }
}
    