
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
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
    Create a function which takes a string representing a file's name, and returns
    "Yes" if the the file's name is valid, and returns "No" otherwise.
    A file's name is considered to be valid if and only if all the following conditions
    are met:
    - There should not be more than three digits ('0'-'9') in the file's name.
    - The file's name contains exactly one dot '.'
    - The substring before the dot should not be empty, and it starts with a letter from
    the latin alphapet ('a'-'z' and 'A'-'Z').
    - The substring after the dot should be one of these: ["txt", "exe", "dll"]
    Examples:
    file_name_check("example.txt") # => "Yes"
    file_name_check("1example.dll") # => "No" (the name should start with a latin alphapet letter)
     */
    public String filenameCheck(String file_name) {

            List<String> suf = Arrays.asList("txt", "exe", "dll");
        String[] lst = file_name.split("\\." );
        if (lst.length != 2 || !suf.contains(lst[1]) || lst[0].isEmpty() || !Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = (int) lst[0].chars().map(x -> (char) x).filter(Character::isDigit).count();
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_141_humaneval_role_playing_a4e9528d {

    @Test
    void should_return_yes_when_file_name_is_valid() {
        Solution solution = new Solution();
        assertEquals("Yes", solution.filenameCheck("example.txt"));
    }

    @Test
    void should_return_no_when_file_name_starts_with_digit() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("1example.dll"));
    }

    @Test
    void should_return_no_when_file_name_has_more_than_three_digits() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("1234example.txt"));
    }

    @Test
    void should_return_no_when_file_name_has_no_dot() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("example"));
    }

    @Test
    void should_return_no_when_file_name_has_multiple_dots() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("example.txt.dll"));
    }

    @Test
    void should_return_no_when_file_name_extension_is_invalid() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("example.pdf"));
    }

    @Test
    void should_return_no_when_file_name_starts_with_non_latin_character() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck("例example.txt"));
    }

    @Test
    void should_return_no_when_file_name_is_empty() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck(""));
    }

    @Test
    void should_return_no_when_file_name_before_dot_is_empty() {
        Solution solution = new Solution();
        assertEquals("No", solution.filenameCheck(".txt"));
    }
}
    