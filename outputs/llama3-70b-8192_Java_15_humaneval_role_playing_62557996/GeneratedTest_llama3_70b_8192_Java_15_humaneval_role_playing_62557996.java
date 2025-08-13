
    import java.lang.*;
import java.util.*;
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
    Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    >>> stringSequence(0)
    "0"
    >>> stringSequence(5)
    "0 1 2 3 4 5"
     */
    public String stringSequence(int n) {

            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
            sb.append(" ");
        }
        sb.append(n);
        return sb.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_15_humaneval_role_playing_62557996 {

    @Test
    void should_return_single_number_when_n_is_zero() {
        Solution solution = new Solution();
        assertEquals("0", solution.stringSequence(0));
    }

    @Test
    void should_return_space_delimited_numbers_when_n_is_positive() {
        Solution solution = new Solution();
        assertEquals("0 1 2 3 4 5", solution.stringSequence(5));
    }

    @Test
    void should_return_empty_string_when_n_is_negative() {
        Solution solution = new Solution();
        assertEquals("", solution.stringSequence(-1));
    }

    @Test
    void should_return_single_number_when_n_is_one() {
        Solution solution = new Solution();
        assertEquals("0 1", solution.stringSequence(1));
    }
}
    