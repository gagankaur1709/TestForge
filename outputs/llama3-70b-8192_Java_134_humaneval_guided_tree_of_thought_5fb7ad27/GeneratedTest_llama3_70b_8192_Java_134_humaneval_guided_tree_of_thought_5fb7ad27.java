
    import java.lang.*;
import java.util.*;
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
    Create a function that returns true if the last character
    of a given string is an alphabetical character and is not
    a part of a word, and false otherwise.
    Note: "word" is a group of characters separated by space.

    Examples:
    checkIfLastCharIsALetter("apple pie") -> false
    checkIfLastCharIsALetter("apple pi e") -> true
    checkIfLastCharIsALetter("apple pi e ") -> false
    checkIfLastCharIsALetter("") -> false
     */
    public boolean checkIfLastCharIsALetter(String txt) {

            String[] words = txt.split(" ", -1);
        String check = words[words.length - 1];
        return check.length() == 1 && Character.isLetter(check.charAt(0));
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_134_humaneval_guided_tree_of_thought_5fb7ad27 {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testCheckIfLastCharIsALetter_ApplePie_ReturnsFalse() {
        assertFalse(solution.checkIfLastCharIsALetter("apple pie"));
    }

    @Test
    void testCheckIfLastCharIsALetter_ApplePiE_ReturnsTrue() {
        assertTrue(solution.checkIfLastCharIsALetter("apple pi e"));
    }

    @Test
    void testCheckIfLastCharIsALetter_ApplePiEWithSpace_ReturnsFalse() {
        assertFalse(solution.checkIfLastCharIsALetter("apple pi e "));
    }

    @Test
    void testCheckIfLastCharIsALetter_EmptyString_ReturnsFalse() {
        assertFalse(solution.checkIfLastCharIsALetter(""));
    }

    @Test
    void testCheckIfLastCharIsALetter_SingleLetter_ReturnsTrue() {
        assertTrue(solution.checkIfLastCharIsALetter(" a"));
    }

    @Test
    void testCheckIfLastCharIsALetter_MultiLetter_ReturnsFalse() {
        assertFalse(solution.checkIfLastCharIsALetter(" apple"));
    }
}
    