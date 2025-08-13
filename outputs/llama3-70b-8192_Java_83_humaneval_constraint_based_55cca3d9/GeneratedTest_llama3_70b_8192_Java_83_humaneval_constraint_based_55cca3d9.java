
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
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
    Given a positive integer n, return the count of the numbers of n-digit
    positive integers that start or end with 1.
     */
    public int startsOneEnds(int n) {

            if (n == 1) {
            return 1;
        }
        return 18 * (int) Math.pow(10, n - 2);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_83_humaneval_constraint_based_55cca3d9 {
    private Solution solution = new Solution();

    @Test
    @DisplayName("Test for n = 1")
    void testStartsOneEnds_nIs1() {
        assertEquals(1, solution.startsOneEnds(1));
    }

    @Test
    @DisplayName("Test for n = 2")
    void testStartsOneEnds_nIs2() {
        assertEquals(18, solution.startsOneEnds(2));
    }

    @Test
    @DisplayName("Test for n = 3")
    void testStartsOneEnds_nIs3() {
        assertEquals(180, solution.startsOneEnds(3));
    }

    @Test
    @DisplayName("Test for n = 4")
    void testStartsOneEnds_nIs4() {
        assertEquals(1800, solution.startsOneEnds(4));
    }
}
    