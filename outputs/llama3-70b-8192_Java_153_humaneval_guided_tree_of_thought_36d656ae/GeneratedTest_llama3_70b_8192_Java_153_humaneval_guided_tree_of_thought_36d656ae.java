
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_153_humaneval_guided_tree_of_thought_36d656ae {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testStrongestExtensionHappyPath() {
        List<String> extensions = new ArrayList<>();
        extensions.add("SErviNGSliCes");
        extensions.add("Cheese");
        extensions.add("StuFfed");
        assertEquals("Slices.SErviNGSliCes", solution.StrongestExtension("Slices", extensions));
    }

    @Test
    void testStrongestExtensionSingleExtension() {
        List<String> extensions = new ArrayList<>();
        extensions.add("AA");
        assertEquals("my_class.AA", solution.StrongestExtension("my_class", extensions));
    }

    @Test
    void testStrongestExtensionMultipleExtensionsSameStrength() {
        List<String> extensions = new ArrayList<>();
        extensions.add("AA");
        extensions.add("BB");
        assertEquals("my_class.AA", solution.StrongestExtension("my_class", extensions));
    }

    @Test
    void testStrongestExtensionEmptyExtensions() {
        List<String> extensions = new ArrayList<>();
        assertEquals("Slices.", solution.StrongestExtension("Slices", extensions));
    }

    @Test
    void testStrongestExtensionNullExtensions() {
        assertEquals("Slices.", solution.StrongestExtension("Slices", null));
    }
}
    