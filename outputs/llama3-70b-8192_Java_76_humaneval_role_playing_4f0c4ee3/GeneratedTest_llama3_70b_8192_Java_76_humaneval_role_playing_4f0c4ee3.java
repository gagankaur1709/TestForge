
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
    Your task is to write a function that returns true if a number x is a simple
    power of n and false in other cases.
    x is a simple power of n if n**int=x
    For example:
    isSimplePower(1, 4) => true
    isSimplePower(2, 2) => true
    isSimplePower(8, 2) => true
    isSimplePower(3, 2) => false
    isSimplePower(3, 1) => false
    isSimplePower(5, 3) => false
     */
    public boolean isSimplePower(int x, int n) {

            if (n == 1) {
            return x == 1;
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return power == x;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_76_humaneval_role_playing_4f0c4ee3 {

    @Test
    void should_return_true_when_x_is_a_simple_power_of_n() {
        Solution solution = new Solution();
        assertTrue(solution.isSimplePower(1, 4));
        assertTrue(solution.isSimplePower(2, 2));
        assertTrue(solution.isSimplePower(8, 2));
    }

    @Test
    void should_return_false_when_x_is_not_a_simple_power_of_n() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(3, 2));
        assertFalse(solution.isSimplePower(3, 1));
        assertFalse(solution.isSimplePower(5, 3));
    }

    @Test
    void should_return_true_when_n_is_1_and_x_is_1() {
        Solution solution = new Solution();
        assertTrue(solution.isSimplePower(1, 1));
    }

    @Test
    void should_return_false_when_n_is_1_and_x_is_not_1() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(2, 1));
    }

    @Test
    void should_return_false_when_x_is_0() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(0, 2));
    }

    @Test
    void should_return_false_when_n_is_0() {
        Solution solution = new Solution();
        assertFalse(solution.isSimplePower(2, 0));
    }
}
    