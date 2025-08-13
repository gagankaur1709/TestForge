
    import java.lang.*;
import java.util.*;
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
    Given an integer. return a tuple that has the number of even and odd digits respectively.
    
     Example:
        evenOddCount(-12) ==> (1, 1)
        evenOddCount(123) ==> (1, 2)
     */
    public List<Integer> evenOddCount(int num) {

            int even_count = 0, odd_count = 0;
        for (char i : String.valueOf(Math.abs(num)).toCharArray()) {
            if ((i - '0') % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
        }
        return Arrays.asList(even_count, odd_count);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_155_humaneval_role_playing_af7ff3a8 {

    private Solution solution = new Solution();

    @Test
    void should_return_even_and_odd_counts_when_number_is_positive() {
        // Arrange
        int num = 123;
        List<Integer> expected = Arrays.asList(1, 2);

        // Act
        List<Integer> result = solution.evenOddCount(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_return_even_and_odd_counts_when_number_is_negative() {
        // Arrange
        int num = -12;
        List<Integer> expected = Arrays.asList(1, 1);

        // Act
        List<Integer> result = solution.evenOddCount(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_return_even_and_odd_counts_when_number_is_zero() {
        // Arrange
        int num = 0;
        List<Integer> expected = Arrays.asList(1, 0);

        // Act
        List<Integer> result = solution.evenOddCount(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_return_even_and_odd_counts_when_number_has_multiple_digits() {
        // Arrange
        int num = 12345;
        List<Integer> expected = Arrays.asList(2, 3);

        // Act
        List<Integer> result = solution.evenOddCount(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void should_return_even_and_odd_counts_when_number_has_single_digit() {
        // Arrange
        int num = 5;
        List<Integer> expected = Arrays.asList(0, 1);

        // Act
        List<Integer> result = solution.evenOddCount(num);

        // Assert
        assertEquals(expected, result);
    }
}
    