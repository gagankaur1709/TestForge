
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
    Write a function that takes an integer a and returns true
    if this ingeger is a cube of some integer number.
    Note: you may assume the input is always valid.
    Examples:
    iscube(1) ==> true
    iscube(2) ==> false
    iscube(-1) ==> true
    iscube(64) ==> true
    iscube(0) ==> true
    iscube(180) ==> false
     */
    public boolean iscube(int a) {

            a = Math.abs(a);
        return Math.round(Math.pow(Math.round(Math.pow(a, 1. / 3)), 3)) == a;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_77_humaneval_guided_tree_of_thought_397e0c1b {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testIscube_1() {
        assertTrue(solution.iscube(1));
    }

    @Test
    void testIscube_2() {
        assertFalse(solution.iscube(2));
    }

    @Test
    void testIscube_Negative1() {
        assertTrue(solution.iscube(-1));
    }

    @Test
    void testIscube_64() {
        assertTrue(solution.iscube(64));
    }

    @Test
    void testIscube_0() {
        assertTrue(solution.iscube(0));
    }

    @Test
    void testIscube_180() {
        assertFalse(solution.iscube(180));
    }

    @Test
    void testIscube_27() {
        assertTrue(solution.iscube(27));
    }

    @Test
    void testIscube_125() {
        assertTrue(solution.iscube(125));
    }
}
    