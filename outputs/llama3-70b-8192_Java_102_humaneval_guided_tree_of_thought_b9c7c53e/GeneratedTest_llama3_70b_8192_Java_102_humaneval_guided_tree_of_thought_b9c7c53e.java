
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
    
    public class GeneratedTest_llama3_70b_8192_Java_102_humaneval_guided_tree_of_thought_b9c7c53e {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testChooseNum_HappyPath_EvenNumberInRange() {
        assertEquals(14, solution.chooseNum(12, 15));
    }

    @Test
    void testChooseNum_HappyPath_OddNumberInRange() {
        assertEquals(14, solution.chooseNum(12, 14));
    }

    @Test
    void testChooseNum_EdgeCase_SwapInputNumbers() {
        assertEquals(-1, solution.chooseNum(15, 12));
    }

    @Test
    void testChooseNum_EdgeCase_SameInputNumbers() {
        assertEquals(-1, solution.chooseNum(12, 12));
    }

    @Test
    void testChooseNum_EdgeCase_MinimalValidInput() {
        assertEquals(2, solution.chooseNum(1, 2));
    }

    @Test
    void testChooseNum_EdgeCase_MaximalValidInput() {
        assertEquals(Integer.MAX_VALUE, solution.chooseNum(Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
    }
}
    