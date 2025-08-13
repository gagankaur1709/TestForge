
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
    
    public class GeneratedTest_llama3_70b_8192_Java_141_humaneval_constraint_based_7778ccd2 {
    Solution solution = new Solution();

    @Test
    void testValidFilename() {
        assertEquals("Yes", solution.filenameCheck("example.txt"));
        assertEquals("Yes", solution.filenameCheck("file.exe"));
        assertEquals("Yes", solution.filenameCheck("document.dll"));
    }

    @Test
    void testInvalidFilename() {
        assertEquals("No", solution.filenameCheck("1example.dll"));
        assertEquals("No", solution.filenameCheck(".txt"));
        assertEquals("No", solution.filenameCheck("file"));
        assertEquals("No", solution.filenameCheck("file.pdf"));
        assertEquals("No", solution.filenameCheck("123456.txt"));
        assertEquals("No", solution.filenameCheck("123a.txt"));
    }

    @Test
    void testEdgeCases() {
        assertEquals("No", solution.filenameCheck(""));
        assertEquals("No", solution.filenameCheck(null));
        assertEquals("No", solution.filenameCheck("file."));
        assertEquals("No", solution.filenameCheck(".dll"));
    }
}
    