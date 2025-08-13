
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
    Return length of given string
    >>> strlen("")
    0
    >>> strlen("abc")
    3
     */
    public int strlen(String string) {

            return string.length();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_23_humaneval_role_playing_ce76394d {

    private Solution solution = new Solution();

    @Test
    void shouldReturnZeroWhenInputIsEmptyString() {
        // Arrange
        String input = "";

        // Act
        int result = solution.strlen(input);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void shouldReturnLengthOfNonEmptyString() {
        // Arrange
        String input = "abc";

        // Act
        int result = solution.strlen(input);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void shouldReturnOneWhenInputHasOneCharacter() {
        // Arrange
        String input = "a";

        // Act
        int result = solution.strlen(input);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void shouldReturnLengthOfLongString() {
        // Arrange
        String input = "abcdefghijklmnopqrstuvwxyz";

        // Act
        int result = solution.strlen(input);

        // Assert
        assertEquals(26, result);
    }
}
    