
    import java.lang.*;
import java.math.BigInteger;
import java.security.*;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_162_humaneval_constraint_based_d0a3240b {
    @Test
    void testStringToMd5_HappyPath() throws NoSuchAlgorithmException {
        Solution solution = new Solution();
        String input = "Hello world";
        String expected = "3e25960a79dbc69b674cd4ec67a72c62";
        Optional<String> result = solution.stringToMd5(input);
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void testStringToMd5_EmptyInput() throws NoSuchAlgorithmException {
        Solution solution = new Solution();
        String input = "";
        Optional<String> result = solution.stringToMd5(input);
        assertFalse(result.isPresent());
    }

    @Test
    void testStringToMd5_SingleCharacterInput() throws NoSuchAlgorithmException {
        Solution solution = new Solution();
        String input = "a";
        String expected = "0ca476a7197045d2f9f9a9f1a5a3a5a";
        Optional<String> result = solution.stringToMd5(input);
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }
}
    