
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_17_humaneval_role_playing_eeb5e61f {

    @Test
    void should_return_empty_list_when_input_is_empty_string() {
        Solution solution = new Solution();
        List<Integer> result = solution.parseMusic("");
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void should_return_list_with_single_element_when_input_contains_single_note() {
        Solution solution = new Solution();
        List<Integer> result = solution.parseMusic("o");
        assertEquals(List.of(4), result);
    }

    @Test
    void should_return_list_with_multiple_elements_when_input_contains_multiple_notes() {
        Solution solution = new Solution();
        List<Integer> result = solution.parseMusic("o o| .| o| o| .| .| .| .| o o");
        assertEquals(List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4), result);
    }

    @Test
    void should_return_list_with_elements_in_correct_order_when_input_contains_notes_in_mixed_order() {
        Solution solution = new Solution();
        List<Integer> result = solution.parseMusic("o| .| o o| .| .| .| .| o");
        assertEquals(List.of(2, 1, 4, 2, 1, 1, 1, 1, 4), result);
    }

    @Test
    void should_throw_runtime_exception_when_input_contains_unknown_note() {
        Solution solution = new Solution();
        assertThrows(RuntimeException.class, () -> solution.parseMusic("o o| .| x o| o| .| .| .| .| o o"));
    }

    @Test
    void should_throw_runtime_exception_when_input_contains_null() {
        Solution solution = new Solution();
        assertThrows(NullPointerException.class, () -> solution.parseMusic(null));
    }
}
    