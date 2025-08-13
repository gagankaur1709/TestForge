
    import java.lang.*;
import java.math.BigInteger;
import java.security.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.Optional;
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
    
    
    import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a string "text", return its md5 hash equivalent string with length being 32.
    If "text" is an empty string, return Optional.empty().
    
    >>> stringToMd5("Hello world") == "3e25960a79dbc69b674cd4ec67a72c62"
     */
    public Optional<String> stringToMd5(String text) throws NoSuchAlgorithmException {

            if (text.isEmpty()) {
            return Optional.empty();
        }

        String md5 = new BigInteger(1, java.security.MessageDigest.getInstance("MD5").digest(text.getBytes())).toString(16);
        md5 = "0".repeat(32 - md5.length()) + md5;
        return Optional.of(md5);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_162_humaneval_role_playing_2b9000e7 {

    @Test
    void should_return_empty_optional_when_input_is_empty_string() {
        // Arrange
        Solution solution = new Solution();
        String text = "";

        // Act
        Optional<String> result = solution.stringToMd5(text);

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    void should_return_md5_hash_string_when_input_is_non_empty_string() throws NoSuchAlgorithmException {
        // Arrange
        Solution solution = new Solution();
        String text = "Hello world";
        MessageDigest messageDigest = mock(MessageDigest.class);
        when(java.security.MessageDigest.getInstance("MD5")).thenReturn(messageDigest);
        when(messageDigest.digest(text.getBytes())).thenReturn(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});

        // Act
        Optional<String> result = solution.stringToMd5(text);

        // Assert
        assertEquals("0102030405060708090a0b0c0d0e0f10", result.get());
    }

    @Test
    void should_throw_noSuchAlgorithmException_when_md5_algorithm_is_not_available() {
        // Arrange
        Solution solution = new Solution();
        String text = "Hello world";

        // Act and Assert
        NoSuchAlgorithmException exception = assertThrows(NoSuchAlgorithmException.class, () -> solution.stringToMd5(text));
        assertEquals("MD5 MessageDigest not available", exception.getMessage());
    }
}
    