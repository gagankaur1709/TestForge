
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
    You are given a list of two strings, both strings consist of open
    parentheses "(" or close parentheses ")" only.
    Your job is to check if it is possible to concatenate the two strings in
    some order, that the resulting string will be good.
    A string S is considered to be good if and only if all parentheses in S
    are balanced. For example: the string "(())()" is good, while the string
    "())" is not.
    Return "Yes" if there"s a way to make a good string, and return "No" otherwise.

    Examples:
    matchParens(Arrays.asList("()(", ")")) == "Yes"
    matchParens(Arrays.asList(")", ")")) == "No"
     */
    public String matchParens(List<String> lst) {

            List<String> S = Arrays.asList(lst.get(0) + lst.get(1), lst.get(1) + lst.get(0));
        for (String s : S) {
            int val = 0;
            for (char i : s.toCharArray()) {
                if (i == '(') {
                    val += 1;
                } else {
                    val -= 1;
                }
                if (val < 0) {
                    break;
                }
            }
            if (val == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_119_humaneval_constraint_based_20c7f680 {

    @Test
    void testMatchParens_HappyPath() {
        Solution solution = new Solution();
        List<String> input = Arrays.asList("()(", ")");
        assertEquals("Yes", solution.matchParens(input));
    }

    @Test
    void testMatchParens_EmptyInput() {
        Solution solution = new Solution();
        List<String> input = Arrays.asList("", "");
        assertEquals("Yes", solution.matchParens(input));
    }

    @Test
    void testMatchParens_UnbalancedInput() {
        Solution solution = new Solution();
        List<String> input = Arrays.asList(")", ")");
        assertEquals("No", solution.matchParens(input));
    }

    @Test
    void testMatchParens_SingleParenthesesInput() {
        Solution solution = new Solution();
        List<String> input = Arrays.asList("(", ")");
        assertEquals("Yes", solution.matchParens(input));
    }
}
    