
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
    You will be given the name of a class (a string) and a list of extensions.
    The extensions are to be used to load additional classes to the class. The
    strength of the extension is as follows: Let CAP be the number of the uppercase
    letters in the extension's name, and let SM be the number of lowercase letters
    in the extension's name, the strength is given by the fraction CAP - SM.
    You should find the strongest extension and return a string in this
    format: ClassName.StrongestExtensionName.
    If there are two or more extensions with the same strength, you should
    choose the one that comes first in the list.
    For example, if you are given "Slices" as the class and a list of the
    extensions: ["SErviNGSliCes", "Cheese", "StuFfed"] then you should
    return "Slices.SErviNGSliCes" since "SErviNGSliCes" is the strongest extension
    (its strength is -1).
    Example:
    for StrongestExtension("my_class", ["AA", "Be", "CC"]) == "my_class.AA"
     */
    public String StrongestExtension(String class_name, List<String> extensions) {

            String strong = extensions.get(0);
        int my_val = (int) (strong.chars().filter(Character::isUpperCase).count() - strong.chars().filter(Character::isLowerCase).count());
        for (String s : extensions) {
            int val = (int) (s.chars().filter(Character::isUpperCase).count() - s.chars().filter(Character::isLowerCase).count());
            if (val > my_val) {
                strong = s;
                my_val = val;
            }
        }
        return class_name + "." + strong;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_153_humaneval_role_playing_0f118fe9 {

    @Test
    void should_ReturnStrongestExtension_When_GivenClassNameAndExtensions() {
        // Arrange
        Solution solution = new Solution();
        String className = "Slices";
        List<String> extensions = Arrays.asList("SErviNGSliCes", "Cheese", "StuFfed");

        // Act
        String result = solution.StrongestExtension(className, extensions);

        // Assert
        assertEquals("Slices.SErviNGSliCes", result);
    }

    @Test
    void should_ReturnStrongestExtension_When_GivenClassNameAndExtensionsWithSameStrength() {
        // Arrange
        Solution solution = new Solution();
        String className = "my_class";
        List<String> extensions = Arrays.asList("AA", "Be", "CC");

        // Act
        String result = solution.StrongestExtension(className, extensions);

        // Assert
        assertEquals("my_class.AA", result);
    }

    @Test
    void should_ReturnClassNameOnly_When_GivenEmptyExtensionsList() {
        // Arrange
        Solution solution = new Solution();
        String className = "my_class";
        List<String> extensions = new ArrayList<>();

        // Act
        String result = solution.StrongestExtension(className, extensions);

        // Assert
        assertEquals(className, result);
    }

    @Test
    void should_ReturnStrongestExtension_When_GivenClassNameAndSingleExtension() {
        // Arrange
        Solution solution = new Solution();
        String className = "my_class";
        List<String> extensions = Arrays.asList("SingleExtension");

        // Act
        String result = solution.StrongestExtension(className, extensions);

        // Assert
        assertEquals("my_class.SingleExtension", result);
    }

    @Test
    void should_ReturnStrongestExtension_When_GivenClassNameAndExtensionsWithNull() {
        // Arrange
        Solution solution = new Solution();
        String className = "my_class";
        List<String> extensions = Arrays.asList("SErviNGSliCes", null, "StuFfed");

        // Act
        String result = solution.StrongestExtension(className, extensions);

        // Assert
        assertEquals("my_class.SErviNGSliCes", result);
    }
}
    