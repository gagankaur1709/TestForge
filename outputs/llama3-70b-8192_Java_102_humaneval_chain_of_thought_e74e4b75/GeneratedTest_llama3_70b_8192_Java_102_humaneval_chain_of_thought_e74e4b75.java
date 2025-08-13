
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
    This function takes two positive numbers x and y and returns the
    biggest even integer number that is in the range [x, y] inclusive. If
    there's no such number, then the function should return -1.
    
    For example:
    chooseNum(12, 15) = 14
    chooseNum(13, 12) = -1
     */
    public int chooseNum(int x, int y) {

            if (x > y) {
            return -1;
        }
        if (y % 2 == 0) {
            return y;
        }
        if (x == y) {
            return -1;
        }
        return y - 1;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_102_humaneval_chain_of_thought_e74e4b75 {
    private Solution solution = new Solution();

    @Test
    void testChooseNum_HappyPath() {
        assertEquals(14, solution.chooseNum(12, 15));
    }

    @Test
    void testChooseNum_SwapInput() {
        assertEquals(-1, solution.chooseNum(13, 12));
    }

    @Test
    void testChooseNum_SameInput() {
        assertEquals(-1, solution.chooseNum(12, 12));
    }

    @Test
    void testChooseNum_EvenInput() {
        assertEquals(10, solution.chooseNum(5, 10));
    }

    @Test
    void testChooseNum_OddInput() {
        assertEquals(9, solution.chooseNum(5, 10));
    }
}
    