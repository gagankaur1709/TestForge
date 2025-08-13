
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
    Return 2^n modulo p (be aware of numerics).
    >>> modp(3, 5)
    3
    >>> modp(1101, 101)
    2
    >>> modp(0, 101)
    1
    >>> modp(3, 11)
    8
    >>> modp(100, 101)
    1
     */
    public int modp(int n, int p) {

            int ret = 1;
        for (int i = 0; i < n; i++) {
            ret = (ret * 2) % p;
        }
        return ret;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_49_humaneval_guided_tree_of_thought_80b11a4e {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testModp_HappyPath_SmallInput() {
        assertEquals(3, solution.modp(3, 5));
    }

    @Test
    void testModp_HappyPath_LargeInput() {
        assertEquals(2, solution.modp(1101, 101));
    }

    @Test
    void testModp_EdgeCase_ZeroInput() {
        assertEquals(1, solution.modp(0, 101));
    }

    @Test
    void testModp_HappyPath_MediumInput() {
        assertEquals(8, solution.modp(3, 11));
    }

    @Test
    void testModp_EdgeCase_LargeInput() {
        assertEquals(1, solution.modp(100, 101));
    }
}
    