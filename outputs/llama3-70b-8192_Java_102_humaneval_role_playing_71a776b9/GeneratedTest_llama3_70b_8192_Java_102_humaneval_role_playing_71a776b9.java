
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
    
    public class GeneratedTest_llama3_70b_8192_Java_102_humaneval_role_playing_71a776b9 {

    @Test
    void shouldReturnLargestEvenNumberWhenInRange() {
        Solution solution = new Solution();
        assertEquals(14, solution.chooseNum(12, 15));
    }

    @Test
    void shouldReturnMinusOneWhenXIsGreaterThanY() {
        Solution solution = new Solution();
        assertEquals(-1, solution.chooseNum(15, 12));
    }

    @Test
    void shouldReturnMinusOneWhenNoEvenNumberInRange() {
        Solution solution = new Solution();
        assertEquals(-1, solution.chooseNum(13, 14));
    }

    @Test
    void shouldReturnYWhenYIsEven() {
        Solution solution = new Solution();
        assertEquals(16, solution.chooseNum(12, 16));
    }

    @Test
    void shouldReturnYMinusOneWhenYIsOdd() {
        Solution solution = new Solution();
        assertEquals(15, solution.chooseNum(12, 16));
    }

    @Test
    void shouldReturnMinusOneWhenXIsEqualToY() {
        Solution solution = new Solution();
        assertEquals(-1, solution.chooseNum(12, 12));
    }
}
    