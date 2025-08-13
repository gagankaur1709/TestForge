
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
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
    Given two lists operator, and operand. The first list has basic algebra operations, and
    the second list is a list of integers. Use the two given lists to build the algebric
    expression and return the evaluation of this expression.

    The basic algebra operations:
    Addition ( + )
    Subtraction ( - )
    Multiplication ( * )
    Floor division ( / )
    Exponentiation ( ** )

    Example:
    operator["+", "*", "-"]
    array = [2, 3, 4, 5]
    result = 2 + 3 * 4 - 5
    => result = 9

    Note:
        The length of operator list is equal to the length of operand list minus one.
        Operand is a list of of non-negative integers.
        Operator list has at least one operator, and operand list has at least two operands.
     */
    public int doAlgebra(List<String> operator, List<Integer> operand) {

            List<String> ops = new ArrayList<>(operator);
        List<Integer> nums = new ArrayList<>(operand);
        for (int i = ops.size() - 1; i >= 0; i--) {
            if (ops.get(i).equals("**")) {
                nums.set(i, (int) Math.round(Math.pow(nums.get(i), nums.get(i + 1))));
                nums.remove(i + 1);
                ops.remove(i);
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("*")) {
                nums.set(i, nums.get(i) * nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            } else if (ops.get(i).equals("/")) {
                nums.set(i, nums.get(i) / nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("+")) {
                nums.set(i, nums.get(i) + nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            } else if (ops.get(i).equals("-")) {
                nums.set(i, nums.get(i) - nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        return nums.get(0);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_160_humaneval_chain_of_thought_fe54f60b {

    @Test
    void testDoAlgebraHappyPath() {
        Solution solution = new Solution();
        List<String> operator = new ArrayList<>(List.of("+", "*", "-"));
        List<Integer> operand = new ArrayList<>(List.of(2, 3, 4, 5));
        assertEquals(9, solution.doAlgebra(operator, operand));
    }

    @Test
    void testDoAlgebraSingleOperation() {
        Solution solution = new Solution();
        List<String> operator = new ArrayList<>(List.of("+"));
        List<Integer> operand = new ArrayList<>(List.of(2, 3));
        assertEquals(5, solution.doAlgebra(operator, operand));
    }

    @Test
    void testDoAlgebraMultipleOperations() {
        Solution solution = new Solution();
        List<String> operator = new ArrayList<>(List.of("+", "-", "*"));
        List<Integer> operand = new ArrayList<>(List.of(10, 2, 3, 4));
        assertEquals(8, solution.doAlgebra(operator, operand));
    }

    @Test
    void testDoAlgebraExponentiation() {
        Solution solution = new Solution();
        List<String> operator = new ArrayList<>(List.of("**", "+"));
        List<Integer> operand = new ArrayList<>(List.of(2, 3, 4));
        assertEquals(16, solution.doAlgebra(operator, operand));
    }
}
    