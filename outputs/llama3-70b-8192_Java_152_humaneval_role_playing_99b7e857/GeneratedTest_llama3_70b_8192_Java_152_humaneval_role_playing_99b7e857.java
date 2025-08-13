
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
    I think we all remember that feeling when the result of some long-awaited
    event is finally known. The feelings and thoughts you have at that moment are
    definitely worth noting down and comparing.
    Your task is to determine if a person correctly guessed the results of a number of matches.
    You are given two arrays of scores and guesses of equal length, where each index shows a match.
    Return an array of the same length denoting how far off each guess was. If they have guessed correctly,
    the value is 0, and if not, the value is the absolute difference between the guess and the score.

    example:

    compare(Arrays.asList(1,2,3,4,5,1),Arrays.asList(1,2,3,4,2,-2)) -> [0,0,0,0,3,3]
    compare(Arrays.asList(0,5,0,0,0,4),Arrays.asList(4,1,1,0,0,-2)) -> [4,4,1,0,0,6]
     */
    public List<Integer> compare(List<Integer> game, List<Integer> guess) {

            List<Integer> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            result.add(Math.abs(game.get(i) - guess.get(i)));
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_152_humaneval_role_playing_99b7e857 {

    @Test
    void should_return_zero_when_guess_is_correct() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(1, 2, 3);

        // Act
        List<Integer> result = solution.compare(game, guess);

        // Assert
        assertEquals(Arrays.asList(0, 0, 0), result);
    }

    @Test
    void should_return_absolute_difference_when_guess_is_incorrect() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(2, 3, 4);

        // Act
        List<Integer> result = solution.compare(game, guess);

        // Assert
        assertEquals(Arrays.asList(1, 1, 1), result);
    }

    @Test
    void should_handle_empty_lists() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();

        // Act
        List<Integer> result = solution.compare(game, guess);

        // Assert
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void should_handle_lists_with_negative_numbers() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(1, -2, 3);
        List<Integer> guess = Arrays.asList(2, -3, 4);

        // Act
        List<Integer> result = solution.compare(game, guess);

        // Assert
        assertEquals(Arrays.asList(1, 1, 1), result);
    }

    @Test
    void should_handle_lists_with_large_numbers() {
        // Arrange
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(100, 200, 300);
        List<Integer> guess = Arrays.asList(150, 250, 350);

        // Act
        List<Integer> result = solution.compare(game, guess);

        // Assert
        assertEquals(Arrays.asList(50, 50, 50), result);
    }
}
    