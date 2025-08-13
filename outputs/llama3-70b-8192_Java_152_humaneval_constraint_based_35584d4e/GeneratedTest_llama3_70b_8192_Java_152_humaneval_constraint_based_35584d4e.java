
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
    
    public class GeneratedTest_llama3_70b_8192_Java_152_humaneval_constraint_based_35584d4e {

    @Test
    void testCompare_HappyPath() {
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        assertEquals(expected, solution.compare(game, guess));
    }

    @Test
    void testCompare_EdgeCase_EmptyLists() {
        Solution solution = new Solution();
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.compare(game, guess));
    }

    @Test
    void testCompare_EdgeCase_SingleElementLists() {
        Solution solution = new Solution();
        List<Integer> game = Arrays.asList(5);
        List<Integer> guess = Arrays.asList(10);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, solution.compare(game, guess));
    }
}
    