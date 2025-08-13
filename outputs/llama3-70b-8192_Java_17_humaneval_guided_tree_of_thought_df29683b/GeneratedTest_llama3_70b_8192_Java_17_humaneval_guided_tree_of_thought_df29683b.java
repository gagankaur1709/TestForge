
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    Input to this function is a string representing musical notes in a special ASCII format.
    Your task is to parse this string and return list of integers corresponding to how many beats does each
    not last.

    Here is a legend:
    "o" - whole note, lasts four beats
    "o|" - half note, lasts two beats
    ".|" - quater note, lasts one beat

    >>> parseMusic("o o| .| o| o| .| .| .| .| o o")
    [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     */
    public List<Integer> parseMusic(String string) {

            String[] notes = string.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : notes) {
            switch (s) {
                case "o" -> result.add(4);
                case "o|" -> result.add(2);
                case ".|" -> result.add(1);
            }
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_17_humaneval_guided_tree_of_thought_df29683b {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testParseMusicHappyPath() {
        String music = "o o| .| o| o| .| .| .| .| o o";
        List<Integer> expected = new ArrayList<>(List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4));
        assertEquals(expected, solution.parseMusic(music));
    }

    @Test
    void testParseMusicEmptyInput() {
        String music = "";
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.parseMusic(music));
    }

    @Test
    void testParseMusicSingleNote() {
        String music = "o";
        List<Integer> expected = new ArrayList<>(List.of(4));
        assertEquals(expected, solution.parseMusic(music));
    }

    @Test
    void testParseMusicMultipleSpaces() {
        String music = "o   o| .| o| o| .| .| .| .| o o";
        List<Integer> expected = new ArrayList<>(List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4));
        assertEquals(expected, solution.parseMusic(music));
    }

    @Test
    void testParseMusicUnknownNote() {
        String music = "o o| .| o| o| .| .| .| .| x o o";
        List<Integer> expected = new ArrayList<>(List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4));
        assertEquals(expected, solution.parseMusic(music));
    }
}
    