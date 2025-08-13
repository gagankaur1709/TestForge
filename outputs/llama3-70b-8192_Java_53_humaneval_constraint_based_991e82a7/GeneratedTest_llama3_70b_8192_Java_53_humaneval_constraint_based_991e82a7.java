
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
    Add two numbers x and y
    >>> add(2, 3)
    5
    >>> add(5, 7)
    12
     */
    public int add(int x, int y) {

            return x + y;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_53_humaneval_constraint_based_991e82a7 {
    private Solution solution = new Solution();

    @Test
    void testAddHappyPath() {
        assertEquals(5, solution.add(2, 3));
        assertEquals(12, solution.add(5, 7));
    }

    @Test
    void testAddEdgeCaseZero() {
        assertEquals(0, solution.add(0, 0));
    }

    @Test
    void testAddEdgeCaseNegative() {
        assertEquals(-5, solution.add(-2, -3));
    }
}
    