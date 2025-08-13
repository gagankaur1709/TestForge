
    import java.lang.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
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
    Given a map, return True if all keys are strings in lower
    case or all keys are strings in upper case, else return False.
    The function should return False is the given map is empty.
    Examples:
    checkDictCase({"a":"apple", "b":"banana"}) should return True.
    checkDictCase({"a":"apple", "A":"banana", "B":"banana"}) should return False.
    checkDictCase({"a":"apple", 8:"banana", "a":"apple"}) should return False.
    checkDictCase({"Name":"John", "Age":"36", "City":"Houston"}) should return False.
    checkDictCase({"STATE":"NC", "ZIP":"12345" }) should return True.
     */
    public boolean checkDictCase(Map<Object, Object> dict) {

            if (dict.isEmpty()) {
            return false;
        }
        String state = "start";
        for (Map.Entry entry : dict.entrySet()) {
            if (!(entry.getKey() instanceof String key)) {
                state = "mixed";
                break;
            }
            boolean is_upper = true, is_lower = true;
            for (char c : key.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    is_upper = false;
                } else if (Character.isUpperCase(c)) {
                    is_lower = false;
                } else {
                    is_upper = false;
                    is_lower = false;
                }
            }
            if (state.equals("start")) {
                if (is_upper) {
                    state = "upper";
                } else if (is_lower) {
                    state = "lower";
                } else {
                    break;
                }
            } else if ((state.equals("upper") && !is_upper) || (state.equals("lower") && !is_lower)) {
                state = "mixed";
                break;
            }
        }
        return state.equals("upper") || state.equals("lower");
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_95_humaneval_role_playing_ead6e3b9 {

    @Test
    void should_return_true_when_all_keys_are_in_lower_case() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(solution.checkDictCase(dict));
    }

    @Test
    void should_return_true_when_all_keys_are_in_upper_case() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        assertTrue(solution.checkDictCase(dict));
    }

    @Test
    void should_return_false_when_dict_is_empty() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        assertFalse(solution.checkDictCase(dict));
    }

    @Test
    void should_return_false_when_keys_are_mixed_case() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        assertFalse(solution.checkDictCase(dict));
    }

    @Test
    void should_return_false_when_keys_are_not_strings() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put(8, "banana");
        dict.put("a", "apple");
        assertFalse(solution.checkDictCase(dict));
    }

    @Test
    void should_return_false_when_keys_are_mixed_case_and_types() {
        Solution solution = new Solution();
        Map<Object, Object> dict = new HashMap<>();
        dict.put("Name", "John");
        dict.put("Age", "36");
        dict.put("City", "Houston");
        assertFalse(solution.checkDictCase(dict));
    }
}
    